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

public class efeitoPassagem implements Runnable {

    private final colecaoPerifericos listaPerifericos;
    private Color cor;
    public boolean allDone = false;
    private final ArrayList<int[]> cores;
    private int conta = 0;
    private final ArrayList<Thread> ListaTH = new ArrayList<>();
    private final ArrayList<Boolean> chegou = new ArrayList<>();
    public boolean meio = true;

    public efeitoPassagem(colecaoPerifericos listaPerifericos, ArrayList<int[]> cores) {
        this.listaPerifericos = listaPerifericos;
        this.cores = cores;
    }

    @Override
    public void run() {
        tempoPorVolta tempo = new tempoPorVolta(1000);
        while (!allDone) {

            listaPerifericos.getPerifericos().forEach(_item -> {
                chegou.add(false);
            });
            
            trocarCor();
            try {
                for (IPerifericos periferico : listaPerifericos.getPerifericos()) {
                    if (allDone) {
                        return;
                    }
                    if (periferico instanceof IKeyboard) {                
                        ListaTH.add(new Thread(() -> colorirTeclado(periferico, chegou)));               
                    } else {
                        if (periferico instanceof IMouse) {
                            ListaTH.add(new Thread(() -> colorirMouse(periferico, chegou)));
                        } else {
                            if (periferico instanceof IHeadSet) {
                                ListaTH.add(new Thread(() -> colorirHeadSet(periferico, chegou)));
                            } else {
                                if (periferico instanceof IMotherBoard) {
                                    ListaTH.add(new Thread(() -> colorirMotherBoard(periferico, chegou)));  
                                } else {
                                    if (periferico instanceof IHeadsetStand) {
                                        ListaTH.add(new Thread(() -> colorirHeadsetStand(periferico, chegou)));
                                    } else {
                                        if (periferico instanceof ILightingNode) {
                                            ListaTH.add(new Thread(() -> colorirLightingNode(periferico, chegou)));                                             
                                        } else {
                                            if (periferico instanceof ICoolerControl) {
                                                ListaTH.add(new Thread(() -> colorirCoolerControl(periferico, chegou))); 
                                             

                                            } else {
                                                if (periferico instanceof IMouseMat) {
                                                    ListaTH.add(new Thread(() -> colorirMouseMat(periferico, chegou)));                                                    

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                for (Thread thread : ListaTH) {
                    thread.start();
                }

                while (true) {
                    tempo.calculo();
                    String continua = "";
                    for (Boolean che : chegou) {
                        continua += che.toString();
                    }
                    if (!continua.contains("false")) {
                        break;
                    }
                }
                
                trocarCor();

                for (int i = 0; i < chegou.size(); i++) {
                    chegou.set(i, false);
                }

                chegou.clear();

                while (true) {
                    tempo.calculo();
                    String continua = "";
                    for (Thread thread : ListaTH) {
                        if (thread.isAlive()) {
                            continua += "true";
                        } else {
                            continua += "false";
                        }
                    }
                    if (!continua.contains("true")) {
                        break;
                    }
                }

                ListaTH.clear();

            } catch (Exception ex) {
                System.out.println(ex);
            }           
        }
    }

    private void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou) {
        tempoPorVolta tempo = new tempoPorVolta(5);
        motherBoard.setCor(cor);
        for (int i = 0; i < ((IMotherBoard) motherBoard).getCountLight(); i++) {
            tempo.calculo();
            ((IMotherBoard) motherBoard).colorirPorLed(i);
            tempo.calculo();
        }

        esperar(chegou);

        motherBoard.setCor(cor);
        for (int i = ((IMotherBoard) motherBoard).getCountLight() - 1; i >= 0; i--) {
            tempo.calculo();
            ((IMotherBoard) motherBoard).colorirPorLed(i);
            tempo.calculo();
        }

    }

    private void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou) {
        teclado.setCor(cor);
        tempoPorVolta tempo = new tempoPorVolta(100);
        for (int y = 0; y < 25; y++) {
            tempo.calculo();
            for (int[] sequencia : ((IKeyboard) teclado).getTeclas()) {
                if (y < sequencia.length) {
                    ((IKeyboard) teclado).colorirPorTecla(sequencia[y]);
                }

            }
            tempo.calculo();
        }

        esperar(chegou);

        teclado.setCor(cor);
        for (int y = 25; y >= 0; y--) {
            tempo.calculo();
            for (int[] sequencia : ((IKeyboard) teclado).getTeclas()) {
                if (y < sequencia.length) {
                    ((IKeyboard) teclado).colorirPorTecla(sequencia[y]);
                }

            }
            tempo.calculo();
        }

    }

    private void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou) {
        Mouse.setCor(cor);
        Mouse.colorirDispositivo();
        esperar(chegou);

    }

    private void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou) {

        HeadSet.setCor(cor);
        HeadSet.colorirDispositivo();

        esperar(chegou);

    }

    private void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou) {

        tempoPorVolta tempo = new tempoPorVolta(150);
        MouseMat.setCor(cor);
        for (int i = 0; i < ((IMouseMat) MouseMat).getCountLight(); i++) {
            tempo.calculo();
            ((IMouseMat) MouseMat).colorirPorLed(i);
            tempo.calculo();
        }

        esperar(chegou);

        MouseMat.setCor(cor);
        for (int i = ((IMouseMat) MouseMat).getCountLight() - 1; i >= 0; i--) {
            tempo.calculo();
            ((IMouseMat) MouseMat).colorirPorLed(i);
            tempo.calculo();
        }
    }

    private void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou) {

        HeadsetStand.setCor(cor);
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((IHeadsetStand) HeadsetStand).getCountLight(); i++) {
            tempo.calculo();
            ((IHeadsetStand) HeadsetStand).colorirPorLed(i);
            tempo.calculo();
        }

        esperar(chegou);

        HeadsetStand.setCor(cor);
        for (int i = ((IHeadsetStand) HeadsetStand).getCountLight() - 1; i >= 0; i--) {
            tempo.calculo();
            ((IHeadsetStand) HeadsetStand).colorirPorLed(i);
            tempo.calculo();
        }
    }

    private void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou) {
        tempoPorVolta tempo = new tempoPorVolta(50);

        LightingNode.setCor(cor);
        for (int i = 0; i < ((ILightingNode) LightingNode).getCountLight(); i++) {
            tempo.calculo();
            ((ILightingNode) LightingNode).colorirPorLed(i);
            tempo.calculo();
        }

        esperar(chegou);

        LightingNode.setCor(cor);
        for (int i = ((ILightingNode) LightingNode).getCountLight() - 1; i >= 0; i--) {
            tempo.calculo();
            ((ILightingNode) LightingNode).colorirPorLed(i);
            tempo.calculo();
        }
    }

    private void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou) {
        CoolerControl.setCor(cor);
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((ICoolerControl) CoolerControl).getCountLight(); i++) {
            tempo.calculo();
            ((ICoolerControl) CoolerControl).colorirPorLed(i);
            tempo.calculo();
        }

        esperar(chegou);

        CoolerControl.setCor(cor);
        for (int i = ((ICoolerControl) CoolerControl).getCountLight() - 1; i >= 0; i--) {
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

    private void esperar(ArrayList<Boolean> chegou) {
        tempoPorVolta esperar = new tempoPorVolta(2000);
        for (int i = 0; i < chegou.size(); i++) {
            if (!chegou.get(i)) {
                chegou.set(i, true);
                break;
            }
        }
        while (true) {
            esperar.calculo();
            String continua = "";
            try {
                for (Boolean che : chegou) {
                    continua += che.toString();
                }
            } catch (Exception ex) {

            }
            if (!continua.contains("true")) {
                break;
            }
        }
    }

}
