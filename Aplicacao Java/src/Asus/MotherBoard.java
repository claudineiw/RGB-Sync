package Asus;

import IPerifericos.IMotherBoard;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AuraSDKDevice;

public final class MotherBoard extends IAsus implements IMotherBoard {
    private final static int[] zonasRGB = {0, 1};

    public MotherBoard(String nome, String tipo, AuraSDK AsusAura, AuraSDKDevice AuraSDKDevice) {
        super(nome, tipo, zonasRGB, AsusAura, AuraSDKDevice);        
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
