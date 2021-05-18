package Corsair;

import IPerifericos.IMouse;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;

public class Mouse extends ICorsair implements IMouse{
    public Mouse(String nome,String tipo, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, tipo,CorsairSDK, device,148,151);
    }    
   
    
}
