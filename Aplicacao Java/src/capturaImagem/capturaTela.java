package capturaImagem;

import Metodos.tempoPorVolta;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public final class capturaTela implements Runnable {
    private BufferedImage image;
    public boolean allDone = false;
    private final JLabel lbImagem;

    public capturaTela(JLabel lbImagem) {
        this.lbImagem = lbImagem;
    }

    @Override
    public void run() {
        tempoPorVolta tempo = new tempoPorVolta(500);
        while (!allDone) {
            try {
                tempo.calculo();
                image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                Image img = image.getScaledInstance(lbImagem.getWidth(), lbImagem.getHeight(), BufferedImage.SCALE_SMOOTH);
                image = new BufferedImage(lbImagem.getWidth(), lbImagem.getHeight(), TYPE_INT_ARGB);
                image.getGraphics().drawImage(img, 0, 0, null);
                getLbImagem().setIcon(new javax.swing.ImageIcon(image));
            } catch (AWTException ex) {
                Logger.getLogger(capturaTela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public JLabel getLbImagem() {
        return lbImagem;
    }
}
