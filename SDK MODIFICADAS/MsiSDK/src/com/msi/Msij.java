package com.msi;

import com.msi.sdk.MsiSDK;
import lombok.NonNull;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Main class for accessing Mystic Light devices and LEDs in an object oriented manner.
 * The available devices can be retrieved with {@link #getAllAvailableDevices()} and the LEDs of these devices can be
 * accessed via these objects.
 * If you don't want to use the OOP interface, you can directly access the Mystic Light SDK API functions via the
 * {@link MsiSDK} JNI interface.
 */
public class Msij {

    /**
     * Initializes a new MysticLight4j instance initializing the native API if necessary.
     * This constructor throws {@link IllegalStateException} if the JVM process is not running with administrator privileges
     * as these are required to access the mystic light API.
     * @throws de.matthiasfisch.mysticlight4j.api.MysticLightAPIException Thrown if initialization of the native API fails.
     */
    public Msij() {
        this(true, Paths.get(System.getProperty("user.dir")));
    }

    /**
     * Initializes a new MysticLight4j instance initializing the native API if necessary.
     * @param dllPath The path to the native DLL for the system architecture or to a directory containing this file.
     */
    public Msij(@NonNull final Path dllPath) {
        this(true, dllPath);
    }

    /**
     * Initializes a new MysticLight4j instance initializing the native API if necessary.
     * @param requireElevatedPrivileges Whether to enforce elevated privileges.
     * @param dllPath The path to the native DLL for the system architecture or to a directory containing this file.
     * @throws de.matthiasfisch.mysticlight4j.api.MysticLightAPIException Thrown if initialization of the native API fails.
     */
    public Msij(final boolean requireElevatedPrivileges, @NonNull final Path dllPath) {
        MsiSDK.loadNativeDll(dllPath);
        if (requireElevatedPrivileges && !MsiSDK.isProcessElevated()) {
            throw new IllegalStateException("The JVM must run with administrator privileges in order to control Mystic Light devices.");
        }
        MsiSDK.initialize();
    }

    /**
     * @return Returns all accessible Mystic Light devices.
     */
    public List<Device> getAllAvailableDevices() {
        return Arrays.stream(MsiSDK.getDeviceInfo())
                .map(Device::new)
                .collect(Collectors.toList());
    }
}
