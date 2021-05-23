package Logitech;

import IPerifericos.ISpeaker;
import com.logitech.gaming.HIDPID.DevicesLogitech;
import com.logitech.gaming.LogiTechSDK;

public final class Speaker extends ILogitech implements ISpeaker {
    public Speaker(LogiTechSDK sdk,DevicesLogitech device) {
        super(sdk, device);
    }

}
