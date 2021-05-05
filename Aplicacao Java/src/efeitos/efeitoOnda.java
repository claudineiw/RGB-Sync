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
        while (!allDone) {
            trocarCor();

            if (allDone) {
                return;
            }
            try {
                listaPerifericos.getPerifericos().stream().map(periferico -> {
                    if (periferico instanceof IKeyboard) {
                        colorirTeclado(periferico);
                    }
                    return periferico;
                }).map(periferico -> {
                    if (periferico instanceof IMouse) {
                        colorirMouse(periferico);
                    }
                    return periferico;
                }).map(periferico -> {
                    if (periferico instanceof IHeadSet) {
                        colorirHeadSet(periferico);
                    }
                    return periferico;
                }).filter(periferico -> (periferico instanceof IMotherBoard)).forEachOrdered(periferico -> {
                    colorirMotherBoard(periferico);
                });
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

    private void colorirTeclado(IPerifericos teclado) {
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

    private void trocarCor() {
        if (conta > cores.size() - 1) {
            conta = 0;
        }
        cor = new Color(cores.get(conta)[0], cores.get(conta)[1], cores.get(conta)[2]);
        conta++;
    }

}
