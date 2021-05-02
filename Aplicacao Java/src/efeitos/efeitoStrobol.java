package efeitos;

import java.awt.Color;
import AAPerifericos.IPerifericos;
import AAPerifericos.colecaoPerifericos;

public final class efeitoStrobol implements Runnable {

    private colecaoPerifericos listaPerifericos;
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
                for (IPerifericos periferico : listaPerifericos.getPerifericos()) {
                    periferico.setCor(new Color((int) (Math.random() * 0x1000000)));
                    periferico.colorirDispositivo();
                }
            } catch (Exception ex) {
               
            }

        }
    }

}
