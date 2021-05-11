package efeitos;

import javax.swing.JColorChooser;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;

public final class efeitoCorSelecionada implements Runnable {

    private final JColorChooser color;
    public boolean allDone = false;
    private final colecaoPerifericos listaPerifericos;

    public efeitoCorSelecionada(JColorChooser color, colecaoPerifericos listaPerifericos) {
        this.color = color;
        this.listaPerifericos = listaPerifericos;
    }

    @Override
    public void run() {
        tempoPorVolta tempo = new tempoPorVolta(3000);
        while (!allDone) {
            tempo.calculo();
            java.awt.Color nova = color.getSelectionModel().getSelectedColor();
            try {
                listaPerifericos.getPerifericos().stream().map(periferico -> {
                    periferico.setCor(nova);
                    return periferico;
                }).forEachOrdered(periferico -> {
                    periferico.colorirDispositivo();
                });
            } catch (Exception ex) {

            }      
        }
    }

}
