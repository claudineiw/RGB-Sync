package Logitech;

import java.awt.Color;

public final class Logitech extends ILogitech{
    private final static int [] zonasRGB={0,1,2,3,4};
    public Logitech() {
       super("", "", Color.red, zonasRGB, 0);
    }
    
}
