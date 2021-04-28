package Logitech;

public final class Teclado extends ILogitech implements perifericos.ITeclado{
private final static int [] zonasRGB={0,1,2,3,4};
    public Teclado(String nome, String ID, java.awt.Color cor) {
        super(nome, ID, cor,zonasRGB,0);
    }

        
    public int [][] getTeclas(){
       return this.teclas;
   }
    @Override
    public void colorirPorTecla(int tecla) {
        ColorLogitech cor=this.getCor();
        try{
       LogiLedSetLightingForKeyWithScanCode(tecla,cor.getR() ,cor.getG(),cor.getB());
       }catch(Exception ex){                  
        }
    }
    
}
