package Logitech;

import AAPerifericos.IMouse;
import java.awt.Color;

/**
 *
 * @author Claud
 */
public final class Mouse extends ILogitech implements IMouse {

    private final static int[] zonasRGB = {0, 1};

    /**
     *
     * @param nome
     * @param ID
     * @param cor
     */
    public Mouse(String nome, String ID, Color cor) {
        super(nome, ID, cor, zonasRGB, (short)3);
    }

}
