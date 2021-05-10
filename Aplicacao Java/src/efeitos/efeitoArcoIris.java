package efeitos;

import IPerifericos.ICoolerControl;
import IPerifericos.IHeadSet;
import IPerifericos.IHeadsetStand;
import IPerifericos.IKeyboard;
import IPerifericos.ILightingNode;
import IPerifericos.IMotherBoard;
import IPerifericos.IMouse;
import IPerifericos.IMouseMat;
import IPerifericos.IPerifericos;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;
import java.awt.Color;
import java.util.ArrayList;

public final class efeitoArcoIris implements Runnable {

    private final colecaoPerifericos listaPerifericos;
    public boolean allDone = false;
    private final ArrayList<int[]> cores;
    private int conta = 0;
    private int interacao = 0;
    private Color cor;

    public efeitoArcoIris(colecaoPerifericos listaPerifericos, ArrayList<int[]> cores) {
        this.listaPerifericos = listaPerifericos;
        this.cores = cores;
        trocarCor();
    }

    @Override
    public void run() {
        tempoPorVolta tempo = new tempoPorVolta(250);
        while (!allDone) {
            tempo.calculo();
            try {
                for (IPerifericos periferico : listaPerifericos.getPerifericos()) {
                    if (allDone) {
                        return;
                    }
                    if (periferico instanceof IKeyboard) {
                        conta = interacao;
                        colorirTeclado(periferico);
                        if (interacao >= cores.size() - 1) {
                            interacao = 0;
                        } else {
                            interacao++;
                        }

                    } else {

                        if (periferico instanceof IMouse) {
                            colorirMouse(periferico);
                        } else {

                            if (periferico instanceof IHeadSet) {
                                colorirHeadSet(periferico);
                            } else {
                                if (periferico instanceof IMotherBoard) {
                                    colorirMotherBoard(periferico);
                                } else {
                                    if (periferico instanceof IHeadsetStand) {
                                        colorirHeadsetStand(periferico);
                                    } else {
                                        if (periferico instanceof ILightingNode) {
                                            colorirLightingNode(periferico);
                                        } else {
                                            if (periferico instanceof ICoolerControl) {
                                                colorirCoolerControl(periferico);

                                            } else {
                                                if (periferico instanceof IMouseMat) {
                                                    colorirMouseMat(periferico);

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception ex) {

            }
            tempo.calculo();
        }
    }

    private void colorirMotherBoard(IPerifericos motherBoard) {
        motherBoard.setCor(cor);
        for (int i = 0; i < ((IMotherBoard) motherBoard).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                motherBoard.setCor(cor);
            }
            ((IMotherBoard) motherBoard).colorirPorLed(i);

        }
    }

    private void colorirTeclado(IPerifericos teclado) {
        for (int y = 0; y < 25; y++) {
            trocarCor();
            teclado.setCor(cor);
            for (int[] sequencia : ((IKeyboard) teclado).getTeclas()) {
                if (y < sequencia.length) {
                    ((IKeyboard) teclado).colorirPorTecla(sequencia[y]);
                }

            }
        }

    }

    private void colorirMouse(IPerifericos mouse) {
        mouse.setCor(cor);
        mouse.colorirDispositivo();
    }

    private void colorirHeadSet(IPerifericos headSet) {
        headSet.setCor(cor);
        headSet.colorirDispositivo();
    }

    private void colorirMouseMat(IPerifericos mouseMat) {
        mouseMat.setCor(cor);
        for (int i = 0; i < ((IMouseMat) mouseMat).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                mouseMat.setCor(cor);
            }
            ((IMouseMat) mouseMat).colorirPorLed(i);
        }
    }

    private void colorirHeadsetStand(IPerifericos HeadsetStand) {
        HeadsetStand.setCor(cor);
        for (int i = 0; i < ((IHeadsetStand) HeadsetStand).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                HeadsetStand.setCor(cor);
            }
            ((IHeadsetStand) HeadsetStand).colorirPorLed(i);
        }
    }

    private void colorirLightingNode(IPerifericos LightingNode) {
        LightingNode.setCor(cor);
        for (int i = 0; i < ((ILightingNode) LightingNode).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                LightingNode.setCor(cor);
            }
            ((ILightingNode) LightingNode).colorirPorLed(i);
        }
    }

    private void colorirCoolerControl(IPerifericos CoolerControl) {
        CoolerControl.setCor(cor);
        for (int i = 0; i < ((ICoolerControl) CoolerControl).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                CoolerControl.setCor(cor);
            }
            ((ICoolerControl) CoolerControl).colorirPorLed(i);
        }
    }

    private void trocarCor() {
        if (conta > cores.size() - 1) {
            conta = 0;
        }
        cor = new Color(cores.get(conta)[0], cores.get(conta)[1], cores.get(conta)[2]);
        conta++;
    }

}
