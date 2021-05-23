package Logitech;

import IPerifericos.IHeadSet;
import com.logitech.gaming.HIDPID.DevicesLogitech;
import com.logitech.gaming.LogiTechSDK;

public final class HeadSet extends ILogitech implements IHeadSet {
    public HeadSet(LogiTechSDK sdk,DevicesLogitech device) {
        super(sdk, device);
    }

}
