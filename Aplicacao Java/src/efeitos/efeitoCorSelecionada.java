package efeitos;

import javax.swing.JColorChooser;
import AAPerifericos.colecaoPerifericos;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        while (!allDone) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(efeitoCorSelecionada.class.getName()).log(Level.SEVERE, null, ex);
            }
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
