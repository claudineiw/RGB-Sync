/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corsair;

import IPerifericos.IMotherBoard;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;

/**
 *
 * @author Claud
 */
public final class MotherBoard extends ICorsair implements IMotherBoard{

    public MotherBoard(CueSDK CorsairSDK, CorsairDevice device) {
        super(CorsairSDK, device, 0, 1543);
    }

    @Override
    public void colorirPorLed(int i) {
        getCorsairSDK().SetLedColor(LedId.byOrdinal(getPrimeira() + i), getCor());
    }

    @Override
    public int getCountLight() {
        return getUltima() - getPrimeira();
    }

    
}
