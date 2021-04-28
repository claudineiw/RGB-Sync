package efeitos;

import Logitech.Teclado;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;

public class efeitoDecremental implements Runnable{
    AuraSDK AsusAura;
    JColorChooser color;
    public boolean allDone = false;    
    public  efeitoDecremental(JColorChooser color,AuraSDK AsusAura){
        this.color=color;
        this.AsusAura=AsusAura;
    }
    
    @Override
    public void run(){
        java.awt.Color nova = color.getSelectionModel().getSelectedColor();  
        AsusColor cor = new AsusColor(nova.getRed(), nova.getGreen(), nova.getBlue());         
        AsusAura.setAllColors(cor);     
        Teclado tecladoLogitech = new Teclado("803","100", nova);
        tecladoLogitech.colorirTudo();
        while(!allDone){    
             if (allDone) {                    
                    return;
                }         
              
            tecladoLogitech.setCor(nova);
            tecladoLogitech.colorirTudo();            
            
            if(nova.getGreen()<=30 && nova.getBlue()<=30 && nova.getRed()<=30){
                nova = color.getSelectionModel().getSelectedColor();  
            }else{
              nova=nova.darker();  
            }
            
            try {
                Thread.sleep(1000);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(efeitoDecremental.class.getName()).log(Level.SEVERE, null, ex);
            }
            AsusAura.setAllColors(new AsusColor(nova.getRed(),nova.getGreen(),nova.getBlue())); 
            }
                    
         if (allDone) {          
                    return;
            }
        
    }
}
