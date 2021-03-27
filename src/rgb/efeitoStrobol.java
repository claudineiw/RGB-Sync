/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgb;

import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.Color;
import com.logitech.gaming.LogiLED;
import javax.swing.JColorChooser;




public class efeitoStrobol implements Runnable{
    AuraSDK AsusAura;  
    boolean allDone = false;    
    
    public  efeitoStrobol(AuraSDK AsusAura){        
        this.AsusAura=AsusAura;
    }
    
    @Override
    public void run(){        
        Color cor = new Color(255,255,255);         
        AsusAura.setAllColors(cor);             
        LogiLED.LogiLedSetLighting(cor.getR(),cor.getG(),cor.getB()); 
        Color corPadrao = cor;
        while(!allDone){    
             if (allDone) {                    
                    return;
                }
            cor = new Color(255,0,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(255,0,0); 
            cor = new Color(255,255,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(255,255,0); 
            cor = new Color(0,0,255); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(0,0,255); 
            cor = new Color(0,255,255); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(0,255,255); 
            
            cor = new Color(0,255,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(0,255,0); 
            cor = new Color(100,255,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(100,255,0); 
            
            cor = new Color(100,100,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(100,100,0); 
            cor = new Color(50,100,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(50,100,0); 
            
            cor = new Color(100,100,50); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(100,100,50); 
            cor = new Color(10,100,50); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(10,100,50); 
            
         if (allDone) {          
                    return;
            }
        
    }
}
    
}
