package efeitos;

import AAPerifericos.IHeadSet;
import AAPerifericos.IKeyboard;
import AAPerifericos.IMotherBoard;
import AAPerifericos.IMouse;
import AAPerifericos.IPerifericos;
import AAPerifericos.colecaoPerifericos;
import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class efeitoOnda implements Runnable {

    colecaoPerifericos listaPerifericos;
    Color cor;
    public boolean allDone = false;
    ArrayList<int[]> cores;
    int conta = 0;

    public efeitoOnda(colecaoPerifericos listaPerifericos, ArrayList<int[]> cores) {
        this.listaPerifericos = listaPerifericos;
        this.cores = cores;
    }

    @Override
    public void run() {
        while (!allDone) {
            trocarCor();

            if (allDone) {
                return;
            }
            try {
                for (IPerifericos periferico : listaPerifericos.getPerifericos()) {
                    if (periferico instanceof IKeyboard) {
                        colorirTeclado(periferico);
                    }

                    if (periferico instanceof IMouse) {
                        colorirMouse(periferico);
                    }

                    if (periferico instanceof IHeadSet) {
                        colorirHeadSet(periferico);
                    }

                    if (periferico instanceof IMotherBoard) {
                        colorirMotherBoard(periferico);
                    }
                }
            } catch (Exception ex) {

            }

            if (allDone) {
                return;
            }

        }
    }

    private void colorirMotherBoard(IPerifericos motherBoard) {
        motherBoard.setCor(cor);
        for (int i = 0; i < ((IMotherBoard) motherBoard).getCountLight(); i++) {
            ((IMotherBoard) motherBoard).colorirPorLed(i);
        }

    }

    public void colorirTeclado(IPerifericos teclado) {
        int[][] listaBotoes = ((IKeyboard) teclado).getTeclas();
        for (int i = listaBotoes.length - 1; i >= 0; i--) {
            try {
                for (int y = 0; y < listaBotoes[i].length; y++) {
                    if (allDone) {
                        return;
                    }
                    teclado.setCor(cor);
                    try {
                        ((IKeyboard) teclado).colorirPorTecla(listaBotoes[i][y]);
                    } catch (Exception ex) {
                        Logger.getLogger(efeitoOnda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(efeitoOnda.class.getName()).log(Level.SEVERE, null, ex);
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

    public void trocarCor() {
        if (conta > cores.size() - 1) {
            conta = 0;
        }
        cor = new Color(cores.get(conta)[0], cores.get(conta)[1], cores.get(conta)[2]);
        conta++;
    }

}
