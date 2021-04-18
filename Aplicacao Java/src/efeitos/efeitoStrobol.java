package efeitos;

import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import com.logitech.gaming.LogiLED;
import logitechMetodos.logitechMetodosAuxiliares;




public class efeitoStrobol implements Runnable{
    private AuraSDK AsusAura;  
    public boolean allDone = false;    
    logitechMetodosAuxiliares logitechConversao;
    public  efeitoStrobol(AuraSDK AsusAura){        
        this.AsusAura=AsusAura;
        this.logitechConversao = new logitechMetodosAuxiliares();
    }
    
    @Override
    public void run(){        
        AsusColor cor = new AsusColor(255,255,255);         
        AsusAura.setAllColors(cor);            
        logitechConversao.setRGB(cor.getR(),cor.getG(),cor.getB()); 
        LogiLED.LogiLedSetLighting(logitechConversao.getR(),logitechConversao.getG(),logitechConversao.getB());
        AsusColor corPadrao = cor;
        while(!allDone){    
             if (allDone) {                    
                    return;
                }
            cor = new AsusColor(255,0,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(255,0,0); 
            cor = new AsusColor(255,255,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(255,255,0); 
            cor = new AsusColor(0,0,255); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(0,0,255); 
            cor = new AsusColor(0,255,255); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(0,255,255); 
            
            cor = new AsusColor(0,255,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(0,255,0); 
            cor = new AsusColor(100,255,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(100,255,0); 
            
            cor = new AsusColor(100,100,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(100,100,0); 
            cor = new AsusColor(50,100,0); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(50,100,0); 
            
            cor = new AsusColor(100,100,50); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(100,100,50); 
            cor = new AsusColor(10,100,50); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(10,100,50); 
            
         if (allDone) {          
                    return;
            }
        
    }
}
    
}
