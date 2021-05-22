package ca.fiercest.cuesdk.link;

import ca.fiercest.cuesdk.enums.CorsairEventId;
import com.sun.jna.Structure;
import com.sun.jna.Union;

import java.util.Arrays;
import java.util.List;

public class LinkCorsairEvent extends Structure
{
    public int id;
    public UNION.ByReference event;

    public static class UNION extends Union
    {
        public LinkCorsairDeviceConnectionStatusChangedEvent deviceConnectionStatusChangedEvent;
        public LinkCorsairKeyEvent keyEvent;

        public static class ByReference extends UNION implements Structure.ByReference {}
        public static class ByValue extends UNION implements Structure.ByReference {}
    }

    public void read()
    {
        super.read();
        CorsairEventId id = CorsairEventId.byOrdinal(this.id);
        switch (id)
        {
            case CEI_KeyEvent:
                event.setType(LinkCorsairKeyEvent.class);
                break;
            case CEI_DeviceConnectionStatusChangedEvent:
                event.setType(LinkCorsairDeviceConnectionStatusChangedEvent.class);
                break;
        }
        event.read();
    }

    protected List<String> getFieldOrder()
    {
        return Arrays.asList("id", "event");
    }

    public static class ByReference extends LinkCorsairEvent implements Structure.ByReference {}
    public static class ByValue extends LinkCorsairEvent implements Structure.ByValue {}
}
