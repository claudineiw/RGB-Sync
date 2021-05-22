package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.LedId;
import ca.fiercest.cuesdk.link.LinkCorsairLedPosition;
import lombok.Getter;

@Getter
public class CorsairLedPosition extends FrontendObject<LinkCorsairLedPosition>
{
    private LedId ledId;

    /** values in mm */
    private double top;
    private double left;
    private double height;
    private double width;

    protected CorsairLedPosition(LinkCorsairLedPosition parent)
    {
        super(parent);
        ledId = LedId.byOrdinal(parent.ledId);
        top = parent.top;
        left = parent.left;
        height = parent.height;
        width = parent.width;
    }
}
