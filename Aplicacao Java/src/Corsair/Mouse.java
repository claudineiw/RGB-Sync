package Corsair;

import IPerifericos.IMouse;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;

public class Mouse extends ICorsair implements IMouse{
    public Mouse(CueSDK CorsairSDK, CorsairDevice device) {
        super(CorsairSDK, device,148,151);
    }    
   
    
}
