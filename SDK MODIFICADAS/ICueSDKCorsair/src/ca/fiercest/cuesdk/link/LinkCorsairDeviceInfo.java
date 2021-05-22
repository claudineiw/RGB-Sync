package ca.fiercest.cuesdk.link;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class LinkCorsairDeviceInfo extends Structure
{
    public int type;
    public Pointer model;
    public int physicalLayout;
    public int logicalLayout;
    public int capsMask;
    public int ledsCount;
    public LinkCorsairChannelsInfo channels;
    public byte[] deviceId = new byte[(CueSDKLibrary.CORSAIR_DEVICE_ID_MAX)];

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("type", "model", "physicalLayout", "logicalLayout", "capsMask", "ledsCount", "channels", "deviceId");
    }

    public static class ByReference extends LinkCorsairDeviceInfo implements Structure.ByReference {}
    public static class ByValue extends LinkCorsairDeviceInfo implements Structure.ByValue {}
}

