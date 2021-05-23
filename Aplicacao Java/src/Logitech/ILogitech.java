package Logitech;

import com.logitech.gaming.HIDPID.DevicesLogitech;
import com.logitech.gaming.LogiTechColor;
import com.logitech.gaming.LogiTechSDK;

public abstract class ILogitech implements IPerifericos.IPerifericos {

    private LogiTechColor cor;
    
    private final LogiTechSDK sdk;
    private final  DevicesLogitech device;
    public ILogitech(LogiTechSDK sdk,DevicesLogitech device) {
        this.sdk=sdk;
        this.device=device;
    }

    public LogiTechSDK getSdk() {
        return sdk;
    }

    public DevicesLogitech getDevice() {
        return device;
    }

    @Override
    public String getNome() {
        return device.getModel();
    }

    @Override
    public void setCor(java.awt.Color cor) {
        this.cor = new LogiTechColor(cor);
    }

    /**
     *
     * @return ColorLogitech
     */
    @Override
    public LogiTechColor getCor() {
        return cor;
    }

    @Override
    public String getMarca() {
        return "Logitech";
    }

    @Override
    public void colorirDispositivo() {
        try {
            for (int i=0;i<device.getZonas();i++) {
                sdk.SetLightingForTargetZone(device.getDeviceType(), i, cor);
            }

        } catch (Exception ex) {
        }
    }

    @Override
    public void limparCorDispositivo() {
        sdk.StopEffects();
       
    }

    @Override
    public int getZonasRGB() {
        return device.getZonas();
    }

    ;
    
    @Override
    public void colorirTudo() {        
        sdk.SetLighting(cor);
    }

}
