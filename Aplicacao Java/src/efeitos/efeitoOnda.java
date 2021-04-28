package efeitos;

import Logitech.Teclado;
import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import java.awt.Color;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class efeitoOnda implements Runnable{
    AuraSDK AsusAura;    
    public boolean allDone = false;   
     private int r=255;
     private int g=0;
     private int b=0;
     public  efeitoOnda(AuraSDK AsusAura){
        this.AsusAura=AsusAura;
    }
    
    @Override
    public void run(){   
        Teclado tecladoLogitech = new Teclado("Teclado","100", Color.red);
        int [][] listaBotoes=tecladoLogitech.getTeclas();
        Color cor = new Color(r, g, b);  
         List<AuraRGBLight> luzes=AsusAura.getAllLights(); 
        while(!allDone){                 
             if (allDone) {                    
                    return;
                } 
             for(int i=0;i<luzes.size();i++){     
                 if (allDone) {                    
                    return;
                } 
                luzes.get(i).setColor(new AsusColor(cor.getRed(),cor.getGreen(),cor.getBlue()));
            }
           
             for(int i=listaBotoes.length-1;i>=0;i--){    
                 for(int y=0;y<listaBotoes[i].length;y++){
                     if (allDone) {                    
                    return;
                }   
                     tecladoLogitech.setCor(cor);
                     try {
                         tecladoLogitech.colorirPorTecla(listaBotoes[i][y]);
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
    
    public Color trocarCor(){               
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
                       
          return new Color(r, g, b);
    }
            
}



