package Logitech;

import java.awt.Color;

public final class Logitech{
    private final static int [] zonasRGB={0,1,2,3,4};
    
    private final ILogitech log = new ILogitech("", "", Color.red, zonasRGB, 0) {
    };    
    public Logitech() {
       
    }
     public void setCor(java.awt.Color cor) {
        log.setCor(cor);
    }
     
      public void colorirTudo() {
        log.colorirTudo();
    }
     
}
