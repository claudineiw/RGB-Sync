/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Corsair;

import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CueSDK;

/**
 *
 * @author Claud
 */
public class CoolerControl  extends ICorsair{
    
    public CoolerControl(String nome, CueSDK CorsairSDK, CorsairDevice device) {
        super(nome, CorsairSDK, device);
    }
    
}
