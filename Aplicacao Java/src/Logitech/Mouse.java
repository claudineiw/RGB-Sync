package Logitech;

import java.awt.Color;

public class Mouse extends ILogitech {
private final static int [] zonasRGB={0,1};
    /**
     *
     * @param nome String
     * @param ID String
     * @param cor java.awt.Color
     */
    public Mouse(String nome, String ID, Color cor) {        
        super(nome, ID, cor,zonasRGB,3);
    }

}
