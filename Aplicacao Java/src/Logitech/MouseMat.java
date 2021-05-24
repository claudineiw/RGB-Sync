package Logitech;

import IPerifericos.IMouseMat;
import com.logitech.gaming.HIDPID.DevicesLogitech;
import com.logitech.gaming.LogiTechSDK;

public final class MouseMat extends ILogitech implements IMouseMat {
    public MouseMat(LogiTechSDK sdk,DevicesLogitech device) {
        super(sdk, device);
    }

    @Override
    public void colorirPorLed(int i) {
        colorirDispositivo();
    }

    @Override
    public int getCountLight() {
        return 1;
    }
       
       
    

}
