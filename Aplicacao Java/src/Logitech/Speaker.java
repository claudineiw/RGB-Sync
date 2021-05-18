package Logitech;

import IPerifericos.ISpeaker;

public final class Speaker extends ILogitech implements ISpeaker {

    private final static int[] zonasRGB = {0, 1, 2, 3};

    public Speaker(String nome, String ID) {
        super(nome, ID, zonasRGB,(short) 14);
    }

}
