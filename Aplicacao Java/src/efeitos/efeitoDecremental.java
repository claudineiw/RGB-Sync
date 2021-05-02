package efeitos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import AAPerifericos.IPerifericos;
import AAPerifericos.colecaoPerifericos;

public class efeitoDecremental implements Runnable{
    colecaoPerifericos listaPerifericos;
    JColorChooser color;
    public boolean allDone = false;    
    public  efeitoDecremental(JColorChooser color,colecaoPerifericos listaPerifericos){
        this.color=color;
        this.listaPerifericos=listaPerifericos;
    }
    
    @Override
    public void run(){
        java.awt.Color nova = color.getSelectionModel().getSelectedColor();  
        while(!allDone){    
             if (allDone) {                    
                    return;
                }         
              try{
             for(IPerifericos periferico:listaPerifericos.getPerifericos()){
                  periferico.setCor(nova);
                  periferico.colorirDispositivo(); 
             }
             }catch(Exception ex){
                 
             }    
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
            }
                    
         if (allDone) {          
                    return;
            }
        
    }
}
