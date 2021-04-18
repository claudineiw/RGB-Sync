/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efeitos;

import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import com.logitech.gaming.LogiLED;
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import logitechMetodos.logitechMetodosAuxiliares;


public class efeitoPorImagemDaTela implements Runnable{
        AuraSDK AsusAura;  
        BufferedImage image;
        int largura;
        int altura;
        int[] dataBuffInt;
        int[][] matrix;
        public  boolean allDone = false;   
        int [][] botao;
        java.awt.Color colorJava;
        AsusColor colorAsus;
        logitechMetodosAuxiliares logitechConversao;
        private  JPanel painelImagens;
        
        
        public efeitoPorImagemDaTela(AuraSDK AsusAura, JPanel painelImagens){
        this.AsusAura=AsusAura;
        this.painelImagens=painelImagens;
    }
        
        
        private static int[][] convertTo2DWithoutUsingGetRGB(BufferedImage image) {

      final byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
      final int width = image.getWidth();
      final int height = image.getHeight();
      final boolean hasAlphaChannel = image.getAlphaRaster() != null;

      int[][] result = new int[height][width];
      if (hasAlphaChannel) {
         final int pixelLength = 4;
         for (int pixel = 0, row = 0, col = 0; pixel + 3 < pixels.length; pixel += pixelLength) {
            int argb = 0;
            argb += (((int) pixels[pixel] & 0xff) << 24); // alpha
            argb += ((int) pixels[pixel + 1] & 0xff); // blue
            argb += (((int) pixels[pixel + 2] & 0xff) << 8); // green
            argb += (((int) pixels[pixel + 3] & 0xff) << 16); // red
            result[row][col] = argb;
            col++;
            if (col == width) {
               col = 0;
               row++;
            }
         }
      } else {
         final int pixelLength = 3;
         for (int pixel = 0, row = 0, col = 0; pixel + 2 < pixels.length; pixel += pixelLength) {
            int argb = 0;
            argb += -16777216; // 255 alpha
            argb += ((int) pixels[pixel] & 0xff); // blue
            argb += (((int) pixels[pixel + 1] & 0xff) << 8); // green
            argb += (((int) pixels[pixel + 2] & 0xff) << 16); // red
            result[row][col] = argb;
            col++;
            if (col == width) {
               col = 0;
               row++;
            }
         }
      }

      return result;
   }
        
        
        public void run(){ 
        logitechConversao = new logitechMetodosAuxiliares();
        botao =logitechConversao.getBotoes();  
        while(!allDone){
            System.out.println("  X: "+painelImagens.getWidth()+"  Y: "+painelImagens.getHeight());
        for(Component comp: painelImagens.getComponents()){
            System.out.println(comp.getName()+"  X: "+comp.getLocation().getX()+"  Y: "+comp.getLocation().getY());
        }
        if (allDone) {                    
                    return;
                } 
         try {
             image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
         } catch (AWTException ex) {
             Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        Image img = image.getScaledInstance(50, 25, BufferedImage.SCALE_SMOOTH);
        //image = new BufferedImage(50, 25, TYPE_INT_ARGB);
        image.getGraphics().drawImage(img, 0, 0 , null);
       // image  = image.getSubimage((int)image.getWidth()/4,(int)image.getHeight()/2,image.getWidth()/2, image.getHeight() / 2);             
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
                //colorAsus = new Color(colorJava.getRed(),colorJava.getGreen(),colorJava.getBlue());
                logitechConversao.setRGB(colorJava.getRed(),colorJava.getGreen(),colorJava.getBlue());
                LogiLED.LogiLedSetLightingForKeyWithScanCode(botao[i][y],logitechConversao.getR(),logitechConversao.getG(),logitechConversao.getB());
               
            }
        }
        }
}

}