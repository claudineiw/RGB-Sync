package com.msi.sdk;

import com.google.common.annotations.VisibleForTesting;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.Locale;

@NoArgsConstructor(access = AccessLevel.PACKAGE, onConstructor_ = @VisibleForTesting)
class MsiSDKNativeBinding {
    /**
     * Interaction with the Mystic Light API requires the process to run with administrator privileges.
     * This is a helper method for checking if the process is running with elevated privileges and is not actually part
     * of the Mystic Light API.
     * @return Returns true if the JVM is running with elevated privileges.
     */
    public static native boolean isProcessElevated();

    /**
     * Initializes the Mystic Light API. This method must be called before any other method of the Mystic Light API
     * is called.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native void initialize() throws MsiSDKException;

    /**
     * Returns information about all installed devices that are compatible with Mystic Light. The information contains a
     * device ID and the number of LEDs of the device.
     * @return Returns information about all Mystic Light devices installed.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native DeviceInfo[] getDeviceInfo() throws MsiSDKException;

    public static native String[] getDeviceName(String device) throws MsiSDKException;

    public static native String getDeviceNameEx(String device, int deviceId) throws MsiSDKException;

    /**
     * Returns information about a specific LED of a Mystic Light device. This information contains the name of the LED
     * and the styles supported by the LED.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param index The index of the LED.
     * @return Returns information about the specifed LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native LedInfo getLedInfo(String device, int index) throws MsiSDKException;

    /**
     * This function retrieves the all LED name within LED area of specific device.
     * Note: This function apparently may return an empty array for some devices despite there are LEDs accessible.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @return Returns the names of the LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native String[] getLedName(String device) throws MsiSDKException;

    /**
     * Returns the current color of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the color of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native MsiColor getLedColor(String device, int ledIndex) throws MsiSDKException;

    /**
     * Returns the currently active style of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the active style of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native String getLedStyle(String device, int ledIndex) throws MsiSDKException;

    /**
     * Returns the maximum brightness value of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the maximum brightness value of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native int getLedMaxBright(String device, int ledIndex) throws MsiSDKException;

    /**
     * Returns the current brightness level of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the current brightness level of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native int getLedBright(String device, int ledIndex) throws MsiSDKException;

    /**
     * Returns the maximum speed level of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the maximum speed level of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native int getLedMaxSpeed(String device, int ledIndex) throws MsiSDKException;

    /**
     * Returns the current speed level of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the current speed level of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native int getLedSpeed(String device, int ledIndex) throws MsiSDKException;

    /**
     * Sets the color of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @param color The color to set.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native void setLedColor(String device, int ledIndex, MsiColor color) throws MsiSDKException;

    public static native void setLedColors(String device, int ledIndex, String[] ledNames, MsiColor color) throws MsiSDKException;

    public static native void setLedColorEx(String device, int ledIndex, String ledName, MsiColor color, boolean sync) throws MsiSDKException;

    public static native void setLedColorSync(String device, int ledIndex, String ledName, MsiColor color, boolean sync) throws MsiSDKException;

    /**
     * Sets the active style of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @param style The style to set. Must be one of the styles returned by {@link #getLedInfo(String, int)} for this LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native void setLedStyle(String device, int ledIndex, String style) throws MsiSDKException;

    /**
     * Sets the brightness value of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @param level The brightness level to set. Must be a value between 0 and {@link #getLedMaxBright(String, int)}.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native void setLedBright(String device, int ledIndex, int level) throws MsiSDKException;

    /**
     * Sets the speed level of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @param level The speed level to set. Must be a value between 0 and {@link #getLedMaxSpeed(String, int)}.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static native void setLedSpeed(String device, int ledIndex, int level) throws MsiSDKException;
}
