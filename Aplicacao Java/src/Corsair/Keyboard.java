package Corsair;

import IPerifericos.IKeyboard;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CorsairKeyBoardMap;
import ca.fiercest.cuesdk.CorsairRowColumn;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

public class Keyboard extends ICorsair implements IKeyboard {
    private int[][] teclas= new int[7][25];
    public Keyboard(CueSDK CorsairSDK, CorsairDevice device) {
        super(CorsairSDK, device, 1, 147);
        preencherTeclas();
    }

    @Override
    public int[][] getTeclas() {
        return this.teclas;
    }

    @Override
    public void colorirPorTecla(int tecla) {
        getCorsairSDK().SetLedColor(LedId.byOrdinal(tecla), getCor());
    }
    
    
    
    private void preencherTeclas() {
        CorsairKeyBoardMap keyboard = new CorsairKeyBoardMap();
        for (CorsairRowColumn tecla : keyboard.getKeys(super.getNome())) {          
            teclas[tecla.getRow()][tecla.getColumn()] = tecla.getCorsaIdLedId().getId();
        }        
    }
}
