/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author Claud
 */
public class capturaTela implements Runnable{
    private BufferedImage image;
    public  boolean allDone = false;   
    JLabel lbImagem;
    public capturaTela(JLabel lbImagem){
        this.lbImagem=lbImagem;           
    }

    @Override
    public void run() {
        while(!allDone){
            
            try {
               image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
         } catch (AWTException ex) {
             Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
         }        
        Image img = image.getScaledInstance(340, 250, BufferedImage.SCALE_SMOOTH);
        image = new BufferedImage(340, 250, TYPE_INT_ARGB);
        image.getGraphics().drawImage(img, 0, 0 , null);        
        lbImagem.setIcon(new javax.swing.ImageIcon(image));
        }
    }
}
