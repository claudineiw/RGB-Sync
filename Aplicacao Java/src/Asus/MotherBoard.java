package Asus;

import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AuraSDKDevice;

public class MotherBoard extends IAsus{
    private final static int [] zonasRGB={0,1};
    public MotherBoard(String nome, String ID, int tipoDoDispositivo, AuraSDK AsusAura, AuraSDKDevice AuraSDKDevice) {
        super(nome, ID, zonasRGB, tipoDoDispositivo, AsusAura, AuraSDKDevice);
    }
    
}
