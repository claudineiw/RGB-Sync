package efeitos;

import Logitech.Logitech;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import java.awt.Color;




public class efeitoStrobol implements Runnable{
    private AuraSDK AsusAura;  
    public boolean allDone = false;    
    public  efeitoStrobol(AuraSDK AsusAura){        
        this.AsusAura=AsusAura;
    }
    
    @Override
    public void run(){       
        Color color = new Color((int)(Math.random() * 0x1000000));
        AsusColor cor = new AsusColor(255,255,255);         
        AsusAura.setAllColors(cor);           
        Logitech logitech = new Logitech();
        logitech.colorirTudo();
        while(!allDone){    
             if (allDone) {                    
                    return;
                }
            color = new Color((int)(Math.random() * 0x1000000));
            cor = new AsusColor(color.getRed(),color.getGreen(),color.getBlue()); 
            AsusAura.setAllColors(cor);   
            logitech.setCor(color);
            logitech.colorirTudo();
            
         if (allDone) {          
                    return;
            }
        
    }
}
    
}
