package Corsair;

import java.awt.Color;
import IPerifericos.IPerifericos;
import ca.fiercest.cuesdk.CorsairColor;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;



public abstract class ICorsair implements IPerifericos{   
    private CorsairColor cor;
    private final  CorsairDevice device;
    private final CueSDK CorsairSDK;
    private final int primeira;
    private final int ultima;

    public ICorsair(CueSDK CorsairSDK, CorsairDevice device, int primeira,int ultima){
        this.CorsairSDK=CorsairSDK;
        this.device=device;
        this.primeira=primeira;
        this.ultima=ultima;       
    }
    

    @Override
    public String getNome() {
        return this.device.getModelName();
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
    public void colorirDispositivo() {
        for (int i = primeira; i <= ultima; i++) {
            getCorsairSDK().SetLedColor(LedId.byOrdinal(i), getCor());
        }

    }

    public String getTipo() {
        return device.getType().name();
    }
    
    
    @Override
    public void limparCorDispositivo() {
       
    }

    @Override
    public int getZonasRGB() {
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
