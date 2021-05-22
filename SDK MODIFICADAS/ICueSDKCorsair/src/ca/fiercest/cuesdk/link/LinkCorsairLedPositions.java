package ca.fiercest.cuesdk.link;

import com.sun.jna.Structure;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class LinkCorsairLedPositions extends Structure
{
    public int numberOfLed;
    public LinkCorsairLedPosition.ByReference pLedPosition; //Array

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("numberOfLed", "pLedPosition");
    }

    public static class ByReference extends LinkCorsairLedPositions implements Structure.ByReference {}
    public static class ByValue extends LinkCorsairLedPositions implements Structure.ByValue {}
}

