package efeitos;

import IPerifericos.IPerifericos;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.TargetDataLine;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;
import java.util.ArrayList;
import javax.sound.sampled.AudioFormat;

public final class efeitoMusica extends IEfeitos {

    private final Mixer.Info dispositivoSelecionado;
    private TargetDataLine targetDataLine;

    public efeitoMusica(colecaoPerifericos listaPerifericos, ArrayList<Color> cores, Mixer.Info dispositivoSelecionado) {
        super(listaPerifericos, cores);
        this.dispositivoSelecionado = dispositivoSelecionado;
    }

    @Override
    public void run() {   
       efeitoAudioTrocarCor();

    }

    private void iniciarLine() {
        AudioFormat fmt = new AudioFormat(44100f, 16, 1, true, false);
        Mixer mixer = AudioSystem.getMixer(dispositivoSelecionado);
        Line.Info[] lineInfo = mixer.getTargetLineInfo();
        Line.Info selectedInfo = null;
        for (Line.Info print : lineInfo) {
            selectedInfo = print;
        }
        try {
            targetDataLine = (TargetDataLine) mixer.getLine(selectedInfo);
            targetDataLine.open(fmt, 100);
        } catch (Exception e) {
        }
        targetDataLine.flush();
        targetDataLine.start();

    }

    private void efeitoAudioTrocarCor(){
        iniciarLine();
        tempoPorVolta tempo = new tempoPorVolta(0);
        while (!allDone) {
            escutarMusica(tempo);
        }
        targetDataLine.stop();

    }

    private void escutarMusica(tempoPorVolta tempo) {
        final int bufferByteSize = 100;
        byte[] buf = new byte[bufferByteSize];
        float[] samples = new float[bufferByteSize / 2];
        for (int b; (b = targetDataLine.read(buf, 0, buf.length)) > -1;) {
            if (allDone) {
                targetDataLine.stop();
                return;
            }
            float lastPeak = 0f;
            for (int i = 0, s = 0; i < b;) {
                int sample = 0;

                sample |= buf[i++] & 0xFF;
                sample |= buf[i++] << 8;

                samples[s++] = sample / 32768f;
            }

            float rms = 0f;
            float peak = 0f;
            for (float sample : samples) {
                float abs = Math.abs(sample);
                if (abs > peak) {
                    peak = abs;
                }
                rms += sample * sample;
            }

            rms = (float) Math.sqrt(rms / samples.length);
            if (lastPeak > peak) {
                peak = lastPeak * 0.875f;
            }
            lastPeak = peak;
            int rmsApli = (Math.round(Math.abs(rms) * (2400 - 2)));
            if (rmsApli > 255) {
                rmsApli = 255;
            }

            chamadaMetodosColorir(rmsApli, tempo);

        }
    }

    private void chamadaMetodosColorir(int rmsApli, tempoPorVolta tempo) {
        trocarCorSelecionada();
        reduzirBrilhoCor(rmsApli);
        chamarMetodosClasse();
        iniciarThreads();
        limparListaThread(tempo);
    }

    private void reduzirBrilhoCor(double rmsApli) {
        Color cor = getCor();
        double red = cor.getRed();
        double green = cor.getGreen();
        double blue = cor.getBlue();        
        red = (red/ 255) * rmsApli;
        green =(green/ 255) * rmsApli;
        blue = (blue/ 255) * rmsApli;
        
        int r = new Double(red).intValue();
        int g = new Double(green).intValue();
        int b = new Double(blue).intValue();

        setCor(new Color(r,g,b));

    }

    @Override
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou) {
        motherBoard.setCor(getCor());
        motherBoard.colorirDispositivo();
    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou) {
        teclado.setCor(getCor());
        teclado.colorirDispositivo();
    }

    @Override
    protected void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou
    ) {
        Mouse.setCor(getCor());
        Mouse.colorirDispositivo();
    }

    @Override
    protected void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou
    ) {
        HeadSet.setCor(getCor());
        HeadSet.colorirDispositivo();
    }

    @Override
    protected void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou
    ) {
        MouseMat.setCor(getCor());
        MouseMat.colorirDispositivo();
    }

    @Override
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou
    ) {
        HeadsetStand.setCor(getCor());
        HeadsetStand.colorirDispositivo();
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou
    ) {
        LightingNode.setCor(getCor());
        LightingNode.colorirDispositivo();
    }

    @Override
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou
    ) {
        CoolerControl.setCor(getCor());
        CoolerControl.colorirDispositivo();
    }

}
