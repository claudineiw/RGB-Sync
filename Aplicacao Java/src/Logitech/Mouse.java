package Logitech;

import IPerifericos.IMouse;
import com.logitech.gaming.HIDPID.DevicesLogitech;
import com.logitech.gaming.LogiTechSDK;

/**
 *
 * @author Claud
 */
public final class Mouse extends ILogitech implements IMouse {
    public Mouse(LogiTechSDK sdk,DevicesLogitech device) {
        super(sdk, device);
    }

}
