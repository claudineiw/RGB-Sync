package Logitech;

public class HeadSet extends ILogitech{
private final static int [] zonasRGB={0,1};
    public HeadSet(String nome, String ID, java.awt.Color cor) {        
        super(nome, ID, cor,zonasRGB,8);       
    }
    
}
