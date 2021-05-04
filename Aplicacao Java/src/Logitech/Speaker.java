package Logitech;

import AAPerifericos.ISpeaker;

public final class Speaker extends ILogitech implements ISpeaker {

    private final static int[] zonasRGB = {0, 1, 2, 3};

    public Speaker(String nome, String ID, java.awt.Color cor) {
        super(nome, ID, cor, zonasRGB,(short) 14);
    }

}
