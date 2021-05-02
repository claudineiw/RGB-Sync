package Logitech;

import AAPerifericos.ISpeaker;

public class Speaker extends ILogitech implements ISpeaker{
private final static int [] zonasRGB={0,1,2,3};
    public Speaker(String nome, String ID, java.awt.Color cor) {
        super(nome, ID, cor,zonasRGB,14);
    }

   
    
}
