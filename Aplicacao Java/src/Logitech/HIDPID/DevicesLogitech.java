package Logitech.HIDPID;

public final class DevicesLogitech {      
    private final String model;
    private final String deviceType;
    private final short HID;
    private final int zonas;
    private final String layout;    
    private final short VID;
    private final String marca;
    
    public DevicesLogitech(String model, String deviceType, short HID, int zonas, String layout) {        
        this.model = model;
        this.deviceType = deviceType;
        this.HID = HID;
        this.zonas = zonas;
        this.layout = layout;     
        this.VID= 0x046D;
        this.marca="Logitech";
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

    public String getDeviceType() {
        return deviceType;
    }

    public short getHID() {
        return HID;
    }

    public int getZonas() {
        return zonas;
    }

    public String getLayout() {
        return layout;
    }

    @Override
    public String toString() {
        return String.format("VID=0x%04X, PID=0x%04X",VID,HID);
    }

    
    
    
    
    
    

}
