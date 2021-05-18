package Corsair;

import IPerifericos.IKeyboard;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

public class Keyboard extends ICorsair implements IKeyboard {

    public Keyboard(String nome,String tipo, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, tipo, CorsairSDK, device, 1, 147);
    }

    @Override
    public int[][] getTeclas() {
        return this.teclas;
    }

    @Override
    public void colorirPorTecla(int tecla) {
        getCorsairSDK().SetLedColor(LedId.byOrdinal(tecla), getCor());
    }

}
