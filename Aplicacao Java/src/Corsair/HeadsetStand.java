/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corsair;

import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

/**
 *
 * @author Claud
 */
public class HeadsetStand  extends ICorsair{
    
    public HeadsetStand(String nome, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, CorsairSDK, device);
    }
     @Override
    public void colorirDispositivo() {
        for(int i=191;i<=199;i++){
            getCorsairSDK().SetLedColor(LedId.byOrdinal(i), getCor());
        }
      
    }
}
