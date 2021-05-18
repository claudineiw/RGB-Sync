package Corsair;

import IPerifericos.IMouseMat;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

public class MouseMat extends ICorsair implements IMouseMat {

    public MouseMat(String nome,String tipo, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, tipo, CorsairSDK, device, 155, 169);
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
