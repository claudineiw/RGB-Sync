package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.link.CueSDKLibrary;
import ca.fiercest.cuesdk.link.LinkCorsairDeviceConnectionStatusChangedEvent;
import ca.fiercest.cuesdk.link.LinkCorsairLedPosition;
import ca.fiercest.cuesdk.link.LinkCorsairKeyEvent;
import ca.fiercest.cuesdk.link.LinkCorsairLedColor;
import ca.fiercest.cuesdk.link.LinkCorsairLedPositions;
import ca.fiercest.cuesdk.enums.CorsairAccessMode;
import ca.fiercest.cuesdk.enums.CorsairError;
import ca.fiercest.cuesdk.enums.CorsairEventId;
import ca.fiercest.cuesdk.enums.LedId;
import com.sun.jna.Pointer;
import javafx.util.Pair;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

@SuppressWarnings("ConstantConditions")
public class CueSDK
{
    @Getter private final CorsairProtocolDetails protocolDetails;

    private Consumer<KeyCallbackEvent> keyPressCallback;
    private Consumer<DeviceRemovedEvent> deviceRemovedEventCallback;

    private final List<CorsairDevice> deviceCache = new ArrayList<>();
    private final List<CorsairLedPosition> positionCache = new ArrayList<>();

    //region Constructors
    /**
     * Overloaded Constructor that does not use any access mode.
     * @throws NoServerException If no Corsair server is connected, this exception will be thrown.
     */
    public CueSDK() throws NoServerException
    {
        this(null);
    }

    /**
     * Overloaded Constructor that allows for exclusive access mode.
     * @param exclusiveAccessMode Start the SDK using the {@link CorsairAccessMode#CAM_ExclusiveLightingControl}.
     * @throws NoServerException If no Corsair server is connected, this exception will be thrown.
     */
    public CueSDK(boolean exclusiveAccessMode) throws NoServerException
    {
        this(exclusiveAccessMode ? CorsairAccessMode.CAM_ExclusiveLightingControl : null);
    }

    /**
     * (Base Constructor) Creates the CueSDK Object with a specific access mode.
     * @param accessMode The specific access mode will be applied on initialization.
     * @throws NoServerException If no Corsair server is connected, this exception will be thrown.
     */
    public CueSDK(CorsairAccessMode accessMode) throws NoServerException
    {
        protocolDetails = new CorsairProtocolDetails(CueSDKLibrary.INSTANCE.CorsairPerformProtocolHandshake());

        if(protocolDetails.getServerProtocolVersion() == 0)
        {
            if(CorsairError.byOrdinal(CueSDKLibrary.INSTANCE.CorsairGetLastError()) == CorsairError.CE_ServerNotFound)
                throw new NoServerException();
            PrintError();
        }

        if (protocolDetails.isBreakingChanges())
        {
            String sdkVersion = protocolDetails.getSdkVersion();
            String cueVersion = protocolDetails.getServerVersion();
            throw new RuntimeException("Incompatible SDK (" + sdkVersion + ") and CUE " + cueVersion + " versions.");
        }

        if(accessMode != null)
        {
            final boolean success = CueSDKLibrary.INSTANCE.CorsairRequestControl(accessMode.ordinal());
            if(!success)
                PrintError();
        }

        InitCallbacks();
    }
    //endregion

    //region Utilities
    /**
     * Prints the latest error from the SDK.
     */
    private void PrintError()
    {
        System.out.println(CorsairError.byOrdinal(CueSDKLibrary.INSTANCE.CorsairGetLastError()).getMessage());
    }

    /**
     * @return The number of devices connected to the SDK.
     */
    public int getDeviceCount()
    {
        return CueSDKLibrary.INSTANCE.CorsairGetDeviceCount();
    }

    /**
     * @return A list of the available devices connected to the Corsair SDK.
     */
    public List<CorsairDevice> getDevices()
    {
        if(!deviceCache.isEmpty())
            return deviceCache;

        if(getDeviceCount() < -1)
        {
            PrintError();
            return new ArrayList<>();
        }

        for(int i = 0; i < getDeviceCount(); i++)
            deviceCache.add(new CorsairDevice(CueSDKLibrary.INSTANCE.CorsairGetDeviceInfo(i)));
        return deviceCache;
    }

    /**
     * @return A list of the available LED positions that the SDK recognizes.
     */
    public List<CorsairLedPosition> getLedPostitions(){           
        if(!positionCache.isEmpty())
            return positionCache;
        final LinkCorsairLedPositions.ByReference positions = CueSDKLibrary.INSTANCE.CorsairGetLedPositions();

        if(positions.numberOfLed < 0)
        {
            PrintError();
            return new ArrayList<>();
        }

        final LinkCorsairLedPosition[] rawPositions = (LinkCorsairLedPosition[]) positions.pLedPosition.toArray(new LinkCorsairLedPosition[positions.numberOfLed]);
        for (LinkCorsairLedPosition rawPosition : rawPositions)
            positionCache.add(new CorsairLedPosition(rawPosition));
        return positionCache;
    }

    public Pointer GetLedPositionsByDeviceIndex(int deviceIndex){
        return CueSDKLibrary.INSTANCE.CorsairGetLedPositionsByDeviceIndex(deviceIndex);
    }
    
    public boolean SetLedsColorsBufferByDeviceIndex(int deviceIndex, int size, Pointer ledsColors){
        return CueSDKLibrary.INSTANCE.CorsairSetLedsColorsBufferByDeviceIndex(deviceIndex,size,ledsColors);
    }
    
    public boolean SetLedsColorsFlushBuffer(){
        return CueSDKLibrary.INSTANCE.CorsairSetLedsColorsFlushBuffer();
    }
    
    /**
     * Both {@link #getLedPostitions()} and {@link #getDevices()} rely on cached results. Call this method to reset their cache.
     * Note, this will repopulate the caches and may result in "some" performance loss.
     */
    public void ResetCaches()
    {
        getDevices().forEach(d -> DeviceIdHandler.Remove(d.getDeviceId()));
        positionCache.clear();
        deviceCache.clear();
    }
    //endregion

    //region Lighting
    /**
     * Sets the colors of a Map of each {@link LedId} to a {@link CorsairColor}.
     * @param colorMap The map of LedId's and Colors to apply to the light zones.
     */
    public void SetLedColors(Map<LedId, CorsairColor> colorMap)
    {
        if(colorMap == null)
            return;

        BiConsumer<Pair<LedId, CorsairColor>, LinkCorsairLedColor> copy = (srcP, dst) -> {
            dst.ledId = srcP.getKey().getId();
            dst.r = srcP.getValue().getR();
            dst.g = srcP.getValue().getG();
            dst.b = srcP.getValue().getB();
        };

        AtomicInteger index = new AtomicInteger(0);
        final LinkCorsairLedColor[] nativeArr = (LinkCorsairLedColor[]) new LinkCorsairLedColor().toArray(colorMap.size());

        colorMap.forEach((key, value) -> copy.accept(new Pair<>(key, value), nativeArr[index.getAndIncrement()]));

        boolean success = CueSDKLibrary.INSTANCE.CorsairSetLedsColors(nativeArr.length, nativeArr[0]);

        if(!success)
            PrintError();

    }

    /**
     * Sets the color of a single LedId zone.
     * @param id The LedId to set the color of.
     * @param color The color to set the LedId to.
     */
    public void SetLedColor(LedId id, CorsairColor color)
    {
        if(id == null || color == null)
            return;

        LinkCorsairLedColor col = new LinkCorsairLedColor(id.getId(), color.getR(), color.getG(), color.getB());
        boolean success = CueSDKLibrary.INSTANCE.CorsairSetLedsColors(1, col);

        if(!success)
            PrintError();
    }

    /**
     * Gets the Color of a specific LedId zone.
     * @param id The id of the key to get the color of.
     * @return Color of the specified LedId. Nullable if id is null or an error occurs.
     */
    public CorsairColor getLedColor(LedId id)
    {
        if(id == null)
            return null;

        LinkCorsairLedColor col = new LinkCorsairLedColor(id.getId(), 0, 0, 0);
        boolean success = CueSDKLibrary.INSTANCE.CorsairGetLedsColors(1, col);

        if(!success)
        {
            PrintError();
            return null;
        }

        return new CorsairColor(col.r, col.g, col.b);

    }
    //endregion

    //region Control
    /**
     * Requests a certain AccessMode while the SDK is connected.
     * @param accessMode The requested access mode.
     * @return If the operation was successful or not.
     */
    public boolean RequestAccessControl(CorsairAccessMode accessMode)
    {
        return CueSDKLibrary.INSTANCE.CorsairRequestControl(accessMode.ordinal());
    }

    /**
     * Releases a certain AccessMode while the SDK is connected.
     * @param accessMode The access mode to release.
     * @return If the operation was successful or not.
     */
    public boolean ReleaseAccessControl(CorsairAccessMode accessMode)
    {
        return CueSDKLibrary.INSTANCE.CorsairReleaseControl(accessMode.ordinal());
    }

    /**
     * @return An object storing information on the Corsair Handshake and Protocol information.
     */
    public CorsairProtocolDetails GetSDKInfo()
    {
        return protocolDetails;
    }
    //endregion

    //region Event Callbacks
    /**
     * Initializes the Event Callbacks to send to {@link #RegisterKeypressCallback(Consumer)} and {@link #RegisterDeviceChangedCallback(Consumer)}.
     */
    private void InitCallbacks()
    {
        CueSDKLibrary.INSTANCE.CorsairSubscribeForEvents((context, event) -> {
            event.read();
            if(event.id == CorsairEventId.CEI_KeyEvent.ordinal())
            {
                LinkCorsairKeyEvent keyEvent = event.event.keyEvent;
                KeyCallbackEvent callbackEvent = new KeyCallbackEvent((byte)keyEvent.keyId, keyEvent.isPressed);
                if(keyPressCallback != null)
                    keyPressCallback.accept(callbackEvent);
            }
            else if (event.id == CorsairEventId.CEI_DeviceConnectionStatusChangedEvent.ordinal())
            {
                LinkCorsairDeviceConnectionStatusChangedEvent changedEvent = event.event.deviceConnectionStatusChangedEvent;
                DeviceRemovedEvent callbackEvent = new DeviceRemovedEvent(); //new DeviceRemovedEvent(Optional.ofNullable(DeviceIdHandler.getById(changedEvent.deviceId)), changedEvent.isConnected);
                ResetCaches();
                if(deviceRemovedEventCallback != null)
                    deviceRemovedEventCallback.accept(callbackEvent);
            }
        }, null);
    }

    /**
     * Registers a callback when a key is pressed.
     * @param callback Called when a key was pressed.
     */
    public void RegisterKeypressCallback(Consumer<KeyCallbackEvent> callback)
    {
        keyPressCallback = callback;
    }

    /**
     * Registers a callback when a device is connected or disconnected.
     * Note: This feature currently only detects if a device connects or disconnects. It does not distinguish between the two.
     * @param callback Called when a device is connected or disconnected.
     */
    public void RegisterDeviceChangedCallback(Consumer<DeviceRemovedEvent> callback)
    {
        deviceRemovedEventCallback = callback;
    }

    /**
     * Stops accepting callbacks for KeyPresses.
     */
    public void UnRegisterKeypressCallback()
    {
        keyPressCallback = null;
    }

    /**
     * Stops accepting callbacks for Devices connecting or disconnecting.
     */
    public void UnRegisterDeviceChangedCallback()
    {
        deviceRemovedEventCallback = null;
    }
    //endregion
}
