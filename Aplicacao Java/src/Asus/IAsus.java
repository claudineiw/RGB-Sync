package Asus;

import AAPerifericos.IPerifericos;
import ca.fiercest.aurasdk.AsusColor;
import ca.fiercest.aurasdk.AuraRGBLight;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.aurasdk.AuraSDKDevice;
import java.util.List;


public abstract class IAsus implements IPerifericos{
    private AsusColor cor;
    private String nome;
    private String ID;
    private final int[] zonasRGB;
    private final int tipoDoDispositivo;
    private AuraSDK AsusAura;
    private AuraSDKDevice AuraSDKDevice;
    
    public IAsus(String nome,String ID,int [] zonasRGB,int tipoDoDispositivo,AuraSDK AsusAura,AuraSDKDevice AuraSDKDevice){
        this.nome=nome;
        this.ID=ID;
        this.zonasRGB=zonasRGB;
        this.tipoDoDispositivo=tipoDoDispositivo;
        this.AsusAura=AsusAura;
        this.AuraSDKDevice=AuraSDKDevice;
        AsusAura.GainControl();
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
    public void setCor(java.awt.Color cor) {
        this.cor= new AsusColor(cor.getRed(), cor.getGreen(), cor.getBlue());
    }

    @Override
    public AsusColor getCor() {
       return cor;
    }

    @Override
    public String getMarca() {
        return "Asus";
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
        AuraSDKDevice.setColor(cor);
    }

    @Override
    public void limparCorDispositivo() {
        AuraSDKDevice.setColor(new AsusColor(0, 0, 0));
    }
    
    public List<AuraRGBLight> getLight(){
       return AuraSDKDevice.getLightZones();
    }
    
    
    @Override
    public int[] getZonasRGB() {
        return zonasRGB;
    }

    @Override
    public void colorirTudo() {
        AsusAura.setAllColors(cor);  
    }
    
}
