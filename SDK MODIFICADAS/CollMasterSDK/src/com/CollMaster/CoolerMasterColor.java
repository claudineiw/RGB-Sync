package com.CollMaster;

import java.awt.*;

public class CoolerMasterColor {

    private byte r;
    private byte g;
    private byte b;

    public CoolerMasterColor(int r, int g, int b) {
        if (r > 255 || g > 255 || b > 255 || r < 0 || g < 0 || b < 0) {
            throw new CoolerMasterException("RGB values must be 8-bit (0-255)");
        }

        this.r = (byte)r;
        this.g = (byte)g;
        this.b = (byte)b;
    }

    protected byte getRedAsByte() {
        return this.r;
    }

    protected byte getGreenAsByte() {
        return this.g;
    }

    protected byte getBlueAsByte() {
        return this.b;
    }

    public int getRed() {
        return this.r;
    }

    public int getGreen() {
        return this.g;
    }

    public int getBlue() {
        return this.b;
    }

    public static CoolerMasterColor from(Color color) {
        return new CoolerMasterColor(color.getRed(), color.getGreen(), color.getBlue());
    }
}
