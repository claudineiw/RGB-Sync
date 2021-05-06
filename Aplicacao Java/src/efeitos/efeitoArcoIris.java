package efeitos;

import IPerifericos.IHeadSet;
import IPerifericos.IKeyboard;
import IPerifericos.IMotherBoard;
import IPerifericos.IMouse;
import IPerifericos.IMouseMat;
import IPerifericos.IPerifericos;
import IPerifericos.colecaoPerifericos;
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
        while (!allDone) {
            if (allDone) {
                return;
            }
            try {
                listaPerifericos.getPerifericos().stream().map(periferico -> {
                    if (periferico instanceof IKeyboard) {
                        conta = interacao;
                        colorirTeclado(periferico);
                        if (interacao >= cores.size() - 1) {
                            interacao = 0;
                        } else {
                            interacao++;
                        }

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
                }).map(periferico -> {
                    if (periferico instanceof IMotherBoard) {
                        colorirMotherBoard(periferico);
                    }
                    return periferico;
                }).filter(periferico -> (periferico instanceof IMouseMat)).forEachOrdered(periferico -> {
                    colorirHeadSet(periferico);
                });
            } catch (Exception ex) {

            }

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
        try {
            for (int y = 0; y < 23; y++) {
                trocarCor();
                teclado.setCor(cor);
                for (int[] sequencia : ((IKeyboard) teclado).getTeclas()) {
                    try {
                        ((IKeyboard) teclado).colorirPorTecla(sequencia[y]);
                    } catch (Exception ex) {
                    }
                }

            }
        } catch (Exception ex) {
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
