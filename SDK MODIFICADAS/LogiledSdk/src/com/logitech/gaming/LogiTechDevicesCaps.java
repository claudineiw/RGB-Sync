/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logitech.gaming;

/**
 *
 * @author Claud
 */
public enum LogiTechDevicesCaps {

    None(0),
    Monochrome(1 << 0),
    DeviceRGB(1 << 1),
    PerKeyRGB(1 << 2),
    All(Monochrome.ordinal() | DeviceRGB.ordinal() | PerKeyRGB.ordinal());

    private int index;

    LogiTechDevicesCaps(int index) {
        this.index = index;        
    }

    protected int getIndex() {
        return this.index;
    }
}
