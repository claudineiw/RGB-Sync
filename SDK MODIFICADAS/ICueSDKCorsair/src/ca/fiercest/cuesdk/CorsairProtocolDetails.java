package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.link.LinkCorsairProtocolDetails;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CorsairProtocolDetails extends FrontendObject<LinkCorsairProtocolDetails>
{
    private String sdkVersion;
    private String serverVersion;
    private int sdkProtocolVersion;
    private int serverProtocolVersion;
    private boolean breakingChanges;

    protected CorsairProtocolDetails(LinkCorsairProtocolDetails parent)
    {
        super(parent);
        sdkVersion = parent.sdkVersion.getString(0);
        serverVersion = parent.sdkVersion.getString(0);
        sdkProtocolVersion = parent.sdkProtocolVersion;
        serverProtocolVersion = parent.serverProtocolVersion;
        breakingChanges = parent.breakingChanges;
    }
}
