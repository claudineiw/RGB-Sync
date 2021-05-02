package efeitos;

import java.awt.Color;
import AAPerifericos.IPerifericos;
import AAPerifericos.colecaoPerifericos;

public class efeitoStrobol implements Runnable {

    private colecaoPerifericos listaPerifericos;
    public boolean allDone = false;

    public efeitoStrobol(colecaoPerifericos listaPerifericos) {
        this.listaPerifericos = listaPerifericos;
    }

    @Override
    public void run() {
        while (!allDone) {
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

            if (allDone) {
                return;
            }

        }
    }

}
