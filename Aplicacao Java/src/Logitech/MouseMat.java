package Logitech;


public class MouseMat extends ILogitech{
private final static int [] zonasRGB={0};
    public MouseMat(String nome, String ID, java.awt.Color cor) {
        super(nome, ID, cor,zonasRGB,4);
    }
}
