package com.logitech.gaming.HIDPID;

import com.logitech.gaming.LogiTechDevicesType;

public final class DevicesLogitech {

    private final String model;
    private final LogiTechDevicesType deviceType;
    private final short PID;
    private final int zonas;
    private final String layout;
    private final short VID;
    private final String marca;

    public DevicesLogitech(String model, LogiTechDevicesType deviceType, short PID, int zonas, String layout) {
        this.model = model;
        this.deviceType = deviceType;
        this.PID = PID;
        this.zonas = zonas;
        this.layout = layout;
        this.VID = 0x046D;
        this.marca = "Logitech";
    }

    public String getMarca() {
        return marca;
    }

    public short getVID() {
        return VID;
    }

    public String getModel() {
        return model;
    }

    public LogiTechDevicesType getDeviceType() {
        return deviceType;
    }

    public short getPID() {
        return PID;
    }

    public int getZonas() {
        return zonas;
    }

    public String getLayout() {
        return layout;
    }

    @Override
    public String toString() {
        return String.format("VID=0x%04X, PID=0x%04X", VID, PID);
    }

}
