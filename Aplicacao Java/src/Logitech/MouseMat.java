package Logitech;

import AAPerifericos.IMouseMat;


public class MouseMat extends ILogitech implements IMouseMat{
private final static int [] zonasRGB={0};
    public MouseMat(String nome, String ID, java.awt.Color cor) {
        super(nome, ID, cor,zonasRGB,4);
    }
}
