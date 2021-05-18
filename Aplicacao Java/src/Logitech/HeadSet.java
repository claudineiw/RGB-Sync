package Logitech;

import IPerifericos.IHeadSet;

public final class HeadSet extends ILogitech implements IHeadSet {

    private final static int[] zonasRGB = {0, 1};

    public HeadSet(String nome, String ID) {
        super(nome, ID, zonasRGB,(short) 8);
    }

}
