package Asus;

import IPerifericos.IPerifericos;
import ca.fiercest.aurasdk.AsusColor;
import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AuraSDKDevice;
import java.util.List;

public abstract class IAsus implements IPerifericos {

    private AsusColor cor;
    private String nome;
    private String tipo;
    private final int zonasRGB=2;
    private final AuraSDK AsusAura;
    private final AuraSDKDevice AuraSDKDevice;

    public IAsus(String nome, String tipo, AuraSDK AsusAura, AuraSDKDevice AuraSDKDevice) {
        this.nome = nome;
        this.tipo = tipo;
        this.AsusAura = AsusAura;
        this.AuraSDKDevice = AuraSDKDevice;
        AsusAura.GainControl();
    }


    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setCor(java.awt.Color cor) {
        this.cor = new AsusColor(cor.getRed(), cor.getGreen(), cor.getBlue());
    }

    @Override
    public AsusColor getCor() {
        return cor;
    }

    @Override
    public String getMarca() {
        return "Asus";
    }

    
    public String getTipo() {
        return tipo;
    }
   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void colorirDispositivo() {
        AuraSDKDevice.setColor(cor);
    }

    @Override
    public void limparCorDispositivo() {
        AuraSDKDevice.setColor(new AsusColor(0, 0, 0));
    }

    public List<AuraRGBLight> getLight() {
        return AuraSDKDevice.getLightZones();
    }

    @Override
    public int getZonasRGB() {
        return zonasRGB;
    }

    @Override
    public void colorirTudo() {
        AsusAura.setAllColors(cor);
    }

    
}
