/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corsair;

import IPerifericos.IKeyboard;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

/**
 *
 * @author Claud
 */
public class Keyboard  extends ICorsair implements IKeyboard{
    
    public Keyboard(String nome, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, CorsairSDK, device);
    }
    
    @Override
    public void colorirDispositivo() {
        for(int i=1;i<=147;i++){
            getCorsairSDK().SetLedColor(LedId.byOrdinal(i),getCor());
        }
      
    }

    @Override
    public int[][] getTeclas() {
        return this.teclas;
    }
 @Override
    public void colorirPorTecla(int tecla) {  
        getCorsairSDK().SetLedColor(LedId.byOrdinal(tecla),getCor());       
    }
    
}
