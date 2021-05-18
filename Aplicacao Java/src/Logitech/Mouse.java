package Logitech;

import IPerifericos.IMouse;

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
    public Mouse(String nome, String ID) {
        super(nome, ID, zonasRGB, (short)3);
    }

}
