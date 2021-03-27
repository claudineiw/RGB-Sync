/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgb;

import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.Color;
import com.logitech.gaming.LogiLED;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_RGB;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


/**
 *
 * @author Claud
 */
public class efeitoPorImagemDaTela implements Runnable{
        AuraSDK AsusAura;  
        BufferedImage image;
        int largura;
        int altura;
        int[] dataBuffInt;
        int[][] matrix;
        boolean allDone = false;   
        int [][] botao;
        java.awt.Color colorJava;
        Color colorAsus;
        botoesLogitech botoes;
        
        public efeitoPorImagemDaTela(AuraSDK AsusAura){
        this.AsusAura=AsusAura;           
    }
        public void run(){ 
        botoes = new botoesLogitech();
        botao =botoes.getBotoes();  
        while(!allDone){
        if (allDone) {                    
                    return;
                } 
         try {
             image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
             // ImageIO.write(image, "png", new File("d:\\screenshot.png"));
             //URL url = RGB.class.getResource("/imagens/rgb.png");
             //BufferedImage image = ImageIO.read(url);
         } catch (AWTException ex) {
             Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        Image img = image.getScaledInstance(50, 25, BufferedImage.SCALE_SMOOTH);
        image = new BufferedImage(75, 35, TYPE_INT_RGB);
        image.getGraphics().drawImage(img, 0, 0 , null);
        image  = image.getSubimage((int)image.getWidth()/4,(int)image.getHeight()/2,image.getWidth()/2, image.getHeight() / 2);        
       // image = image.getSubimage(0,(int)image.getHeight()/2,image.getWidth(), image.getHeight() / 2);
            try {
                ImageIO.write(image, "png", new File("d:\\screenshot.png"));
            } catch (IOException ex) {
                Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
            }
        largura = image.getWidth();
        altura = image.getHeight();
        dataBuffInt = image.getRGB(0, 0, largura, altura, null, 0, largura);
        
        matrix = new int[altura][largura];
        int index=0;
        for(int i=0;i<altura;i++){
            for(int y=0;y<largura;y++){
                matrix[i][y]=dataBuffInt[index];                
                index++;
            }
        }
      
        for(int i=0;i<botao.length;i++){
            for(int y=0;y<botao[i].length;y++){
                if (allDone) {                    
                    return;
                }             
                colorJava = new java.awt.Color(matrix[i][y]);
                //System.out.println(colorJava.getRed()+"/"+colorJava.getGreen()+"/"+colorJava.getBlue());
                colorAsus = new Color(colorJava.getRed(),colorJava.getGreen(),colorJava.getBlue());
                LogiLED.LogiLedSetLightingForKeyWithScanCode(botao[i][y], colorAsus.getR(), colorAsus.getG(), colorAsus.getB());
               
            }
        }
        }
}

}