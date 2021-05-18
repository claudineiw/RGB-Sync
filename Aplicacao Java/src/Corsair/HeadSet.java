package Corsair;

import IPerifericos.IHeadSet;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;

public class HeadSet extends ICorsair implements IHeadSet {

    public HeadSet(String nome,String tipo, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome,tipo, CorsairSDK, device, 152, 153);
    }

}
