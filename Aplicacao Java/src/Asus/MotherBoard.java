package Asus;

import IPerifericos.IMotherBoard;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AuraSDKDevice;

public final class MotherBoard extends IAsus implements IMotherBoard {
    public MotherBoard(String nome, String tipo, AuraSDK AsusAura, AuraSDKDevice AuraSDKDevice) {
        super(nome, tipo, AsusAura, AuraSDKDevice);        
    }

    @Override
    public void colorirPorLed(int i) {
        this.getLight().get(i).setColor(this.getCor());

    }

    @Override
    public int getCountLight() {
        return this.getLight().size();
    }

    

}
