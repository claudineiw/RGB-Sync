package Logitech;

import AAPerifericos.IHeadSet;

public class HeadSet extends ILogitech implements IHeadSet {

    private final static int[] zonasRGB = {0, 1};

    public HeadSet(String nome, String ID, java.awt.Color cor) {
        super(nome, ID, cor, zonasRGB,(short) 8);
    }

}
