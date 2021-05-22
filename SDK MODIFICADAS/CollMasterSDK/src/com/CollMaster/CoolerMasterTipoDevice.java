/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CollMaster;

/**
 *
 * @author Claud
 */
public class CoolerMasterTipoDevice {
    public static String tipoDevice(String device){
        int devideId = CoolerMasterDevice.valueOf(device).getIndex();
        switch (devideId) {
            case 0:
                return "Keyboard";                
            case 1:
                return "Keyboard";
            case 2:
                 return "Keyboard";
            case 3:
                 return "Keyboard";
            case 4:
                 return "Mouse";
            case 5:
                return "Mouse";
            case 6:
                 return "Keyboard";
            case 7:
                 return "Keyboard";
            case 8:
                return "Mouse";
            case 9:
                return "Mouse";
            case 10:
                 return "Keyboard";
            case 11:
                 return "Keyboard";
            case 12:
                 return "Keyboard";
            case 13:
                 return "Keyboard";
            case 14:
                 return "Mouse";   
            case 15:
                 return "Keyboard";
            case 16:
                 return "Keyboard";
            case 17:
                 return "Keyboard";
            case 18:
                 return "Keyboard";
            case 19:
                 return "Keyboard";
            case 20:
                 return "Keyboard";    
            default:
                return "Desconhecido";
        }

    }
    }

