
package efeitos;

import javax.swing.JColorChooser;
import perifericos.IPerifericos;
import perifericos.colecaoPerifericos;

public class efeitoCorSelecionada implements Runnable{
    JColorChooser color;
    public boolean allDone = false;    
    colecaoPerifericos listaPerifericos;
    public  efeitoCorSelecionada(JColorChooser color,colecaoPerifericos listaPerifericos){
        this.color=color;
        this.listaPerifericos=listaPerifericos;
    }
    @Override
    public void run() {        
       while(!allDone){
            java.awt.Color nova = color.getSelectionModel().getSelectedColor();                
            for(IPerifericos periferico:listaPerifericos.getPerifericos()){
                periferico.setCor(nova);
                periferico.colorirTudo(); 
            }
       }
    }
    
}
