package efeitos;

import javax.swing.JColorChooser;
import AAPerifericos.IPerifericos;
import AAPerifericos.colecaoPerifericos;
import java.util.logging.Level;
import java.util.logging.Logger;

public class efeitoCorSelecionada implements Runnable {

    JColorChooser color;
    public boolean allDone = false;
    colecaoPerifericos listaPerifericos;

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
                for (IPerifericos periferico : listaPerifericos.getPerifericos()) {
                    periferico.setCor(nova);
                    periferico.colorirDispositivo();
                }
            } catch (Exception ex) {

            }
        }
    }

}
