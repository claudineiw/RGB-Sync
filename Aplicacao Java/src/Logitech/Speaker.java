package Logitech;

public class Speaker extends ILogitech{
private final static int [] zonasRGB={0,1,2,3};
    public Speaker(String nome, String ID, java.awt.Color cor) {
        super(nome, ID, cor,zonasRGB,14);
    }

   
    
}
