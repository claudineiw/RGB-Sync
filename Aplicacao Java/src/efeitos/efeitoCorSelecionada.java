
package efeitos;

import Logitech.Teclado;
import ca.fiercest.aurasdk.AsusColor;
import ca.fiercest.aurasdk.AuraSDK;
import java.awt.Color;
import javax.swing.JColorChooser;

public class efeitoCorSelecionada implements Runnable{
 AuraSDK AsusAura;
    JColorChooser color;
    public boolean allDone = false;    
    
    public  efeitoCorSelecionada(JColorChooser color,AuraSDK AsusAura){
        this.color=color;
        this.AsusAura=AsusAura;
    }
    @Override
    public void run() {
        Teclado tecladoLogitech = new Teclado("803","100", Color.red);
       while(!allDone){
            java.awt.Color nova = color.getSelectionModel().getSelectedColor();            
            AsusColor cor = new AsusColor(nova.getRed(), nova.getGreen(), nova.getBlue());         
            AsusAura.setAllColors(cor);  
            tecladoLogitech.setCor(nova);
            tecladoLogitech.colorirTudo();
       }
    }
    
}
