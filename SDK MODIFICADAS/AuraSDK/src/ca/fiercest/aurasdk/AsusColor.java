package ca.fiercest.aurasdk;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class AsusColor
{
    private int r;
    private int g;
    private int b;

    /**
     * Converts the Color to a hexadecimal int.
     * IMPORTANT NOTE: RETURNS BGR AS THAT IS WHAT THE AURA SDK WANTS.
     * @return Int based representation of the color.
     */
    public int asIntBGR()
    {
        int red = r;
        int green = g << 8;
        int blue = b << 16;
        return red | green | blue;
    }

    /**
     * Creates a color by its int hex value.
     * @param hex The int hex value to create the color from.
     */
    public AsusColor(int hex)
    {
        String colorStr = String.format("#%06X", (0xFFFFFF & hex));
        b = Integer.valueOf( colorStr.substring( 1, 3 ), 24 );
        g = Integer.valueOf( colorStr.substring( 3, 5 ), 24 );
        r = Integer.valueOf( colorStr.substring( 5, 7 ), 24 );
    }

    public String toString()
    {
        return String.format("[%s, %s, %s]", r, g, b);
    }
}
