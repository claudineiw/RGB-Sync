package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.link.LinkCorsairChannelDeviceInfo;
import ca.fiercest.cuesdk.link.LinkCorsairChannelInfo;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CorsairChannel extends FrontendObject<LinkCorsairChannelInfo>
{
    public int totalLedsCount;
    public int devicesCount;
    public List<CorsairChannelDevice> devices = new ArrayList<>();

    public CorsairChannel(LinkCorsairChannelInfo parent)
    {
        super(parent);
        this.totalLedsCount = parent.totalLedsCount;
        this.devicesCount = parent.devicesCount;

        //Map Devices
        if(devicesCount != 0)
        {
            final LinkCorsairChannelDeviceInfo[] devices = (LinkCorsairChannelDeviceInfo[]) parent.devices.toArray(new LinkCorsairChannelDeviceInfo[parent.devicesCount]);
            for(LinkCorsairChannelDeviceInfo info : devices)
                this.devices.add(new CorsairChannelDevice(info));
        }

    }
}
