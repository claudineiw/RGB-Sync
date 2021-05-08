/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corsair;

import IPerifericos.IMouse;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

public class Mouse extends ICorsair implements IMouse{
    
    public Mouse(String nome, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, CorsairSDK, device);
    }
    
     @Override
    public void colorirDispositivo() {
        for(int i=148;i<=151;i++){
            getCorsairSDK().SetLedColor(LedId.byOrdinal(i), getCor());
        }
      
    }
    
}
