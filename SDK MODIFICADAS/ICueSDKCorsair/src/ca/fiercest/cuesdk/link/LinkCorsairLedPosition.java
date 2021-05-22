package ca.fiercest.cuesdk.link;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class LinkCorsairLedPosition extends Structure
{
    public int ledId;
    public double top;
    public double left;
    public double height;
    public double width;
    /// values in mm.

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("ledId", "top", "left", "height", "width");
    }

    public static class ByReference extends LinkCorsairLedPosition implements Structure.ByReference {}
    public static class ByValue extends LinkCorsairLedPosition implements Structure.ByValue {}
}

