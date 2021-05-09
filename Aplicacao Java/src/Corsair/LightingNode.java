package Corsair;

import IPerifericos.ILightingNode;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

public class LightingNode extends ICorsair implements ILightingNode {

    public LightingNode(String nome, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, CorsairSDK, device, 200, 499);
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
