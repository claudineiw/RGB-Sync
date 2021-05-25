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
import javax.sound.sampled.AudioFormat;

public final class efeitoMusica extends IEfeitos {

    private final Mixer.Info dispositivoSelecionado;
    private TargetDataLine targetDataLine;
    private int rmsGlobal = 0;
    private Color corTeclado;
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
        for (Line.Info selecionada : lineInfo) {
            selectedInfo = selecionada;
        }
        try {
            targetDataLine = (TargetDataLine) mixer.getLine(selectedInfo);
            targetDataLine.open(fmt, 2);
        } catch (Exception e) {
        }
        targetDataLine.flush();
        targetDataLine.start();

    }

    private void efeitoAudioTrocarCor() {
        iniciarLine();
        tempoPorVolta tempo = new tempoPorVolta(0);
        while (!allDone) {
            escutarMusica(tempo);
        }
        targetDataLine.stop();

    }

    private void escutarMusica(tempoPorVolta tempo) {
        final int bufferByteSize = 2;
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
            rmsGlobal = (Math.round(Math.abs(rms) * (500 - 2)));
            if (rmsGlobal > 255) {
                rmsGlobal = 255;
            }
            chamadaMetodosColorir(tempo);

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
        int[][] matrix = new int[6][23];
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if (rmsGlobal > 250) {
                    if (i == 2 || i == 3) {
                        matrix[i][y] = 1;
                    } else {
                        if (i == 1 || i == 4) {
                            if (y <= 21) {
                                matrix[i][y] = 1;
                            } else {
                                matrix[i][y] = 0;
                            }

                        } else {
                            if (i == 0 || i == 5) {
                                if (y <= 20) {
                                    matrix[i][y] = 1;
                                } else {
                                    matrix[i][y] = 0;
                                }

                            }
                        }
                    }
                } else {
                    if (rmsGlobal > 240) {
                        if (i == 2 || i == 3) {
                            if (y <= 21) {
                                matrix[i][y] = 1;
                            } else {
                                matrix[i][y] = 0;
                            }

                        } else {
                            if (i == 1 || i == 4) {
                                if (y <= 20) {
                                    matrix[i][y] = 1;
                                } else {
                                    matrix[i][y] = 0;
                                }

                            } else {
                                if (i == 0 || i == 5) {
                                    if (y <= 19) {
                                        matrix[i][y] = 1;
                                    } else {
                                        matrix[i][y] = 0;
                                    }

                                }
                            }
                        }
                    } else {
                        if (rmsGlobal > 230) {
                            if (i == 2 || i == 3) {
                                if (y <= 20) {
                                    matrix[i][y] = 1;
                                } else {
                                    matrix[i][y] = 0;
                                }

                            } else {
                                if (i == 1 || i == 4) {
                                    if (y <= 19) {
                                        matrix[i][y] = 1;
                                    } else {
                                        matrix[i][y] = 0;
                                    }

                                } else {
                                    if (i == 0 || i == 5) {
                                        if (y <= 18) {
                                            matrix[i][y] = 1;
                                        } else {
                                            matrix[i][y] = 0;
                                        }

                                    }
                                }
                            }
                        } else {
                            if (rmsGlobal > 220) {
                                if (i == 2 || i == 3) {
                                    if (y <= 19) {
                                        matrix[i][y] = 1;
                                    } else {
                                        matrix[i][y] = 0;
                                    }

                                } else {
                                    if (i == 1 || i == 4) {
                                        if (y <= 18) {
                                            matrix[i][y] = 1;
                                        } else {
                                            matrix[i][y] = 0;
                                        }

                                    } else {
                                        if (i == 0 || i == 5) {
                                            if (y <= 17) {
                                                matrix[i][y] = 1;
                                            } else {
                                                matrix[i][y] = 0;
                                            }

                                        }
                                    }
                                }
                            } else {
                                if (rmsGlobal > 210) {
                                    if (i == 2 || i == 3) {
                                        if (y <= 18) {
                                            matrix[i][y] = 1;
                                        } else {
                                            matrix[i][y] = 0;
                                        }

                                    } else {
                                        if (i == 1 || i == 4) {
                                            if (y <= 17) {
                                                matrix[i][y] = 1;
                                            } else {
                                                matrix[i][y] = 0;
                                            }

                                        } else {
                                            if (i == 0 || i == 5) {
                                                if (y <= 16) {
                                                    matrix[i][y] = 1;
                                                } else {
                                                    matrix[i][y] = 0;
                                                }

                                            }
                                        }
                                    }
                                } else {
                                    if (rmsGlobal > 210) {
                                        if (i == 2 || i == 3) {
                                            if (y <= 17) {
                                                matrix[i][y] = 1;
                                            } else {
                                                matrix[i][y] = 0;
                                            }

                                        } else {
                                            if (i == 1 || i == 4) {
                                                if (y <= 16) {
                                                    matrix[i][y] = 1;
                                                } else {
                                                    matrix[i][y] = 0;
                                                }

                                            } else {
                                                if (i == 0 || i == 5) {
                                                    if (y <= 15) {
                                                        matrix[i][y] = 1;
                                                    } else {
                                                        matrix[i][y] = 0;
                                                    }

                                                }
                                            }
                                        }
                                    } else {
                                        if (rmsGlobal > 200) {
                                            if (i == 2 || i == 3) {
                                                if (y <= 16) {
                                                    matrix[i][y] = 1;
                                                } else {
                                                    matrix[i][y] = 0;
                                                }

                                            } else {
                                                if (i == 1 || i == 4) {
                                                    if (y <= 15) {
                                                        matrix[i][y] = 1;
                                                    } else {
                                                        matrix[i][y] = 0;
                                                    }

                                                } else {
                                                    if (i == 0 || i == 5) {
                                                        if (y <= 14) {
                                                            matrix[i][y] = 1;
                                                        } else {
                                                            matrix[i][y] = 0;
                                                        }

                                                    }
                                                }
                                            }
                                        } else {
                                            if (rmsGlobal > 190) {
                                                if (i == 2 || i == 3) {
                                                    if (y <= 15) {
                                                        matrix[i][y] = 1;
                                                    } else {
                                                        matrix[i][y] = 0;
                                                    }

                                                } else {
                                                    if (i == 1 || i == 4) {
                                                        if (y <= 14) {
                                                            matrix[i][y] = 1;
                                                        } else {
                                                            matrix[i][y] = 0;
                                                        }

                                                    } else {
                                                        if (i == 0 || i == 5) {
                                                            if (y <= 13) {
                                                                matrix[i][y] = 1;
                                                            } else {
                                                                matrix[i][y] = 0;
                                                            }

                                                        }
                                                    }
                                                }
                                            } else {
                                                if (rmsGlobal > 180) {
                                                    if (i == 2 || i == 3) {
                                                        if (y <= 14) {
                                                            matrix[i][y] = 1;
                                                        } else {
                                                            matrix[i][y] = 0;
                                                        }

                                                    } else {
                                                        if (i == 1 || i == 4) {
                                                            if (y <= 13) {
                                                                matrix[i][y] = 1;
                                                            } else {
                                                                matrix[i][y] = 0;
                                                            }

                                                        } else {
                                                            if (i == 0 || i == 5) {
                                                                if (y <= 12) {
                                                                    matrix[i][y] = 1;
                                                                } else {
                                                                    matrix[i][y] = 0;
                                                                }

                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (rmsGlobal > 170) {
                                                        if (i == 2 || i == 3) {
                                                            if (y <= 13) {
                                                                matrix[i][y] = 1;
                                                            } else {
                                                                matrix[i][y] = 0;
                                                            }

                                                        } else {
                                                            if (i == 1 || i == 4) {
                                                                if (y <= 12) {
                                                                    matrix[i][y] = 1;
                                                                } else {
                                                                    matrix[i][y] = 0;
                                                                }

                                                            } else {
                                                                if (i == 0 || i == 5) {
                                                                    if (y <= 11) {
                                                                        matrix[i][y] = 1;
                                                                    } else {
                                                                        matrix[i][y] = 0;
                                                                    }

                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (rmsGlobal > 160) {
                                                            if (i == 2 || i == 3) {
                                                                if (y <= 12) {
                                                                    matrix[i][y] = 1;
                                                                } else {
                                                                    matrix[i][y] = 0;
                                                                }

                                                            } else {
                                                                if (i == 1 || i == 4) {
                                                                    if (y <= 11) {
                                                                        matrix[i][y] = 1;
                                                                    } else {
                                                                        matrix[i][y] = 0;
                                                                    }

                                                                } else {
                                                                    if (i == 0 || i == 5) {
                                                                        if (y <= 10) {
                                                                            matrix[i][y] = 1;
                                                                        } else {
                                                                            matrix[i][y] = 0;
                                                                        }

                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (rmsGlobal > 150) {
                                                                if (i == 2 || i == 3) {
                                                                    if (y <= 11) {
                                                                        matrix[i][y] = 1;
                                                                    } else {
                                                                        matrix[i][y] = 0;
                                                                    }

                                                                } else {
                                                                    if (i == 1 || i == 4) {
                                                                        if (y <= 10) {
                                                                            matrix[i][y] = 1;
                                                                        } else {
                                                                            matrix[i][y] = 0;
                                                                        }

                                                                    } else {
                                                                        if (i == 0 || i == 5) {
                                                                            if (y <= 9) {
                                                                                matrix[i][y] = 1;
                                                                            } else {
                                                                                matrix[i][y] = 0;
                                                                            }

                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (rmsGlobal > 140) {
                                                                    if (i == 2 || i == 3) {
                                                                        if (y <= 10) {
                                                                            matrix[i][y] = 1;
                                                                        } else {
                                                                            matrix[i][y] = 0;
                                                                        }

                                                                    } else {
                                                                        if (i == 1 || i == 4) {
                                                                            if (y <= 9) {
                                                                                matrix[i][y] = 1;
                                                                            } else {
                                                                                matrix[i][y] = 0;
                                                                            }

                                                                        } else {
                                                                            if (i == 0 || i == 5) {
                                                                                if (y <= 8) {
                                                                                    matrix[i][y] = 1;
                                                                                } else {
                                                                                    matrix[i][y] = 0;
                                                                                }

                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (rmsGlobal > 130) {
                                                                        if (i == 2 || i == 3) {
                                                                            if (y <= 9) {
                                                                                matrix[i][y] = 1;
                                                                            } else {
                                                                                matrix[i][y] = 0;
                                                                            }

                                                                        } else {
                                                                            if (i == 1 || i == 4) {
                                                                                if (y <= 8) {
                                                                                    matrix[i][y] = 1;
                                                                                } else {
                                                                                    matrix[i][y] = 0;
                                                                                }

                                                                            } else {
                                                                                if (i == 0 || i == 5) {
                                                                                    if (y <= 7) {
                                                                                        matrix[i][y] = 1;
                                                                                    } else {
                                                                                        matrix[i][y] = 0;
                                                                                    }

                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (rmsGlobal > 120) {
                                                                            if (i == 2 || i == 3) {
                                                                                if (y <= 8) {
                                                                                    matrix[i][y] = 1;
                                                                                } else {
                                                                                    matrix[i][y] = 0;
                                                                                }

                                                                            } else {
                                                                                if (i == 1 || i == 4) {
                                                                                    if (y <= 7) {
                                                                                        matrix[i][y] = 1;
                                                                                    } else {
                                                                                        matrix[i][y] = 0;
                                                                                    }

                                                                                } else {
                                                                                    if (i == 0 || i == 5) {
                                                                                        if (y <= 6) {
                                                                                            matrix[i][y] = 1;
                                                                                        } else {
                                                                                            matrix[i][y] = 0;
                                                                                        }

                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (rmsGlobal > 110) {
                                                                                if (i == 2 || i == 3) {
                                                                                    if (y <= 7) {
                                                                                        matrix[i][y] = 1;
                                                                                    } else {
                                                                                        matrix[i][y] = 0;
                                                                                    }

                                                                                } else {
                                                                                    if (i == 1 || i == 4) {
                                                                                        if (y <= 6) {
                                                                                            matrix[i][y] = 1;
                                                                                        } else {
                                                                                            matrix[i][y] = 0;
                                                                                        }

                                                                                    } else {
                                                                                        if (i == 0 || i == 5) {
                                                                                            if (y <= 5) {
                                                                                                matrix[i][y] = 1;
                                                                                            } else {
                                                                                                matrix[i][y] = 0;
                                                                                            }

                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (rmsGlobal > 100) {
                                                                                    if (i == 2 || i == 3) {
                                                                                        if (y <= 6) {
                                                                                            matrix[i][y] = 1;
                                                                                        } else {
                                                                                            matrix[i][y] = 0;
                                                                                        }

                                                                                    } else {
                                                                                        if (i == 1 || i == 4) {
                                                                                            if (y <= 5) {
                                                                                                matrix[i][y] = 1;
                                                                                            } else {
                                                                                                matrix[i][y] = 0;
                                                                                            }

                                                                                        } else {
                                                                                            if (i == 0 || i == 5) {
                                                                                                if (y <= 4) {
                                                                                                    matrix[i][y] = 1;
                                                                                                } else {
                                                                                                    matrix[i][y] = 0;
                                                                                                }

                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (rmsGlobal > 90) {
                                                                                    if (i == 2 || i == 3) {
                                                                                        if (y <= 5) {
                                                                                            matrix[i][y] = 1;
                                                                                        } else {
                                                                                            matrix[i][y] = 0;
                                                                                        }

                                                                                    } else {
                                                                                        if (i == 1 || i == 4) {
                                                                                            if (y <= 4) {
                                                                                                matrix[i][y] = 1;
                                                                                            } else {
                                                                                                matrix[i][y] = 0;
                                                                                            }

                                                                                        } else {
                                                                                            if (i == 0 || i == 5) {
                                                                                                if (y <= 3) {
                                                                                                    matrix[i][y] = 1;
                                                                                                } else {
                                                                                                    matrix[i][y] = 0;
                                                                                                }

                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (rmsGlobal > 80) {
                                                                                        if (i == 2 || i == 3) {
                                                                                            if (y <= 4) {
                                                                                                matrix[i][y] = 1;
                                                                                            } else {
                                                                                                matrix[i][y] = 0;
                                                                                            }

                                                                                        } else {
                                                                                            if (i == 1 || i == 4) {
                                                                                                if (y <= 3) {
                                                                                                    matrix[i][y] = 1;
                                                                                                } else {
                                                                                                    matrix[i][y] = 0;
                                                                                                }

                                                                                            } else {
                                                                                                if (i == 0 || i == 5) {
                                                                                                    if (y <= 2) {
                                                                                                        matrix[i][y] = 1;
                                                                                                    } else {
                                                                                                        matrix[i][y] = 0;
                                                                                                    }

                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (rmsGlobal > 70) {
                                                                                            if (i == 2 || i == 3) {
                                                                                                if (y <= 3) {
                                                                                                    matrix[i][y] = 1;
                                                                                                } else {
                                                                                                    matrix[i][y] = 0;
                                                                                                }

                                                                                            } else {
                                                                                                if (i == 1 || i == 4) {
                                                                                                    if (y <= 2) {
                                                                                                        matrix[i][y] = 1;
                                                                                                    } else {
                                                                                                        matrix[i][y] = 0;
                                                                                                    }

                                                                                                } else {
                                                                                                    if (i == 0 || i == 5) {
                                                                                                        if (y <= 1) {
                                                                                                            matrix[i][y] = 1;
                                                                                                        } else {
                                                                                                            matrix[i][y] = 0;
                                                                                                        }

                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            if (rmsGlobal > 60) {
                                                                                                if (i == 2 || i == 3) {
                                                                                                    if (y <= 2) {
                                                                                                        matrix[i][y] = 1;
                                                                                                    } else {
                                                                                                        matrix[i][y] = 0;
                                                                                                    }

                                                                                                } else {
                                                                                                    if (i == 1 || i == 4) {
                                                                                                        if (y <= 1) {
                                                                                                            matrix[i][y] = 1;
                                                                                                        } else {
                                                                                                            matrix[i][y] = 0;
                                                                                                        }

                                                                                                    } else {
                                                                                                        if (i == 0 || i == 5) {
                                                                                                            if (y <= 0) {
                                                                                                                matrix[i][y] = 1;
                                                                                                            } else {
                                                                                                                matrix[i][y] = 0;
                                                                                                            }

                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                if (rmsGlobal > 50) {
                                                                                                    if (i == 2 || i == 3) {
                                                                                                        if (y <= 1) {
                                                                                                            matrix[i][y] = 1;
                                                                                                        } else {
                                                                                                            matrix[i][y] = 0;
                                                                                                        }

                                                                                                    } else {
                                                                                                        if (i == 1 || i == 4) {
                                                                                                            if (y <= 0) {
                                                                                                                matrix[i][y] = 1;
                                                                                                            } else {
                                                                                                                matrix[i][y] = 0;
                                                                                                            }

                                                                                                        } else {
                                                                                                            if (i == 0 || i == 5) {
                                                                                                                if (y <= -1) {
                                                                                                                    matrix[i][y] = 1;
                                                                                                                } else {
                                                                                                                    matrix[i][y] = 0;
                                                                                                                }

                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (rmsGlobal > 40) {
                                                                                                        if (i == 2 || i == 3) {
                                                                                                            if (y <= 0) {
                                                                                                                matrix[i][y] = 1;
                                                                                                            } else {
                                                                                                                matrix[i][y] = 0;
                                                                                                            }

                                                                                                        } else {
                                                                                                            if (i == 1 || i == 4) {
                                                                                                                if (y <= -1) {
                                                                                                                    matrix[i][y] = 1;
                                                                                                                } else {
                                                                                                                    matrix[i][y] = 0;
                                                                                                                }

                                                                                                            } else {
                                                                                                                if (i == 0 || i == 5) {
                                                                                                                    if (y <= -1) {
                                                                                                                        matrix[i][y] = 1;
                                                                                                                    } else {
                                                                                                                        matrix[i][y] = 0;
                                                                                                                    }

                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (rmsGlobal > 30) {
                                                                                                            if (i == 2 || i == 3) {
                                                                                                                if (y <= -1) {
                                                                                                                    matrix[i][y] = 1;
                                                                                                                } else {
                                                                                                                    matrix[i][y] = 0;
                                                                                                                }

                                                                                                            } else {
                                                                                                                if (i == 1 || i == 4) {
                                                                                                                    if (y <= -1) {
                                                                                                                        matrix[i][y] = 1;
                                                                                                                    } else {
                                                                                                                        matrix[i][y] = 0;
                                                                                                                    }

                                                                                                                } else {
                                                                                                                    if (i == 0 || i == 5) {
                                                                                                                        if (y <= -1) {
                                                                                                                            matrix[i][y] = 1;
                                                                                                                        } else {
                                                                                                                            matrix[i][y] = 0;
                                                                                                                        }

                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (rmsGlobal > 20) {
                                                                                                                if (i == 2 || i == 3) {
                                                                                                                    if (y <= -1) {
                                                                                                                        matrix[i][y] = 1;
                                                                                                                    } else {
                                                                                                                        matrix[i][y] = 0;
                                                                                                                    }

                                                                                                                } else {
                                                                                                                    if (i == 1 || i == 4) {
                                                                                                                        if (y <= -1) {
                                                                                                                            matrix[i][y] = 1;
                                                                                                                        } else {
                                                                                                                            matrix[i][y] = 0;
                                                                                                                        }

                                                                                                                    } else {
                                                                                                                        if (i == 0 || i == 5) {
                                                                                                                            if (y <= -1) {
                                                                                                                                matrix[i][y] = 1;
                                                                                                                            } else {
                                                                                                                                matrix[i][y] = 0;
                                                                                                                            }

                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (rmsGlobal > 10) {
                                                                                                                    if (i == 2 || i == 3) {
                                                                                                                        if (y <= -1) {
                                                                                                                            matrix[i][y] = 1;
                                                                                                                        } else {
                                                                                                                            matrix[i][y] = 0;
                                                                                                                        }

                                                                                                                    } else {
                                                                                                                        if (i == 1 || i == 4) {
                                                                                                                            if (y <= -1) {
                                                                                                                                matrix[i][y] = 1;
                                                                                                                            } else {
                                                                                                                                matrix[i][y] = 0;
                                                                                                                            }

                                                                                                                        } else {
                                                                                                                            if (i == 0 || i == 5) {
                                                                                                                                if (y <= -1) {
                                                                                                                                    matrix[i][y] = 1;
                                                                                                                                } else {
                                                                                                                                    matrix[i][y] = 0;
                                                                                                                                }

                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (rmsGlobal > 5) {
                                                                                                                        if (i == 2 || i == 3) {
                                                                                                                            if (y <= -1) {
                                                                                                                                matrix[i][y] = 1;
                                                                                                                            } else {
                                                                                                                                matrix[i][y] = 0;
                                                                                                                            }

                                                                                                                        } else {
                                                                                                                            if (i == 1 || i == 4) {
                                                                                                                                if (y <= -1) {
                                                                                                                                    matrix[i][y] = 1;
                                                                                                                                } else {
                                                                                                                                    matrix[i][y] = 0;
                                                                                                                                }

                                                                                                                            } else {
                                                                                                                                if (i == 0 || i == 5) {
                                                                                                                                    if (y <= -1) {
                                                                                                                                        matrix[i][y] = 1;
                                                                                                                                    } else {
                                                                                                                                        matrix[i][y] = 0;
                                                                                                                                    }

                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return matrix;
    }

}
