package Corsair;

import IPerifericos.ICoolerControl;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

public class CoolerControl extends ICorsair implements ICoolerControl {

    public CoolerControl(String nome,String tipo, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome,tipo, CorsairSDK, device, 200, 499);
    }

    @Override
    public void colorirPorLed(int i) {
        getCorsairSDK().SetLedColor(LedId.byOrdinal(getPrimeira() + i), getCor());
    }

    @Override
    public int getCountLight() {
        return getUltima() - getPrimeira();
    }

}
