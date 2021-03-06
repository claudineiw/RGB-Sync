package com.msi.sdk;

import lombok.*;

/**
 * Information about a device as returned by {@link MysticLightNativeBinding#getDeviceInfo()}.
 * The device type ({@link #getDeviceType()}) should be used to identify a device when calling other functions
 * of the Mystic Light API.
 */
@Getter
@EqualsAndHashCode
@ToString
public final class DeviceInfo {
    private final String deviceType;
    @EqualsAndHashCode.Exclude
    private final int ledCount;

    /**
     * @param deviceType The identifier for the device.
     * @param ledCount The number of LEDs of the device.
     */
    public DeviceInfo(@NonNull final String deviceType, final int ledCount) {
        this.deviceType = deviceType;
        this.ledCount = ledCount;
    }
}
