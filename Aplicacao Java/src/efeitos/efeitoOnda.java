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

public final class efeitoOnda implements Runnable {

    private final colecaoPerifericos listaPerifericos;
    private Color cor;
    public boolean allDone = false;
    private final ArrayList<int[]> cores;
    private int conta = 0;

    public efeitoOnda(colecaoPerifericos listaPerifericos, ArrayList<int[]> cores) {
        this.listaPerifericos = listaPerifericos;
        this.cores = cores;
    }

    @Override
    public void run() {
        tempoPorVolta tempo = new tempoPorVolta(1000);
        while (!allDone) {
            tempo.calculo();
            trocarCor();
            try {
                for (IPerifericos periferico : listaPerifericos.getPerifericos()) {
                    if (allDone) {
                        return;
                    }
                    if (periferico instanceof IKeyboard) {
                        colorirTeclado(periferico);
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
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((IMotherBoard) motherBoard).getCountLight(); i++) {
            tempo.calculo();
            ((IMotherBoard) motherBoard).colorirPorLed(i);
            tempo.calculo();
        }

    }

    private void colorirTeclado(IPerifericos teclado) {
        tempoPorVolta tempo = new tempoPorVolta(1000);
        int[][] listaBotoes = ((IKeyboard) teclado).getTeclas();
        for (int i = listaBotoes.length - 1; i >= 0; i--) {
            tempo.calculo();
            for (int y = 0; y < listaBotoes[i].length; y++) {
                if (allDone) {
                    return;
                }
                teclado.setCor(cor);
                ((IKeyboard) teclado).colorirPorTecla(listaBotoes[i][y]);

            }
            tempo.calculo();
        }
    }

    private void colorirMouse(IPerifericos Mouse) {
        Mouse.setCor(cor);
        Mouse.colorirDispositivo();
    }

    private void colorirHeadSet(IPerifericos HeadSet) {
        HeadSet.setCor(cor);
        HeadSet.colorirDispositivo();
    }

    private void colorirMouseMat(IPerifericos MouseMat) {
        MouseMat.setCor(cor);
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((IMouseMat) MouseMat).getCountLight(); i++) {
            tempo.calculo();
            ((IMouseMat) MouseMat).colorirPorLed(i);
            tempo.calculo();
        }
    }

    private void colorirHeadsetStand(IPerifericos HeadsetStand) {
        HeadsetStand.setCor(cor);
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((IHeadsetStand) HeadsetStand).getCountLight(); i++) {
            tempo.calculo();
            ((IHeadsetStand) HeadsetStand).colorirPorLed(i);
            tempo.calculo();
        }
    }

    private void colorirLightingNode(IPerifericos LightingNode) {
        LightingNode.setCor(cor);
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((ILightingNode) LightingNode).getCountLight(); i++) {
            tempo.calculo();
            ((ILightingNode) LightingNode).colorirPorLed(i);
            tempo.calculo();
        }
    }

    private void colorirCoolerControl(IPerifericos CoolerControl) {
        CoolerControl.setCor(cor);
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((ICoolerControl) CoolerControl).getCountLight(); i++) {
            tempo.calculo();
            ((ICoolerControl) CoolerControl).colorirPorLed(i);
            tempo.calculo();
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
