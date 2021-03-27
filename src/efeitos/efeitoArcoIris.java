package efeitos;

import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.Color;
import com.logitech.gaming.LogiLED;
import java.util.List;
import rgb.botoesLogitech;

public class efeitoArcoIris implements Runnable{
    AuraSDK AsusAura;    
    public boolean allDone = false;    
    public  efeitoArcoIris(AuraSDK AsusAura){
       
        this.AsusAura=AsusAura;
    }
    
    @Override
    public void run(){   
  
       
       int r=255;
       int g=0;
       int b=0;
       
        Color cor = new Color(r, g, b);
         
               
        while(!allDone){                 
             if (allDone) {                    
                    return;
                }             
                         
             
             for(int y=0;y<23;y++){      
                 try{
                 cor = new Color(r, g, b); 
                 try{
                 LogiLED.LogiLedSetLightingForKeyWithScanCode(botoesLogitech.primeiro[y], r, g, b);
                 }catch(Exception ex){
                 
             }
                 //LogiLED.LogiLedSaveLightingForKey(botoesLogitech.primeiro[y]);   
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(botoesLogitech.segundo[y], r, g, b);
                  }catch(Exception ex){
                 
             }
                 //LogiLED.LogiLedSaveLightingForKey(botoesLogitech.segundo[y]);
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(botoesLogitech.terceiro[y], r, g, b);
                  }catch(Exception ex){
                 
             }
                 //LogiLED.LogiLedSaveLightingForKey(botoesLogitech.terceiro[y]);
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(botoesLogitech.quarto[y], r, g, b);
                  }catch(Exception ex){
                 
             }
                 //LogiLED.LogiLedSaveLightingForKey(botoesLogitech.quarto[y]);
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(botoesLogitech.quinto[y], r, g, b);
                  }catch(Exception ex){
                 
             }
                 //LogiLED.LogiLedSaveLightingForKey(botoesLogitech.quinto[y]);
                 try{
                  LogiLED.LogiLedSetLightingForKeyWithScanCode(botoesLogitech.sexto[y], r, g, b);
                  
                  }catch(Exception ex){
                 
             }
                 //LogiLED.LogiLedSaveLightingForKey(botoesLogitech.sexto[y]);  
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
                    cor = new Color(r, g, b);
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
