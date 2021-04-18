package efeitos;

import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AsusColor;
import com.logitech.gaming.LogiLED;
import javax.swing.JColorChooser;
import logitechMetodos.logitechMetodosAuxiliares;

public class efeitoDecremental implements Runnable{
    AuraSDK AsusAura;
    JColorChooser color;
    public boolean allDone = false;    
    logitechMetodosAuxiliares logitechConversao;
    public  efeitoDecremental(JColorChooser color,AuraSDK AsusAura){
        this.color=color;
        this.AsusAura=AsusAura;
        this.logitechConversao= new logitechMetodosAuxiliares();
    }
    
    @Override
    public void run(){
        int decrementar=3;
        java.awt.Color nova = color.getSelectionModel().getSelectedColor();  
        AsusColor cor = new AsusColor(nova.getRed(), nova.getGreen(), nova.getBlue());         
        AsusAura.setAllColors(cor);      
        logitechConversao.setRGB(cor.getR(),cor.getG(),cor.getB()); 
        LogiLED.LogiLedSetLighting(logitechConversao.getR(),logitechConversao.getG(),logitechConversao.getB()); 
        AsusColor corPadrao = cor;
        int red=corPadrao.getR();
        int green = corPadrao.getG();
        int blue = corPadrao.getB();
        while(!allDone){    
             if (allDone) {                    
                    return;
                }
            cor = new AsusColor(red,green,blue); 
            AsusAura.setAllColors(cor);             
            LogiLED.LogiLedSetLighting(red,green,blue); 
            if(red>0){  
                red=red-(255/corPadrao.getR())*decrementar;
                if(red<0){
                    red=0;
                }
            }            
            
            if(green>0){
                green=green-(255/corPadrao.getG())*decrementar;      
                if(green<0){
                    green=0;
                }
            }
           
            
            if(blue>0){
                blue=blue-(255/corPadrao.getB())*decrementar;  
                if(blue<0){
                    blue=0;
                }
            }  
            if(red==0 && blue==0 && green==0){
                     red=corPadrao.getR();
                    green = corPadrao.getG();
                    blue = corPadrao.getB();
            }
            }
         if (allDone) {          
                    return;
            }
        
    }
}
