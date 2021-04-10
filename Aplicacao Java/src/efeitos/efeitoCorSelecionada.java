
package efeitos;

import ca.fiercest.aurasdk.AsusColor;
import ca.fiercest.aurasdk.AuraSDK;
import com.logitech.gaming.LogiLED;
import javax.swing.JColorChooser;
import rgb.LogitechConversao;

public class efeitoCorSelecionada implements Runnable{
 AuraSDK AsusAura;
    JColorChooser color;
    public boolean allDone = false;    
    LogitechConversao logitechConversao;
    
    public  efeitoCorSelecionada(JColorChooser color,AuraSDK AsusAura){
        this.color=color;
        this.AsusAura=AsusAura;
        this.logitechConversao= new LogitechConversao();
    }
    @Override
    public void run() {
       while(!allDone){
            java.awt.Color nova = color.getSelectionModel().getSelectedColor();            
            AsusColor cor = new AsusColor(nova.getRed(), nova.getGreen(), nova.getBlue());         
            AsusAura.setAllColors(cor);  
            logitechConversao.setRGB(cor.getR(),cor.getG(),cor.getB());
            LogiLED.LogiLedSetLighting(logitechConversao.getR(),logitechConversao.getG(),logitechConversao.getB());  
       }
    }
    
}
