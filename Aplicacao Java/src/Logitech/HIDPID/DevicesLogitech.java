package Logitech.HIDPID;

import java.util.ArrayList;

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
    
public static ArrayList<DevicesLogitech> GetPerifericos() {
        ArrayList<DevicesLogitech> DevicesLogitech = new ArrayList<>();
        DevicesLogitech.add(new DevicesLogitech("G910", "Keyboard", (short) 0xC32B, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G910v2", "Keyboard", (short) 0xC335, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G915", "Keyboard", (short) 0xC541, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G810", "Keyboard", (short) 0xC337, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G810", "Keyboard", (short) 0xC331, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G815", "Keyboard", (short) 0xC33F, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G610", "Keyboard", (short) 0xC333, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G512", "Keyboard", (short) 0xC33C, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G512 SE", "Keyboard", (short) 0xC342, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G410", "Keyboard", (short) 0xC330, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G213", "Keyboard", (short) 0xC336, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("Pro", "Keyboard", (short) 0xC339, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G19", "Keyboard", (short) 0xC228, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G19s", "Keyboard", (short) 0xC229, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G600", "Mouse", (short) 0xC24A, 0, "default"));
        DevicesLogitech.add(new DevicesLogitech("G300s", "Mouse", (short) 0xC246, 0, "default"));
        DevicesLogitech.add(new DevicesLogitech("G510", "Keyboard", (short) 0xC22D, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G510s", "Keyboard", (short) 0xC22E, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G13", "Keypad", (short) 0xC21C, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G110", "Keyboard", (short) 0xC22B, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G710+", "Keyboard", (short) 0xC24D, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G105", "Keyboard", (short) 0xC248, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G15", "Keyboard", (short) 0xC222, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G11", "Keyboard", (short) 0xC225, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G213", "Keyboard", (short) 0xC336, 5, "default"));
        DevicesLogitech.add(new DevicesLogitech("G903", "Mouse", (short) 0xC086, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G903", "Mouse", (short) 0xC539, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G903/G703", "Mouse", (short) 0XC53A, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("POWERPLAY", "Mousepad", (short) 0xC53A, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G900", "Mouse", (short) 0xC539, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G703", "Mouse", (short) 0xC087, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G502 HERO", "Mouse", (short) 0xC08B, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G502", "Mouse", (short) 0xC332, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G403", "Mouse", (short) 0xC083, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G303", "Mouse", (short) 0xC080, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G203", "Mouse", (short) 0xC084, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G Pro", "Mouse", (short) 0xC085, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G Pro Wireless", "Mouse", (short) 0xC088, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G Pro Hero", "Mouse", (short) 0xC08C, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G633", "Headset", (short) 0x0A5C, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G933 Wifi", "Headset", (short) 0x0A5B, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G933 USB", "Headset", (short) 0x0A5D, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G935", "Headset", (short) 0x0A87, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G560", "Speaker", (short) 0x0A78, 4, "default"));
        
        return DevicesLogitech;
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
