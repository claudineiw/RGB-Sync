package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.CorsairChannelDeviceType;
import ca.fiercest.cuesdk.link.LinkCorsairChannelDeviceInfo;

public class CorsairChannelDevice extends FrontendObject<LinkCorsairChannelDeviceInfo>
{
    public CorsairChannelDeviceType type;
    public int deviceLedCount;

    public CorsairChannelDevice(LinkCorsairChannelDeviceInfo parent)
    {
        super(parent);
        this.type = CorsairChannelDeviceType.byOrdinal(parent.type);
        this.deviceLedCount = parent.deviceLedCount;
    }
}
