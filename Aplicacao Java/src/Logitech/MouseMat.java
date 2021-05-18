package Logitech;

import IPerifericos.IMouseMat;

public final class MouseMat extends ILogitech implements IMouseMat {

    private final static int[] zonasRGB = {0};

    public MouseMat(String nome, String ID) {
        super(nome, ID,  zonasRGB, (short)0x4);
    }

    @Override
    public void colorirDispositivo() {
        LogiLedInit();
        ColorLogitech cor = this.getCor();
        try {         
            LogiLedSetLightingForTargetZone((short)0x4,0, cor.getR(), cor.getG(), cor.getB());
            LogiLedSetLightingForTargetZone((short)0x4,1, cor.getR(), cor.getG(), cor.getB());
            //LogiLedSetLighting(cor.getR(), cor.getG(), cor.getB());            
        } catch (Exception ex) {
        }
    }

    @Override
    public void colorirPorLed(int i) {
        colorirDispositivo();
    }

    @Override
    public int getCountLight() {
        return 1;
    }

}
