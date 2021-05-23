package com.CollMaster;

/**
 * Device model information
 */
public enum CoolerMasterDevice {
    MasterKeys_Pro_L(0),
    MasterKeys_Pro_S(1),
    MasterKeys_Pro_L_White(2),
    MasterKeys_Pro_M_White(3),
    MasterMouse_Pro_L(4),
    MasterMouse_Pro_S(5),
    MasterKeys_Pro_M(6),
    MasterKeys_Pro_S_White(7),
    MM520(8),
    MM530(9),
    MK750(10),
    CK372(11),
    CK550_552(12),
    CK551(13),
    MM830(14),
    CK530(15),
    MK850(16),
    SK630(17),
    SK650(18),
    SK621(19),
    MK730(20),
    DEV_DEFAULT(0xFFFF);    
    private int index;

    CoolerMasterDevice(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }
}
