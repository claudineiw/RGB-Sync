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

public abstract class IEfeitos  implements Runnable {

    private colecaoPerifericos listaPerifericos;
    private Color cor;
    public boolean allDone = false;
    private final ArrayList<int[]> cores;
    private int conta = 0;
    private final ArrayList<Thread> ListaTH = new ArrayList<>();
    private final ArrayList<Boolean> chegou = new ArrayList<>();

    public IEfeitos(colecaoPerifericos listaPerifericos, ArrayList<int[]> cores) {
        this.listaPerifericos = listaPerifericos;
        this.cores = cores;
    }

    protected void criarListaChegou() {
        getListaPerifericos().getPerifericos().forEach(_item -> {
            getChegou().add(false);
        });
    }

    protected void trocarCor() {
        if (conta > getCores().size() - 1) {
            conta = 0;
        }
        setCor(new Color(getCores().get(conta)[0], getCores().get(conta)[1], getCores().get(conta)[2]));
        conta++;
    }

    protected void esperar(ArrayList<Boolean> chegou) {
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

    protected void tratarSequenciaThread(ArrayList<Thread> ListaTH, ArrayList<Boolean> chegou) {
        tempoPorVolta tempo = new tempoPorVolta(300);
        iniciarThreads();
        
        while (true) {
            if (allDone) {
                    return;
                }
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

       limparListaThread(tempo);
    }

    protected void iniciarThreads(){             
        for (Thread thread : ListaTH) {
            thread.start();
        }
    }
    
    protected void limparListaThread(tempoPorVolta tempo){
         while (true) {
            if (allDone) {
                    return;
                }
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
    }
    /**
     * @return the listaPerifericos
     */
    protected colecaoPerifericos getListaPerifericos() {
        return listaPerifericos;
    }

    /**
     * @param listaPerifericos the listaPerifericos to set
     */
    protected void setListaPerifericos(colecaoPerifericos listaPerifericos) {
        this.listaPerifericos = listaPerifericos;
    }

    /**
     * @return the cor
     */
    protected Color getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    private void setCor(Color cor) {
        this.cor = cor;
    }

    /**
     * @return the cores
     */
    protected ArrayList<int[]> getCores() {
        return cores;
    }

    /**
     * @return the ListaTH
     */
    protected ArrayList<Thread> getListaTH() {
        return ListaTH;
    }

    /**
     * @return the chegou
     */
    protected ArrayList<Boolean> getChegou() {
        return chegou;
    }

    protected int getConta() {
        return conta;
    }

    protected void setConta(int conta) {
        this.conta = conta;
    }

    protected void chamarMetodosClasse() {
       
        try {
            for (IPerifericos periferico : getListaPerifericos().getPerifericos()) {
                if (allDone) {
                    return;
                }
                if (periferico instanceof IKeyboard) {
                    getListaTH().add(new Thread(() -> colorirTeclado(periferico, getChegou())));
                } else {
                    if (periferico instanceof IMouse) {
                        getListaTH().add(new Thread(() -> colorirMouse(periferico, getChegou())));
                    } else {
                        if (periferico instanceof IHeadSet) {
                            getListaTH().add(new Thread(() -> colorirHeadSet(periferico, getChegou())));
                        } else {
                            if (periferico instanceof IMotherBoard) {
                                getListaTH().add(new Thread(() -> colorirMotherBoard(periferico, getChegou())));
                            } else {
                                if (periferico instanceof IHeadsetStand) {
                                    getListaTH().add(new Thread(() -> colorirHeadsetStand(periferico, getChegou())));
                                } else {
                                    if (periferico instanceof ILightingNode) {
                                        getListaTH().add(new Thread(() -> colorirLightingNode(periferico, getChegou())));
                                    } else {
                                        if (periferico instanceof ICoolerControl) {
                                            getListaTH().add(new Thread(() -> colorirCoolerControl(periferico, getChegou())));

                                        } else {
                                            if (periferico instanceof IMouseMat) {
                                                getListaTH().add(new Thread(() -> colorirMouseMat(periferico, getChegou())));

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
                System.out.println(ex);
            }  
    }

    protected abstract void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou);

    protected abstract void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou);

    protected abstract void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou);

    protected abstract void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou);

    protected abstract void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou);

    protected abstract void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou);

    protected abstract void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou);

    protected abstract void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou);

}
