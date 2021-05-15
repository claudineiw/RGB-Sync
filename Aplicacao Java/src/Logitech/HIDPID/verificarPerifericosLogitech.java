package Logitech.HIDPID;

import java.util.ArrayList;
import java.util.List;
import purejavahidapi.HidDeviceInfo;
import purejavahidapi.PureJavaHidApi;

public final class verificarPerifericosLogitech {

    private final ArrayList<listaPerifericos> listaPerifericos;

    public verificarPerifericosLogitech() {
        this.listaPerifericos = new ArrayList<>();
        testePerifericos();
    }

    private void testePerifericos() {
        List<HidDeviceInfo> devList = PureJavaHidApi.enumerateDevices();
        devList.forEach(info -> {
            listaPerifericos.add(new listaPerifericos(info.getVendorId(), info.getProductId(), info.getManufacturerString(), info.getPath(), info.getProductString()));
        });
    }

    public boolean testarPeriferico(String id) {
        return listaPerifericos.stream().anyMatch(periferico -> (periferico.toString().contains(id)));
    }
}
