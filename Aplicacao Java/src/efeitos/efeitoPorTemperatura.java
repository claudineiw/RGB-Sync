package efeitos;

import javax.swing.JLabel;
import IPerifericos.IPerifericos;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;

public final class efeitoPorTemperatura implements Runnable {

    private final colecaoPerifericos listaPerifericos;
    public boolean allDone = false;
    private final JLabel temp1;
    private final JLabel temp2;
    private final JLabel temp3;
    private final JLabel temp4;
    private final JLabel temperatura;
    private final int vtemp1;
    private final int vtemp2;
    private final int vtemp3;
    private final int vtemp4;

    public efeitoPorTemperatura(colecaoPerifericos listaPerifericos, JLabel temp1, JLabel temp2, JLabel temp3, JLabel temp4, JLabel temperatura, int vtemp1, int vtemp2, int vtemp3, int vtemp4) {
        this.temp1 = temp1;
        this.temp2 = temp2;
        this.temp3 = temp3;
        this.temp4 = temp4;
        this.vtemp1 = vtemp1;
        this.vtemp2 = vtemp2;
        this.vtemp3 = vtemp3;
        this.vtemp4 = vtemp4;
        this.temperatura = temperatura;
        this.listaPerifericos = listaPerifericos;
    }

    @Override
    public void run() {
        java.awt.Color nova;
        tempoPorVolta tempo = new tempoPorVolta(1000);
        while (!allDone) {
            tempo.calculo();
            int temperaturaLocal = Integer.valueOf(temperatura.getText());
            if (temperaturaLocal < vtemp1) {
                nova = temp1.getForeground();
            } else if (temperaturaLocal >= vtemp1 && temperaturaLocal < vtemp2) {
                nova = temp1.getForeground();
            } else if (temperaturaLocal >= vtemp2 && temperaturaLocal < vtemp3) {
                nova = temp2.getForeground();
            } else if (temperaturaLocal >= vtemp3 && temperaturaLocal < vtemp4) {
                nova = temp3.getForeground();
            } else {
                nova = temp4.getForeground();
            }
            try {
                for (IPerifericos periferico : listaPerifericos.getPerifericos()) {
                    periferico.setCor(nova);
                    periferico.colorirDispositivo();
                }
            } catch (Exception ex) {

            }
            tempo.calculo();
        }
    }
}
