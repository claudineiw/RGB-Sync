package com.logitech.gaming.HIDPID;

import com.logitech.gaming.LogiTechDevicesType;
import java.util.ArrayList;
import java.util.List;
import purejavahidapi.HidDeviceInfo;
import purejavahidapi.PureJavaHidApi;

public final class LogiTechLista {

    private final ArrayList<LogiTechPerifericoHID> listaPerifericos;
    private final ArrayList<DevicesLogitech> DevicesLogitech = new ArrayList<>();
    private final ArrayList<DevicesLogitech> DevicesConectados = new ArrayList<>();
    
    public LogiTechLista() {
        this.listaPerifericos = new ArrayList<>();
        criarListaPerifericos();
        listaTodosOsPerifericos();
        criarListaPerifericosConectados();
    }

    private void criarListaPerifericos() {
        List<HidDeviceInfo> devList = PureJavaHidApi.enumerateDevices();
        devList.forEach(info -> {
            listaPerifericos.add(new LogiTechPerifericoHID(info.getVendorId(), info.getProductId(), info.getManufacturerString(), info.getPath(), info.getProductString()));
        });
    }

    public ArrayList<DevicesLogitech> getListDevices() {
        return DevicesConectados;
    }

    private void criarListaPerifericosConectados() {
        for (DevicesLogitech device : DevicesLogitech) {
            for (LogiTechPerifericoHID perifericoCon : listaPerifericos) {                
                if (perifericoCon.toString().contains(device.toString())) {
                        DevicesConectados.add(device);                  
                        break;
                }

            }
        }
    }

    private void listaTodosOsPerifericos() {
        DevicesLogitech.add(new DevicesLogitech("G910", LogiTechDevicesType.Keyboard, (short) 0xC32B, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G910v2", LogiTechDevicesType.Keyboard, (short) 0xC335, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G915", LogiTechDevicesType.Keyboard, (short) 0xC541, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G810", LogiTechDevicesType.Keyboard, (short) 0xC337, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G810", LogiTechDevicesType.Keyboard, (short) 0xC331, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G815", LogiTechDevicesType.Keyboard, (short) 0xC33F, 1, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G610", LogiTechDevicesType.Keyboard, (short) 0xC333, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G512", LogiTechDevicesType.Keyboard, (short) 0xC33C, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G512 SE", LogiTechDevicesType.Keyboard, (short) 0xC342, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G410", LogiTechDevicesType.Keyboard, (short) 0xC330, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G213", LogiTechDevicesType.Keyboard, (short) 0xC336, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("Pro", LogiTechDevicesType.Keyboard, (short) 0xC339, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G19", LogiTechDevicesType.Keyboard, (short) 0xC228, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G19s", LogiTechDevicesType.Keyboard, (short) 0xC229, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G600", LogiTechDevicesType.Mouse, (short) 0xC24A, 0, "default"));
        DevicesLogitech.add(new DevicesLogitech("G300s", LogiTechDevicesType.Mouse, (short) 0xC246, 0, "default"));
        DevicesLogitech.add(new DevicesLogitech("G510", LogiTechDevicesType.Keyboard, (short) 0xC22D, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G510s", LogiTechDevicesType.Keyboard, (short) 0xC22E, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G13", LogiTechDevicesType.Keyboard, (short) 0xC21C, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G110", LogiTechDevicesType.Keyboard, (short) 0xC22B, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G710+", LogiTechDevicesType.Keyboard, (short) 0xC24D, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G105", LogiTechDevicesType.Keyboard, (short) 0xC248, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G15", LogiTechDevicesType.Keyboard, (short) 0xC222, 0, "DE"));
        DevicesLogitech.add(new DevicesLogitech("G11", LogiTechDevicesType.Keyboard, (short) 0xC225, 0, "DE"));

        DevicesLogitech.add(new DevicesLogitech("G213", LogiTechDevicesType.Keyboard, (short) 0xC336, 5, "default"));
        DevicesLogitech.add(new DevicesLogitech("G903", LogiTechDevicesType.Mouse, (short) 0xC086, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G903", LogiTechDevicesType.Mouse, (short) 0xC539, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G903/G703", LogiTechDevicesType.Mouse, (short) 0XC53A, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("POWERPLAY", LogiTechDevicesType.MouseMat, (short) 0xC53A, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G900", LogiTechDevicesType.Mouse, (short) 0xC539, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G703", LogiTechDevicesType.Mouse, (short) 0xC087, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G502 HERO", LogiTechDevicesType.Mouse, (short) 0xC08B, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G502", LogiTechDevicesType.Mouse, (short) 0xC332, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G403", LogiTechDevicesType.Mouse, (short) 0xC083, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G303", LogiTechDevicesType.Mouse, (short) 0xC080, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G203", LogiTechDevicesType.Mouse, (short) 0xC084, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G Pro", LogiTechDevicesType.Mouse, (short) 0xC085, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G Pro Wireless", LogiTechDevicesType.Mouse, (short) 0xC088, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G Pro Hero", LogiTechDevicesType.Mouse, (short) 0xC08C, 1, "default"));
        DevicesLogitech.add(new DevicesLogitech("G633", LogiTechDevicesType.Headset, (short) 0x0A5C, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G933 Wifi", LogiTechDevicesType.Headset, (short) 0x0A5B, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G933 USB", LogiTechDevicesType.Headset, (short) 0x0A5D, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G935", LogiTechDevicesType.Headset, (short) 0x0A87, 2, "default"));
        DevicesLogitech.add(new DevicesLogitech("G560", LogiTechDevicesType.Speaker, (short) 0x0A78, 4, "default"));

    }

}
