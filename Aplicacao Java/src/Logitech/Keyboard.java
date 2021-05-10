package Logitech;

import IPerifericos.IKeyboard;

public final class Keyboard extends ILogitech implements IKeyboard {

    private final static int[] zonasRGB = {0, 1, 2, 3, 4};
    private final int iniciado=0;
    public Keyboard(String nome, String ID, java.awt.Color cor) {
        super(nome, ID, cor, zonasRGB, (short)0);    
    }

    @Override
    public int[][] getTeclas() {        
        return this.teclas;
    }

    @Override
    public void colorirPorTecla(int tecla) {
        if(iniciado==0){
            LogiLedInit();
        }
        ColorLogitech cor = this.getCor();
        try {
            LogiLedSetLightingForKeyWithScanCode(tecla, cor.getR(), cor.getG(), cor.getB());
        } catch (Exception ex) {
        }
    }

}
