package com.CollMaster;

/**
 * Keyboard layout information
 */
public enum CoolerMasterLayout {
    INVALID(0),
    US(1),
    EU(2),
    JP(3);

    private int index;

    CoolerMasterLayout(int index) {
        this.index = index;
    }

    protected int getIndex() {
        return this.index;
    }

    protected static CoolerMasterLayout fromIndex(int index) {
        for (CoolerMasterLayout layout : CoolerMasterLayout.values()) {
            if (index == layout.getIndex())
                return layout;
        }
        return CoolerMasterLayout.INVALID;
    }
}
