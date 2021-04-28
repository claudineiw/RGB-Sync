package efeitos;

import Logitech.Teclado;
import sound.Note;
import sound.Sound;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.sound.midi.Sequence;
import javax.sound.midi.Track;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.transform.DftNormalization;
import org.apache.commons.math3.transform.FastFourierTransformer;
import org.apache.commons.math3.transform.TransformType;

public class efeitoMusica implements Runnable{
	
	private static final FastFourierTransformer FFT = new FastFourierTransformer(DftNormalization.STANDARD);
	private static final long TIMESLICE = 50; // milissegundos
	private static final double THRESHOLD = 0.8; // percentual
	private static final TransformType FFT_TRANSFORM_TYPE = TransformType.FORWARD;
	private static final float MIDI_SEQUENCE_DIVISION_TYPE = Sequence.PPQ;
	private static final int MIDI_SEQUENCE_RESOLUTION = 1;
	private static final int MIDI_CHANNEL = 0;
	private static final int MIDI_EVENT_VELOCITY = 127;
   
	private static Sequence newSequence() {
		Sequence sequence = null;
		try {
			sequence = new Sequence(efeitoMusica.MIDI_SEQUENCE_DIVISION_TYPE, efeitoMusica.MIDI_SEQUENCE_RESOLUTION);
		} catch (Exception e) {
		}
		return sequence;
	}

	private static int getByteArrayLength(AudioFormat audioFormat) {
		
		double seconds = efeitoMusica.TIMESLICE/1000.0;
		float frameRate = audioFormat.getFrameRate();
		int frameSize = audioFormat.getFrameSize();
		
		int byteArrayLenth = (int) (seconds * frameRate * frameSize * 1.0);
		
		if ((byteArrayLenth % 2) != 0) {
			byteArrayLenth--;
		}
		
		return  byteArrayLenth;
		
	}

	private static byte[] readByteArray(AudioInputStream audioInputStream, byte[] byteArray) throws Exception {
		
		int readResult = audioInputStream.read(byteArray);
		
		if (readResult == -1) {
			return null;
		}
		
		if (readResult < byteArray.length) {
			if ((readResult % 2) != 0) {
				readResult--;
			}
			byte[] auxArray = new byte[readResult];
			System.arraycopy(byteArray, 0, auxArray, 0, readResult);
			byteArray = auxArray;
		}
		
		return byteArray;
		
	}
	
	private static double[] getAmplitudeArray(AudioInputStream audioInputStream, byte[] byteArray) throws Exception {
		
		int byteArrayLength = byteArray.length;
		int amplitudeLength = byteArrayLength/2;
		
		boolean isPowerOfTwo = ((amplitudeLength & (amplitudeLength - 1)) == 0);
		
		if (!isPowerOfTwo) {
			// previous power of two
			amplitudeLength = (int)Math.pow(2, Math.floor((Math.log(amplitudeLength)/Math.log(2))));
		}
		         
		double[] amplitudeArray = new double[amplitudeLength];
		
		boolean bigEndian = audioInputStream.getFormat().isBigEndian();
		int channels = audioInputStream.getFormat().getChannels();
		
		int index = 0;
		for (int i = 0; i < byteArrayLength && index < amplitudeLength; i += 2, index++) {
			
			byte first = byteArray[i];
			byte second = byteArray[i + 1];
			
			byte low = bigEndian ? second : first;
			byte high = bigEndian ? first : second;
			
			double amplitude = (low & 0xFF | high << 8) / 32767.0;
			
			amplitudeArray[index] = amplitude;
			
			if (channels > 1) {
				i += channels;
			}
			
		}
		
		return amplitudeArray;
	}
	
	private static double[][] getFrequencyMatrix(AudioInputStream audioInputStream, double[] amplitudeArray) {
		
		Complex[] fftArray = efeitoMusica.FFT.transform(amplitudeArray, efeitoMusica.FFT_TRANSFORM_TYPE);
		
		int fftArrayLength = fftArray.length;
		
		int iterationCount = fftArrayLength/2;
		
		double[][] frequencyMatrix = new double[iterationCount][2];
		
		double sampleRate = audioInputStream.getFormat().getSampleRate();
		
		for (int i = 0; i < iterationCount; i++) {
			
			double frequency = 1.0 * i * (sampleRate / fftArrayLength);
			double magnitude = (2.0/fftArrayLength) * Math.hypot(fftArray[i].getReal(), fftArray[i].getImaginary());			
			frequencyMatrix[i][0] = frequency;
			frequencyMatrix[i][1] = magnitude;
			
		}
		
		return frequencyMatrix;
	}
	
	private static Set<Sound> getSoundList(double[][] frequencyMatrix) {
		
		double[] maxFrequency = new double[2];
		
		for (double[] frequency : frequencyMatrix) {
			if (frequency[0] == 0) {
				continue;
			}
			if (maxFrequency[1] >= frequency[1]) {
				continue;
			}                       
			if (frequency[0] < Note.C.getFirstFrequency()) {
				continue;
			}
			maxFrequency = frequency;
		}
		
		Set<Sound> soundList = new HashSet<>();
		
		for (double[] frequency : frequencyMatrix) {
			if (frequency[0] == 0) {
				continue;
			}
			if (frequency[1] < (maxFrequency[1]*efeitoMusica.THRESHOLD)) {
				continue;
			}
			if (frequency[0] < Note.C.getFirstFrequency()) {
				continue;
			}
			soundList.add(new Sound(frequency[0]));
		}
		
		return soundList;
	}
        private  TargetDataLine line;
        private  AuraSDK AsusAura;
        public boolean allDone = false;        
        public  efeitoMusica(AuraSDK AsusAura){
            this.AsusAura=AsusAura;
        }
        @Override
        public void run(){    
            AsusAura.setAllColors(new AsusColor(255, 0,0));
            Teclado tecladoLogitech = new Teclado("803","100", Color.red);
            tecladoLogitech.setCor(Color.red);
            tecladoLogitech.colorirTudo();
            AudioFormat format = getAudioFormat();
            
            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
            for(Mixer.Info in: AudioSystem.getMixerInfo()){
                if(in.getName().contains("CABLE Output") && !in.getName().contains("Port")){
                       for(Line.Info linha:      AudioSystem.getMixer(in).getTargetLineInfo()){
                           info=(DataLine.Info) linha;
                       }                     
                }
               
            }
            try {
                line = (TargetDataLine) AudioSystem.getLine(info);
               
            } catch (LineUnavailableException ex) {
                Logger.getLogger(efeitoMusica.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                line.open(format);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(efeitoMusica.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            line.start();
            
            AudioInputStream audioInputStream = new AudioInputStream(line);
            AudioFormat audioFormat = format;
            
            int byteArrayLength = efeitoMusica.getByteArrayLength(audioFormat);
            byte[] byteArray = new byte[byteArrayLength];
            try {
                byteArray = efeitoMusica.readByteArray(audioInputStream, byteArray);
            } catch (Exception ex) {
                Logger.getLogger(efeitoMusica.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            long time = efeitoMusica.TIMESLICE;
            Sequence sequence = efeitoMusica.newSequence();
            Track track = sequence.createTrack();
            Map<Long, Set<Sound>> soundMap = new HashMap<>();
            while (byteArray != null) {
                if (allDone) {
                    line.close();
                    return;
                }
                try{
                    Random gerador = new Random();
                    double[] amplitudeArray = efeitoMusica.getAmplitudeArray(audioInputStream, byteArray);
                    double[][] frequencyMatrix = efeitoMusica.getFrequencyMatrix(audioInputStream, amplitudeArray);
                    if(byteArray[0]!=0 && byteArray[0]!=-1 && byteArray[0]!=1){
                        soundMap.put(time, efeitoMusica.getSoundList(frequencyMatrix));
                        
                        Double num = new Double(((((Note.valor/100)+1)-((Note.valor/100)*2))*255));
                        Integer porcentagem= num.intValue();
                        
                        double redD=((double)gerador.nextInt(porcentagem)/255)*porcentagem;
                        double greenD=((double)gerador.nextInt(porcentagem)/255)*porcentagem;
                        double blueD=((double)gerador.nextInt(porcentagem)/255)*porcentagem;
                        int red = new Double(redD).intValue();
                        int green = new Double(greenD).intValue();
                        int blue = new Double(blueD).intValue();     
        
                        AsusAura.setAllColors(new AsusColor(red,0,0));
                        tecladoLogitech.setCor(new Color(red,0,0));
                        tecladoLogitech.colorirTudo();                       
                    }
                    
                    byteArray = this.readByteArray(audioInputStream, byteArray);
                }catch(Exception ex){
                    
                }
                
            }
            
        }
        AudioFormat getAudioFormat() {
            float sampleRate = 48000;
            int sampleSizeInBits = 16;
            int channels = 2;
            boolean signed = true;
            boolean bigEndian = true;
            AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
                    channels, signed, bigEndian);
            return format;
        }
}
