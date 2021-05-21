package CoolerMaster;

import com.CollMaster.CoolerMasterDevice;

public class Mouse extends ICoolerMaster{
    private final static int[][] zonasRGB = {{0x00100001, 0x00100002,0x00100003,0x00100004}};

    public Mouse(com.CollMaster.CoolerMasterSDK CoolerMasterSDK,CoolerMasterDevice device) {
        super(CoolerMasterSDK,device,zonasRGB);
    }
}
