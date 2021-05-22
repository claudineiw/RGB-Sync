package ca.fiercest.cuesdk.link;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class LinkCorsairKeyEvent extends Structure
{
    public byte[] deviceId = new byte[(CueSDKLibrary.CORSAIR_DEVICE_ID_MAX)];
    public int keyId;
    public boolean isPressed;

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("deviceId", "keyId", "isPressed");
    }

    public static class ByReference extends LinkCorsairKeyEvent implements Structure.ByReference {}
    public static class ByValue extends LinkCorsairKeyEvent implements Structure.ByValue {}
}
