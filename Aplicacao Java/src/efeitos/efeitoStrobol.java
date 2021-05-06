package efeitos;

import java.awt.Color;
import IPerifericos.colecaoPerifericos;

public final class efeitoStrobol implements Runnable {

    private final colecaoPerifericos listaPerifericos;
    public boolean allDone = false;

    public efeitoStrobol(colecaoPerifericos listaPerifericos) {
        this.listaPerifericos = listaPerifericos;
    }

    @Override
    public void run() {
        while (!allDone) {
            
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
              
            }
            
            if (allDone) {
                return;
            }
            try {
                listaPerifericos.getPerifericos().stream().map(periferico -> {
                    periferico.setCor(new Color((int) (Math.random() * 0x1000000)));
                    return periferico;
                }).forEachOrdered(periferico -> {
                    periferico.colorirDispositivo();
                });
            } catch (Exception ex) {
               
            }

        }
    }

}
