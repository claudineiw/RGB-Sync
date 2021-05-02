package perifericosComputador;

public final class listaPerifericos {

    private String DeviceName;
    private String HardWareID;
    private String DeviceProviderName;

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    public String getHardWareID() {
        return HardWareID;
    }

    public void setHardWareID(String HardWareID) {
        this.HardWareID = HardWareID;
    }

    public String getDeviceProviderName() {
        return DeviceProviderName;
    }

    public void setDeviceProviderName(String DeviceProviderName) {
        this.DeviceProviderName = DeviceProviderName;
    }

    @Override
    public String toString() {
        return "DeviceName=" + DeviceName + ", HardWareID=" + HardWareID + ", DeviceProviderName=" + DeviceProviderName + '}';
    }

}
