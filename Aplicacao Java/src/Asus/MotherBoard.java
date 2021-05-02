package Asus;

import AAPerifericos.IMotherBoard;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AuraSDKDevice;

public class MotherBoard extends IAsus implements IMotherBoard{
    private final static int [] zonasRGB={0,1};
    public MotherBoard(String nome, String ID, int tipoDoDispositivo, AuraSDK AsusAura, AuraSDKDevice AuraSDKDevice) {
        super(nome, ID, zonasRGB, tipoDoDispositivo, AsusAura, AuraSDKDevice);
    }

    @Override
    public void colorirPorLed(int i) {                                    
          this.getLight().get(i).setColor(this.getCor()); 
            
    }
    @Override
    public int getCountLight(){
       return this.getLight().size();
    }
    
}
