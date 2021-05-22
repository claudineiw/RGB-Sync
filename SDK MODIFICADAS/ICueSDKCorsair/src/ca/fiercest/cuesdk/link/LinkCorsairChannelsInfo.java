package ca.fiercest.cuesdk.link;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class LinkCorsairChannelsInfo extends Structure
{
    public int channelsCount;
    public LinkCorsairChannelInfo.ByReference channels; //Array

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("channelsCount", "channels");
    }

    public static class ByReference extends LinkCorsairChannelsInfo implements Structure.ByReference {}
    public static class ByValue extends LinkCorsairChannelsInfo implements Structure.ByValue {}
}
