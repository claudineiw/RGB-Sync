package efeitos;

import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import com.logitech.gaming.LogiLED;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import logitechMetodos.logitechMetodosAuxiliares;


public class efeitoOnda implements Runnable{
    AuraSDK AsusAura;    
    public boolean allDone = false;   
     private int r=255;
     private int g=0;
     private int b=0;
     logitechMetodosAuxiliares logitechconversao;
     public  efeitoOnda(AuraSDK AsusAura){
       this.logitechconversao= new logitechMetodosAuxiliares();
        this.AsusAura=AsusAura;
    }
    
    @Override
    public void run(){   
        logitechMetodosAuxiliares botoes = new logitechMetodosAuxiliares();
        int [][] listaBotoes=botoes.getBotoes();
        AsusColor cor = new AsusColor(r, g, b);  
         List<AuraRGBLight> luzes=AsusAura.getAllLights(); 
        while(!allDone){                 
             if (allDone) {                    
                    return;
                } 
             for(int i=0;i<luzes.size();i++){     
                 if (allDone) {                    
                    return;
                } 
                luzes.get(i).setColor(cor);
            }
           
             for(int i=listaBotoes.length-1;i>=0;i--){    
                 for(int y=0;y<listaBotoes[i].length;y++){
                     if (allDone) {                    
                    return;
                }   
                     logitechconversao.setRGB(r, g, b);
                     try {
                         logitechconversao.porTecla(listaBotoes[i][y]);
                     } catch (Exception ex) {
                         Logger.getLogger(efeitoOnda.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
                 time();
             }             
            cor = trocarCor();
         if (allDone) {          
                    return;
            }
        
    }
    }
    
    public void time(){
        TimeUnit time = TimeUnit.MILLISECONDS; 
        try { 
                time.sleep(500L);
            } catch (InterruptedException ex) {
                Logger.getLogger(efeitoOnda.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public AsusColor trocarCor(){               
                    if(r==255 && g==0 && b==0){
                        r=255;
                        g=255;
                        b=255;
                    }
                    else
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
                        else
                            if(b==255){
                            r=255;
                            g=0;
                            b=0;
                        }
                       
          return new AsusColor(r, g, b);
    }
            
}



