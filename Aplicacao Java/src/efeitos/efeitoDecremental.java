package efeitos;

import javax.swing.JColorChooser;
import IPerifericos.IPerifericos;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;

public final class efeitoDecremental implements Runnable {

    private final colecaoPerifericos listaPerifericos;
    private final JColorChooser color;
    public boolean allDone = false;

    public efeitoDecremental(JColorChooser color, colecaoPerifericos listaPerifericos) {
        this.color = color;
        this.listaPerifericos = listaPerifericos;
    }

    @Override
    public void run() {
        tempoPorVolta tempo = new tempoPorVolta(500);
        java.awt.Color nova = color.getSelectionModel().getSelectedColor();
        while (!allDone) {
            tempo.calculo();
            if (allDone) {
                return;
            }
            try {
                for (IPerifericos periferico : listaPerifericos.getPerifericos()) {
                    periferico.setCor(nova);
                    periferico.colorirDispositivo();
                }
            } catch (Exception ex) {

            }
            if (nova.getGreen() <= 30 && nova.getBlue() <= 30 && nova.getRed() <= 30) {
                nova = color.getSelectionModel().getSelectedColor();
            } else {
                nova = nova.darker();
            }

            tempo.calculo();
        }

    }
}
