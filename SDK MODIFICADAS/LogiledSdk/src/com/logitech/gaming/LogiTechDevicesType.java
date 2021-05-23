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
public enum LogiTechDevicesType {
    Keyboard(0x0),
    Mouse(0x3),
    MouseMat(0x4),
    Headset(0x8),
    Speaker(0xE);
    private int index;

    LogiTechDevicesType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }
}
