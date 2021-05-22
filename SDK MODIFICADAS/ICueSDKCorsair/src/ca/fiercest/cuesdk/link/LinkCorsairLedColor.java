package ca.fiercest.cuesdk.link;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class LinkCorsairLedColor extends Structure
{
    public int ledId;
    // 0-255
    public int r;
    public int g;
    public int b;

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("ledId", "r", "g", "b");
    }

    public static class ByReference extends LinkCorsairLedColor implements Structure.ByReference {}
    public static class ByValue extends LinkCorsairLedColor implements Structure.ByValue {}
}
