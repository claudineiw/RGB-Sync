/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corsair;

import IPerifericos.IMouseMat;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

/**
 *
 * @author Claud
 */
public class MouseMat  extends ICorsair implements IMouseMat{
    
    public MouseMat(String nome, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, CorsairSDK, device);
    }
    
     @Override
    public void colorirDispositivo() {
        for(int i=155;i<=169;i++){
            getCorsairSDK().SetLedColor(LedId.byOrdinal(i), getCor());
        }
      
    }
    
}
