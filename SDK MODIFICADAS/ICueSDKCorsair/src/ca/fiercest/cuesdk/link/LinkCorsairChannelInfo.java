package ca.fiercest.cuesdk.link;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class LinkCorsairChannelInfo extends Structure
{
    public int totalLedsCount;
    public int devicesCount;
    public LinkCorsairChannelDeviceInfo.ByReference devices; //Array

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("totalLedsCount", "devicesCount", "devices");
    }

    public static class ByReference extends LinkCorsairChannelInfo implements Structure.ByReference {}
    public static class ByValue extends LinkCorsairChannelInfo implements Structure.ByValue {}
}
