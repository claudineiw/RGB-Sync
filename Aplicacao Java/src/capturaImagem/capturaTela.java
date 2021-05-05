package capturaImagem;

import efeitos.efeitoPorImagemDaTela;
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
        while (!allDone) {
            try {
                Thread.sleep(500);
                image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            } catch (AWTException ex) {
                Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(capturaTela.class.getName()).log(Level.SEVERE, null, ex);
            }
            Image img = image.getScaledInstance(360, 270, BufferedImage.SCALE_SMOOTH);
            image = new BufferedImage(360, 270, TYPE_INT_ARGB);
            image.getGraphics().drawImage(img, 0, 0, null);
            getLbImagem().setIcon(new javax.swing.ImageIcon(image));
        }
    }

    /**
     * @return the lbImagem
     */
    public JLabel getLbImagem() {
        return lbImagem;
    }
}
