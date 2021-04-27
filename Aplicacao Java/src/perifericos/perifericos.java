package perifericos;

public interface perifericos{         
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
   
}
