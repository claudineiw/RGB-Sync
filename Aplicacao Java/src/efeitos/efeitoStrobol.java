package efeitos;

import java.awt.Color;
import perifericos.IPerifericos;
import perifericos.colecaoPerifericos;




public class efeitoStrobol implements Runnable{
    private colecaoPerifericos listaPerifericos;  
    public boolean allDone = false;    
    public  efeitoStrobol(colecaoPerifericos listaPerifericos){        
        this.listaPerifericos=listaPerifericos;
    }
    
    @Override
    public void run(){   
        while(!allDone){    
             if (allDone) {                    
                    return;
                }
            for(IPerifericos perifericos:listaPerifericos.getPerifericos()){
                perifericos.setCor(new Color((int)(Math.random() * 0x1000000)));
                perifericos.colorirTudo();
            }
            
            
         if (allDone) {          
                    return;
            }
        
    }
}
    
}
