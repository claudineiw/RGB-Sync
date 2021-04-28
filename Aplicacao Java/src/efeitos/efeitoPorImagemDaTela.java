/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efeitos;

import Logitech.Mouse;
import Logitech.Teclado;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;


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
        private  JPanel painelImagens;
        
        
        public efeitoPorImagemDaTela(AuraSDK AsusAura, JPanel painelImagens){
        this.AsusAura=AsusAura;
        this.painelImagens=painelImagens;
        this.colorJava = new Color(255,0,0);
         }
        
        public void run(){ 
        Mouse mouse = new Mouse("903","100", colorJava);
        Teclado tecladoLogitech = new Teclado("803","100", colorJava);
        botao =tecladoLogitech.getTeclas();  
            JLabel lbT= new JLabel();
            JLabel lbM= new JLabel();
        for(Component comp:painelImagens.getComponents()){
            if(comp.getName().equals("lbTeclado")){
            lbT=(JLabel) comp;
            }
            if(comp.getName().equals("lbMouse")){
             lbM=(JLabel) comp;
            }
           
        }
        
        while(!allDone){
             
        if (allDone) {                    
                    return;
                } 
         try {
             image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
         } catch (AWTException ex) {
             Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        Image img = image.getScaledInstance(60, 30, BufferedImage.SCALE_SMOOTH);
        image = new BufferedImage(60, 30, TYPE_INT_ARGB);
        image.getGraphics().drawImage(img, 0, 0 , null);
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
                colorJava = new java.awt.Color(matrix[i+lbT.getY()/10][y+lbT.getX()/7]);       
                tecladoLogitech.setCor(colorJava);
                try {
                    tecladoLogitech.colorirPorTecla(botao[i][y]);
                } catch (Exception ex) {
                    Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
        }
        colorJava = new java.awt.Color(matrix[lbM.getY()/10][lbM.getX()/7]);   
        mouse.setCor(colorJava);
        mouse.colorirDispositivo();
        }
}

}