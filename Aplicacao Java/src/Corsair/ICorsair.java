package Corsair;

import java.awt.Color;
import IPerifericos.IPerifericos;
import ca.fiercest.cuesdk.CorsairColor;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;
import java.util.Arrays;



public abstract class ICorsair implements IPerifericos{   
    private CorsairColor cor;
    private final  CorsairDevice device;
    private final CueSDK CorsairSDK;
    private final String tipo;
    private String nome;
    private String ID;
    private final int primeira;
    private final int ultima;
    protected final int[][] teclas = {
    {121,122,123,1,2,3,4,5,6,7,8,9,10,11,12,73,74,75,76,98,99,100,101,102},
    {124,125,126,13,14,15,16,17,18,19,20,21,22,23,24,85,87,77,78,79,103,104,105,106},
    {127,128,129,25,26,27,28,29,30,31,32,33,34,35,36,80,81,88,89,90,109,110,111,107},
    {130,137,138,37,38,39,40,41,42,43,44,45,46,47,48,83,113,114,115},
    {139,140,141,49,51,52,53,54,55,56,57,58,59,60,91,93,116,117,118,108},
    {142,143,144,61,62,63,65,68,69,70,92,94,95,96,119,120,154}
    };
    public ICorsair(String nome,String tipo,CueSDK CorsairSDK, CorsairDevice device, int primeira,int ultima){
        this.CorsairSDK=CorsairSDK;
        this.device=device;
        this.nome=nome;
        this.primeira=primeira;
        this.ultima=ultima;       
        this.ID=Arrays.toString(device.getDeviceId());
        this.tipo=tipo;
    }
    
    
    @Override
    public void setNome(String nome) {
       this.nome=nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setCor(Color cor) {
        this.cor = new CorsairColor(cor.getRed(), cor.getGreen(), cor.getBlue());
    }

    @Override
    public CorsairColor getCor() {
        return this.cor;
    }

    @Override
    public String getMarca() {
        return "Corsair";
    }

    @Override
    public String getID() {
      return ID;
    }

    @Override
    public void setID(String ID) {
       this.ID=ID;
    }

     @Override
    public void colorirDispositivo() {
        for (int i = primeira; i <= ultima; i++) {
            getCorsairSDK().SetLedColor(LedId.byOrdinal(i), getCor());
        }

    }

    public String getTipo() {
        return tipo;
    }
    
    
    @Override
    public void limparCorDispositivo() {
       
    }

    @Override
    public int[] getZonasRGB() {
         throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void colorirTudo() {
        for(int i=0;i<=911;i++){
            getCorsairSDK().SetLedColor(LedId.byOrdinal(i), getCor());
        }
    }

    public CorsairDevice getDevice() {
        return device;
    }

    public CueSDK getCorsairSDK() {
        return CorsairSDK;
    }

    public int getPrimeira() {
        return primeira;
    }

    public int getUltima() {
        return ultima;
    }
    
    
    
    
    
    
}
