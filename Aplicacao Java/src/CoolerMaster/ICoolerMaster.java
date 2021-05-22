/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoolerMaster;

import IPerifericos.IPerifericos;
import com.CollMaster.CoolerMasterColor;
import com.CollMaster.CoolerMasterDevice;
import com.CollMaster.CoolerMasterKeyMaps;
import com.CollMaster.CoolerMasterLedId;
import com.CollMaster.CoolerMasterSDK;
import java.awt.Color;

/**
 *
 * @author Claud
 */
public class ICoolerMaster implements IPerifericos{
    private final CoolerMasterSDK CoolerMasterSDK;
    private final CoolerMasterDevice device;
    private String nome;
    private CoolerMasterColor CoolerMasterColor;
    private final CoolerMasterKeyMaps keysMaps;
    public ICoolerMaster(CoolerMasterSDK CoolerMasterSDK,CoolerMasterDevice device){
        this.CoolerMasterSDK=CoolerMasterSDK;
        this.device=device;
        CoolerMasterSDK.enable(this.device);
        keysMaps = new CoolerMasterKeyMaps();
    }

    protected CoolerMasterSDK getCoolerMasterSDK() {
        return CoolerMasterSDK;
    }
    
    
    
    @Override
    public void setNome(String nome) {
        this.nome=nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setCor(Color cor) {
        CoolerMasterColor = new CoolerMasterColor(cor.getRed(), cor.getGreen(), cor.getBlue());
    }

    @Override
    public CoolerMasterColor getCor() {
        return CoolerMasterColor;
    }

    @Override
    public String getMarca() {
        return "CoolerMaster";
    }

    @Override
    public String getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setID(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void colorirDispositivo() {   
       CoolerMasterLedId[][] leds= keysMaps.getKeys(CoolerMasterSDK.getLayout(device), device);
        for(int i=0;i<leds.length;i++){
            for(int y=0;i<leds[i].length;y++){
                CoolerMasterSDK.setKeyColor(i, y, CoolerMasterColor,device);
            }
        }
       
    }

    @Override
    public void limparCorDispositivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] getZonasRGB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public CoolerMasterLedId[][] getZonas() {
        return  keysMaps.getKeys(CoolerMasterSDK.getLayout(device), device);
    }
    
    @Override
    public void colorirTudo() {
        this.CoolerMasterSDK.setKeyboardColor(CoolerMasterColor,device);
    }
    
    public CoolerMasterDevice getDevice(){
        return device;
    }
}
