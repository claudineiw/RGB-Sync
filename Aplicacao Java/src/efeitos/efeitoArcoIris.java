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
import java.util.ArrayList;

public final class efeitoArcoIris extends IEfeitos implements Runnable {
    private int interacao = 0;

    public efeitoArcoIris(colecaoPerifericos listaPerifericos, ArrayList<int[]> cores) {
        super(listaPerifericos,cores);        
    }

    @Override
    public void run() {
        trocarCor();
        tempoPorVolta tempo = new tempoPorVolta(250);
        while (!allDone) {
            tempo.calculo();
            try {
                for (IPerifericos periferico : getListaPerifericos().getPerifericos()) {
                    if (allDone) {
                        return;
                    }
                    if (periferico instanceof IKeyboard) {
                        setConta(interacao);
                        colorirTeclado(periferico);
                        if (interacao >= getCores().size() - 1) {
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
        motherBoard.setCor(getCor());
        for (int i = 0; i < ((IMotherBoard) motherBoard).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                motherBoard.setCor(getCor());
            }
            ((IMotherBoard) motherBoard).colorirPorLed(i);

        }
    }

    private void colorirTeclado(IPerifericos teclado) {
        for (int y = 0; y < 25; y++) {
            trocarCor();
            teclado.setCor(getCor());
            for (int[] sequencia : ((IKeyboard) teclado).getTeclas()) {
                if (y < sequencia.length) {
                    ((IKeyboard) teclado).colorirPorTecla(sequencia[y]);
                }

            }
        }

    }

    private void colorirMouse(IPerifericos mouse) {
        mouse.setCor(getCor());
        mouse.colorirDispositivo();
    }

    private void colorirHeadSet(IPerifericos headSet) {
        headSet.setCor(getCor());
        headSet.colorirDispositivo();
    }

    private void colorirMouseMat(IPerifericos mouseMat) {
        mouseMat.setCor(getCor());
        for (int i = 0; i < ((IMouseMat) mouseMat).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                mouseMat.setCor(getCor());
            }
            ((IMouseMat) mouseMat).colorirPorLed(i);
        }
    }

    private void colorirHeadsetStand(IPerifericos HeadsetStand) {
        HeadsetStand.setCor(getCor());
        for (int i = 0; i < ((IHeadsetStand) HeadsetStand).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                HeadsetStand.setCor(getCor());
            }
            ((IHeadsetStand) HeadsetStand).colorirPorLed(i);
        }
    }

    private void colorirLightingNode(IPerifericos LightingNode) {
        LightingNode.setCor(getCor());
        for (int i = 0; i < ((ILightingNode) LightingNode).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                LightingNode.setCor(getCor());
            }
            ((ILightingNode) LightingNode).colorirPorLed(i);
        }
    }

    private void colorirCoolerControl(IPerifericos CoolerControl) {
        CoolerControl.setCor(getCor());
        for (int i = 0; i < ((ICoolerControl) CoolerControl).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                CoolerControl.setCor(getCor());
            }
            ((ICoolerControl) CoolerControl).colorirPorLed(i);
        }
    }   

    @Override
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
