package efeitos;

import java.awt.Color;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;

public final class efeitoStrobol implements Runnable {

    private final colecaoPerifericos listaPerifericos;
    public boolean allDone = false;

    public efeitoStrobol(colecaoPerifericos listaPerifericos) {
        this.listaPerifericos = listaPerifericos;
    }

    @Override
    public void run() {
        tempoPorVolta tempo = new tempoPorVolta(250);

        while (!allDone) {
            tempo.calculo();
            try {
                listaPerifericos.getPerifericos().stream().map(periferico -> {
                    periferico.setCor(new Color((int) (Math.random() * 0x1000000)));
                    return periferico;
                }).forEachOrdered(periferico -> {
                    if (allDone) {
                        return;
                    }
                    periferico.colorirDispositivo();
                });
            } catch (Exception ex) {

            }
            tempo.calculo();
        }
    }

}
