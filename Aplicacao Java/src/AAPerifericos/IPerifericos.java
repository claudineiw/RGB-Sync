package AAPerifericos;

import static com.logitech.gaming.LogiLED.LogiLedSetLighting;

public interface IPerifericos{         
    public void setNome(String nome);
    public String getNome();    
    public void setCor(java.awt.Color cor);
    public Object getCor();
    public String getMarca();
    public String getID();
    public void setID(String ID);
    public void colorirDispositivo();
    public void limparCorDispositivo();
    public int [] getZonasRGB();
    public void colorirTudo();
}
