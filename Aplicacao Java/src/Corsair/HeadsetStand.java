package Corsair;

import IPerifericos.IHeadsetStand;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

public class HeadsetStand extends ICorsair implements IHeadsetStand {

    public HeadsetStand(String nome, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, CorsairSDK, device, 191, 199);
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
