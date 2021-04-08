package efeitos;

import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import com.logitech.gaming.LogiLED;
import java.util.List;
import rgb.LogitechConversao;

public class efeitoArcoIris implements Runnable{
    AuraSDK AsusAura;    
    public boolean allDone = false;    
    LogitechConversao logitechConversao;
    public  efeitoArcoIris(AuraSDK AsusAura){       
        this.AsusAura=AsusAura;
        this.logitechConversao = new LogitechConversao();
    }
    
    @Override
    public void run(){   
  
       
       int r=255;
       int g=0;
       int b=0;
       
        AsusColor cor = new AsusColor(r, g, b);
         
               
        while(!allDone){                 
             if (allDone) {                    
                    return;
                }             
                         
             
             for(int y=0;y<23;y++){      
                 try{
                 cor = new AsusColor(r, g, b); 
                 try{
                     logitechConversao.setRGB(r, g, b);
                 LogiLED.LogiLedSetLightingForKeyWithScanCode(LogitechConversao.primeiro[y], logitechConversao.getR(), logitechConversao.getG(), logitechConversao.getB());
                 }catch(Exception ex){
                 
             }
                  
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(LogitechConversao.segundo[y],logitechConversao.getR(), logitechConversao.getG(), logitechConversao.getB());
                  }catch(Exception ex){
                 
             }
                
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(LogitechConversao.terceiro[y], logitechConversao.getR(), logitechConversao.getG(), logitechConversao.getB());
                  }catch(Exception ex){
                 
             }
                
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(LogitechConversao.quarto[y], logitechConversao.getR(), logitechConversao.getG(), logitechConversao.getB());
                  }catch(Exception ex){
                 
             }
                 
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(LogitechConversao.quinto[y], logitechConversao.getR(), logitechConversao.getG(), logitechConversao.getB());
                  }catch(Exception ex){
                 
             }
               
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(LogitechConversao.sexto[y], logitechConversao.getR(), logitechConversao.getG(), logitechConversao.getB());
                  
                  }catch(Exception ex){
                 
             }
              
             }catch(Exception ex){
                 
             }
                
                     if(r==255){
                        r=0;
                        g=255;
                        b=0;
                    }
                    else
                        if(g==255){
                            r=0;
                            g=0;
                            b=255;
                        }
                        else{
                            r=255;
                            g=0;
                            b=0;
                        } 
                 
             }
             
             List<AuraRGBLight> luzes=AsusAura.getAllLights();
             try{    
            for(int i=0;i<luzes.size();i+=10){    
                 if (allDone) {                      
                    break;
                }
                    cor = new AsusColor(r, g, b);
                    try{
                    luzes.get(i).setColor(cor);   
                    luzes.get(i+1).setColor(cor);  
                    luzes.get(i+2).setColor(cor);  
                    luzes.get(i+3).setColor(cor);  
                    luzes.get(i+4).setColor(cor);                    
                    
                    }catch(Exception ex){
                        
                    }
                    if(r==255){
                        r=0;
                        g=255;
                        b=0;
                    }
                    else
                        if(g==255){
                            r=0;
                            g=0;
                            b=255;
                        }
                        else{
                            r=255;
                            g=0;
                            b=0;
                        }
            }
             }catch(Exception ex){
                 
             }
      
           
            }
         if (allDone) {          
                    return;
            }
        
    }
}
