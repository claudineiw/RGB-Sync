package efeitos;

import IPerifericos.IKeyboard;
import IPerifericos.IPerifericos;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.TargetDataLine;
import java.awt.Color;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.LineUnavailableException;

public final class efeitoMusica extends IEfeitos {

    private int frameSize = 2;
    private final Mixer.Info dispositivoSelecionado;
    private TargetDataLine targetDataLine;
    private AudioFormat format;
    private int rmsGlobal = 0;
    private int rmsDireita = 0;
    private int rmsEsquerda = 0;
    private Color corTeclado;

    public efeitoMusica(colecaoPerifericos listaPerifericos, ArrayList<Color> cores, Mixer.Info dispositivoSelecionado) {
        super(listaPerifericos, cores);
        this.dispositivoSelecionado = dispositivoSelecionado;
    }

    @Override
    public void run() {
        efeitoAudioTrocarCor();
    }

    private void iniciarLine() throws LineUnavailableException {
        Mixer mixer = AudioSystem.getMixer(dispositivoSelecionado);
        Line.Info[] lineInfo = mixer.getTargetLineInfo();
        Line.Info selectedInfo = null;
        for (Line.Info selecionada : lineInfo) {
            selectedInfo = selecionada;
        }
        
        targetDataLine = (TargetDataLine) mixer.getLine(selectedInfo);
        format = targetDataLine.getFormat();
        frameSize = format.getFrameSize();
        targetDataLine.open(format, frameSize);
        targetDataLine.flush();
        targetDataLine.start();

    }

    private void efeitoAudioTrocarCor() {
        try {
            iniciarLine();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(efeitoMusica.class.getName()).log(Level.SEVERE, null, ex);
        }
        tempoPorVolta tempo = new tempoPorVolta(0);
        while (!allDone) {
            escutarMusica(tempo);
        }
        targetDataLine.stop();
    }

    private void escutarMusica(tempoPorVolta tempo) {
        byte[] buf = new byte[frameSize];
        float[] Chanel1 = new float[frameSize / format.getChannels()];
        int b = targetDataLine.read(buf, 0, buf.length);

        if (allDone) {
            targetDataLine.stop();
            return;
        }

        for (int i = 0, s = 0; i < b;) {
            int sample = 0;
            sample |= buf[i++] & 0xFF;
            sample |= buf[i++] << 8;
            Chanel1[s++] = sample / 32768f;
        }

        if (format.getChannels() == 2) {
            float RMSch1 = Chanel1[0] * Chanel1[0];
            float RMSch2 = Chanel1[1] * Chanel1[1];
            RMSch1 = (float) Math.sqrt(RMSch1 / Chanel1.length);
            RMSch2 = (float) Math.sqrt(RMSch2 / Chanel1.length);

            rmsEsquerda = (Math.round(Math.abs(RMSch1) * (500 - 2)));
            rmsDireita = (Math.round(Math.abs(RMSch2) * (500 - 2)));

            rmsGlobal = rmsDireita + rmsEsquerda;

            if (rmsGlobal > 255) {
                rmsGlobal = 255;
            }
            chamadaMetodosColorir(tempo);
        } else {
            if (format.getChannels() == 1) {
                float RMSch1 = Chanel1[0] * Chanel1[0];
                RMSch1 = (float) Math.sqrt(RMSch1 / Chanel1.length);
                rmsEsquerda = (Math.round(Math.abs(RMSch1) * (500 - 2)));
                rmsDireita = (Math.round(Math.abs(RMSch1) * (500 - 2)));
                rmsGlobal = rmsDireita + rmsEsquerda;
            }
        }

    }

    private void chamadaMetodosColorir(tempoPorVolta tempo) {
        trocarCorSelecionada();
        corTeclado = new Color(getCor().getRGB());
        reduzirBrilhoCor(rmsGlobal);
        chamarMetodosClasse();
        iniciarThreads();
        limparListaThread(tempo);
    }

    private void reduzirBrilhoCor(double rmsApli) {
        Color cor = getCor();
        double red = cor.getRed();
        double green = cor.getGreen();
        double blue = cor.getBlue();
        red = (red / 255) * rmsApli;
        green = (green / 255) * rmsApli;
        blue = (blue / 255) * rmsApli;

        int r = new Double(red).intValue();
        int g = new Double(green).intValue();
        int b = new Double(blue).intValue();
        setCor(new Color(r, g, b));

    }

    @Override
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou, int pos) {
        motherBoard.setCor(getCor());
        motherBoard.colorirDispositivo();
    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou, int pos) {
        int[][] matrix = matrixAudio(teclado);
        int[][] teclas = ((IKeyboard) teclado).getTeclas();
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if (matrix[i][y] == 0) {
                    teclado.setCor(Color.BLACK);
                    ((IKeyboard) teclado).colorirPorTecla(teclas[i][y]);
                }
                if (matrix[i][y] == 1) {
                    teclado.setCor(corTeclado);
                    ((IKeyboard) teclado).colorirPorTecla(teclas[i][y]);
                }
            }
        }
    }

    @Override
    protected void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou, int pos) {
        Mouse.setCor(getCor());
        Mouse.colorirDispositivo();
    }

    @Override
    protected void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou, int pos) {
        HeadSet.setCor(getCor());
        HeadSet.colorirDispositivo();
    }

    @Override
    protected void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou, int pos) {
        MouseMat.setCor(getCor());
        MouseMat.colorirDispositivo();
    }

    @Override
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou, int pos) {
        HeadsetStand.setCor(getCor());
        HeadsetStand.colorirDispositivo();
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou, int pos) {
        LightingNode.setCor(getCor());
        LightingNode.colorirDispositivo();
    }

    @Override
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou, int pos) {
        CoolerControl.setCor(getCor());
        CoolerControl.colorirDispositivo();
    }

    private int[][] matrixAudio(IPerifericos teclado) {
        int[][] matrix = new int[((IKeyboard) teclado).getTeclas().length][((IKeyboard) teclado).getTeclas()[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if (y >= (matrix[i].length / 2) - 1) {
                    matrix = direitaRec(i, y, matrix, 22, 150);
                } else {
                    matrix = esquerdaRec(i, y, matrix, 0, 150);
                }
            }

        }

        return matrix;
    }

    private int[][] direitaRec(int i, int y, int[][] matrix, int cordenada, int rms) {
        if (rmsDireita > rms) {
            return direita(i, y, matrix, cordenada);
        } else {
            return direitaRec(i, y, matrix, cordenada - 1, rms - 10);
        }

    }

    private int[][] esquerdaRec(int i, int y, int[][] matrix, int cordenada, int rms) {
        if (rmsDireita > rms) {
            return esquerda(i, y, matrix, cordenada);
        } else {
            return esquerdaRec(i, y, matrix, cordenada + 1, rms - 10);
        }

    }

    private int[][] direita(int i, int y, int[][] matrix, int cordenada) {
        if (matrix.length == 6) {
            if (i == 2 || i == 3) {
                if (y <= cordenada) {
                    matrix[i][y] = 1;
                } else {
                    matrix[i][y] = 0;
                }

            } else {
                if (i == 1 || i == 4) {
                    if (y <= cordenada + 1) {
                        matrix[i][y] = 1;
                    } else {
                        matrix[i][y] = 0;
                    }
                } else {
                    if (i == 0 || i == 5) {
                        if (y <= cordenada + 2) {
                            matrix[i][y] = 1;
                        } else {
                            matrix[i][y] = 0;
                        }

                    }
                }
            }
        } else {
            if (matrix.length > 6) {
                if (i == 3 || i == 4) {
                    if (y <= cordenada) {
                        matrix[i][y] = 1;
                    } else {
                        matrix[i][y] = 0;
                    }

                } else {
                    if (i == 1 || i == 2 || i == 5 || i == 6) {
                        if (y <= cordenada + 1) {
                            matrix[i][y] = 1;
                        } else {
                            matrix[i][y] = 0;
                        }
                    } else {
                        if (i == 0 || i == 7) {
                            if (y <= cordenada + 2) {
                                matrix[i][y] = 1;
                            } else {
                                matrix[i][y] = 0;
                            }

                        }
                    }
                }
            }
        }
        return matrix;
    }

    private int[][] esquerda(int i, int y, int[][] matrix, int cordenada) {
        if (matrix.length == 6) {
            if (i == 2 || i == 3) {
                if (y >= cordenada) {
                    matrix[i][y] = 1;
                } else {
                    matrix[i][y] = 0;
                }

            } else {
                if (i == 1 || i == 4) {
                    if (y - 1 >= cordenada) {
                        matrix[i][y] = 1;
                    } else {
                        matrix[i][y] = 0;
                    }
                } else {
                    if (i == 0 || i == 5) {
                        if (y - 2 >= cordenada) {
                            matrix[i][y] = 1;
                        } else {
                            matrix[i][y] = 0;
                        }

                    }
                }
            }
        } else {
            if (matrix.length > 6) {
                if (i == 3 || i == 4) {
                    if (y >= cordenada) {
                        matrix[i][y] = 1;
                    } else {
                        matrix[i][y] = 0;
                    }

                } else {
                    if (i == 1 || i == 2 || i == 5 || i == 6) {
                        if (y - 1 >= cordenada) {
                            matrix[i][y] = 1;
                        } else {
                            matrix[i][y] = 0;
                        }
                    } else {
                        if (i == 0 || i == 7) {
                            if (y - 2 >= cordenada) {
                                matrix[i][y] = 1;
                            } else {
                                matrix[i][y] = 0;
                            }

                        }
                    }
                }
            }
        }
        return matrix;
    }

}
