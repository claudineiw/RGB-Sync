package com.msi.sdk;

import com.google.common.annotations.VisibleForTesting;
import lombok.NonNull;
import lombok.Synchronized;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.Validate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

/**
 * This class provides the low-level access to the functions from the Mystic Light SDK.
 * If you want to use object oriented access, please have a look at {@link de.matthiasfisch.mysticlight4j.MysticLight4j} instead.
 * The methods in this class directly correspond to the native functions from the SDK. For documentation please confer to
 * <a href="https://storage-asset.msi.com/file/pdf/Mystic_Light_Software_Development_Kit.pdf">the official documentation</a> by MSI.
 * Before calling any method of this class it is required to call {@link #initialize()} or its overloading variants once in order to
 * load the native DLL and initialize the SDK.
 * For the SDK to properly work it is required that the process runs with elevated (administrator) privileges. To check this the method
 * {@link #isProcessElevated()} is provided for convenience.
 */
public class MsiSDK {
    protected static final String NATIVE_PATCH = "/nativeX64X86/";
    protected static final String SDK_PATCH="/x64x86/"; 
    protected static final String NATIVE_DLL_NAME_X86 = "mysticlight4j_native.dll";
    protected static final String NATIVE_DLL_NAME_X64 = "mysticlight4j_native_x64.dll";
    protected static final String SDK_DLL_NAME_X86 = "MysticLight_SDK.dll";
    protected static final String SDK_DLL_NAME_X64 = "MysticLight_SDK_x64.dll";

    /**
     * Static flag indicating whether the native DLL was already loaded.
     */
    private static boolean isNativeDllLoaded = false;

    /**
     * Static flag indicating whether the SDK was initialized.
     */
    private static boolean isInitialized = false;

    /**
     * Interaction with the Mystic Light API requires the process to run with administrator privileges.
     * This is a helper method for checking if the process is running with elevated privileges and is not actually part
     * of the Mystic Light API.
     * @return Returns true if the JVM is running with elevated privileges.
     */
    public static boolean isProcessElevated() {
        return MsiSDKNativeBinding.isProcessElevated();
    }

    /**
     * Initializes the Mystic Light API. This method must be called before any other method of the Mystic Light API
     * is called.
     * This method searches for the native DLL for the current system architecture in the current working directory.
     * If you the native DLLs are located elsewhere and you want to specify their location use {@link #initialize(Path)} instead.
     * This method will only load the DLL and initialize the SDK the first time it is called. Thereafter it will do nothing and it is safe to call it again.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static void initialize() throws MsiSDKException {
        final Path workingDirPath = Paths.get(System.getProperty("user.dir"));
       
        initialize(workingDirPath);
    }

    /**
     * Initializes the Mystic Light API loading the native DLL from the specified path. This method must be called before any other method of the Mystic Light API
     * is called.
     * This method will only load the DLL and initialize the SDK the first time it is called. Thereafter it will do nothing and it is safe to call it again.
     * @param path The path to the native DLL for the system architecture or to a directory containing this file.
     */
    @Synchronized
    public static void initialize(@NonNull final Path path) {
        // If the SDK was already initialized there is nothing to do
        if (isInitialized) {
            return;
        }

        // Load the native DLL if not yet done
        loadNativeDll(path);

        // Actually initialize the SDK
        MsiSDKNativeBinding.initialize();
        isInitialized = true;
    }
    
    
    public static String extrairDll(String patch, String nomeDll){
        String pa="";
        try {
			byte[] buffer = new byte[1024];
			int read = -1;

			InputStream isJarDll = MsiSDK.class.getResourceAsStream(patch+nomeDll);
                        String tempDir=System.getProperty("java.io.tmpdir");                        
                        File targetFile = new File(tempDir+nomeDll);
			FileOutputStream osJarDll = new FileOutputStream(targetFile);
			while ((read = isJarDll.read(buffer)) != -1) {
				osJarDll.write(buffer, 0, read);
			}
			osJarDll.close();
			isJarDll.close();
                        pa=targetFile.getAbsolutePath();			
		}
		catch (IOException e) {
			System.out.println("Unable to extract the CChromaEditorLibrary.dll from the jar."); 
		}        
        return pa;

    }
    
    
    /**
     * Loads the native DLL providing the bindings the the functions of the Mystic Light SDK.
     * This method must be called before calling any other method of this class except for {@link #initialize()} and its
     * overloading variants (as these implicitly call this method if not done already).
     * @param path The path to the native DLL for the system architecture or to a directory containing this file.
     */
    public static void loadNativeDll(@NonNull final Path path) {
        // If the native DLL was already loaded there is nothing to do
        if (isNativeDllLoaded) {
            return;
        }

        // DLLs can only be loaded on Microsoft Windows:
        final String operatingSystem = System.getProperty("os.name").toLowerCase(Locale.getDefault());
        if(!operatingSystem.startsWith("windows")) {
            throw new IllegalStateException("Mystic Light is only supported on Microsoft Windows operating systems");
        }
        final SystemArchitecture architecture = getSystemArchitecture();

        final File file = path.toFile();
        Validate.isTrue(file.exists(), "The path %s does not exist.", file.getAbsolutePath());
        Validate.isTrue(file.canRead(), "The path %s can not be read.", file.getAbsolutePath());

        final Path dllPath;
        if (file.isDirectory()) {
            switch (architecture) {
                case X86:
                    dllPath = path.resolve(Paths.get(extrairDll(NATIVE_PATCH,NATIVE_DLL_NAME_X86)));
                    break;                    
                case X64:
                    dllPath = path.resolve(Paths.get(extrairDll(NATIVE_PATCH,NATIVE_DLL_NAME_X64)));          
                    break;
                    
                default:
                    throw new IllegalStateException(String.format("Unsupported system architecture %s.", architecture));
            }
        } else {
            dllPath = file.toPath();
        }

        // Check that the DLL exists and is readable
        final File dllFile = dllPath.toFile();
        Validate.isTrue(dllFile.exists(), "The native DLL at %s does not exist.", dllFile.getAbsolutePath());
        Validate.isTrue(dllFile.isFile(), "The native DLL path %s is not a file.", dllFile.getAbsolutePath());
        Validate.isTrue(dllFile.canRead(), "The native DLL at %s can not be read.", dllFile.getAbsolutePath());

        // Check that SDK DLLs are present
        final Path dllDirectory = Paths.get(dllFile.getParentFile().getAbsolutePath());
        final File sdkDll;
        switch (architecture) {
            case X86:
                sdkDll = dllDirectory.resolve(extrairDll(SDK_PATCH,SDK_DLL_NAME_X86)).toFile(); break;
            case X64:
                sdkDll = dllDirectory.resolve(extrairDll(SDK_PATCH, SDK_DLL_NAME_X64)).toFile(); 
            
                break;
            default:
                throw new IllegalStateException(String.format("Unsupported system architecture %s.", architecture));
        }

        Validate.isTrue(sdkDll.exists(), "The MSI MysticLight SDK DLL is not present at expected path %s.", sdkDll.getAbsolutePath());
        Validate.isTrue(sdkDll.isFile(), "The MSI MysticLight SDK DLL %s is not a file.", sdkDll.getAbsolutePath());
        Validate.isTrue(sdkDll.canRead(), "The MSI MysticLight SDK DLL %s can not be read.", sdkDll.getAbsolutePath());

        // Load the native DLL
        System.load(dllPath.toAbsolutePath().toString());
        isNativeDllLoaded = true;
    }

    /**
     * Returns information about all installed devices that are compatible with Mystic Light. The information contains a
     * device ID and the number of LEDs of the device.
     * @return Returns information about all Mystic Light devices installed.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static DeviceInfo[] getDeviceInfo() throws MsiSDKException {
        return MsiSDKNativeBinding.getDeviceInfo();
    }

    public static String[] getDeviceName(@NonNull final String device) throws MsiSDKException {
        return MsiSDKNativeBinding.getDeviceName(device);
    }

    public static String getDeviceNameEx(@NonNull final String device, final int deviceId) throws MsiSDKException {
        return MsiSDKNativeBinding.getDeviceNameEx(device, deviceId);
    }

    /**
     * Returns information about a specific LED of a Mystic Light device. This information contains the name of the LED
     * and the styles supported by the LED.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param index The index of the LED.
     * @return Returns information about the specifed LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static LedInfo getLedInfo(@NonNull final String device, final int index) throws MsiSDKException {
        return MsiSDKNativeBinding.getLedInfo(device, index);
    }

    /**
     * This function retrieves the all LED name within LED area of specific device.
     * Note: This function apparently may return an empty array for some devices despite there are LEDs accessible.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @return Returns the names of the LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static String[] getLedName(@NonNull final String device) throws MsiSDKException {
        return MsiSDKNativeBinding.getLedName(device);
    }

    /**
     * Returns the current color of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the color of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static MsiColor getLedColor(@NonNull final String device, final int ledIndex) throws MsiSDKException {
        return MsiSDKNativeBinding.getLedColor(device, ledIndex);
    }

    /**
     * Returns the currently active style of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the active style of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static String getLedStyle(@NonNull final String device, final int ledIndex) throws MsiSDKException {
        return MsiSDKNativeBinding.getLedStyle(device, ledIndex);
    }

    /**
     * Returns the maximum brightness value of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the maximum brightness value of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static int getLedMaxBright(@NonNull final String device, final int ledIndex) throws MsiSDKException {
        return MsiSDKNativeBinding.getLedMaxBright(device, ledIndex);
    }

    /**
     * Returns the current brightness level of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the current brightness level of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static int getLedBright(@NonNull final String device, final int ledIndex) throws MsiSDKException {
        return MsiSDKNativeBinding.getLedBright(device, ledIndex);
    }

    /**
     * Returns the maximum speed level of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the maximum speed level of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static int getLedMaxSpeed(@NonNull final String device, final int ledIndex) throws MsiSDKException {
        return MsiSDKNativeBinding.getLedMaxSpeed(device, ledIndex);
    }

    /**
     * Returns the current speed level of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @return Returns the current speed level of the specified LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static int getLedSpeed(@NonNull final String device, final int ledIndex) throws MsiSDKException {
        return MsiSDKNativeBinding.getLedSpeed(device, ledIndex);
    }

    /**
     * Sets the color of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @param color The color to set.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static void setLedColor(@NonNull final String device, final int ledIndex, MsiColor color) throws MsiSDKException {
        MsiSDKNativeBinding.setLedColor(device, ledIndex, color);
    }

    public static void setLedColors(@NonNull final String device, int ledIndex, @NonNull final String[] ledNames, @NonNull final MsiColor color) throws MsiSDKException {
        throw new NotImplementedException("This function is currently not implemented");
    }

    public static void setLedColorEx(@NonNull final String device, final int ledIndex, @NonNull final String ledName, @NonNull final MsiColor color, final boolean sync) throws MsiSDKException {
        throw new NotImplementedException("This function is currently not implemented");
    }

    public static void setLedColorSync(@NonNull final String device, final int ledIndex, @NonNull final  String ledName, @NonNull final  MsiColor color, final boolean sync) throws MsiSDKException {
        throw new NotImplementedException("This function is currently not implemented");
    }

    /**
     * Sets the active style of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @param style The style to set. Must be one of the styles returned by {@link #getLedInfo(String, int)} for this LED.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static void setLedStyle(@NonNull final String device, final int ledIndex, @NonNull final String style) throws MsiSDKException {
        MsiSDKNativeBinding.setLedStyle(device, ledIndex, style);
    }

    /**
     * Sets the brightness value of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @param level The brightness level to set. Must be a value between 0 and {@link #getLedMaxBright(String, int)}.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static void setLedBright(@NonNull final String device, final int ledIndex, final int level) throws MsiSDKException {
        MsiSDKNativeBinding.setLedBright(device, ledIndex, level);
    }

    /**
     * Sets the speed level of a LED of a specific Mystic Light device.
     * @param device The identifier of the device the LED belongs to. This is a value as returned by {@link #getDeviceInfo()}.
     * @param ledIndex The index of the LED.
     * @param level The speed level to set. Must be a value between 0 and {@link #getLedMaxSpeed(String, int)}.
     * @throws MsiSDKException Thrown if the native function does not return {@code MLAPI_OK}.
     */
    public static void setLedSpeed(@NonNull final String device, final int ledIndex, final int level) throws MsiSDKException {
        MsiSDKNativeBinding.setLedSpeed(device, ledIndex, level);
    }

    /**
     * Helper method for unit tests to reset initialization of the class.
     * @param initializationStatus Whether the API should be marked as initialized.
     */
    @VisibleForTesting
    static void setInitializationStatus(final boolean initializationStatus) {
        MsiSDK.isNativeDllLoaded = initializationStatus;
        MsiSDK.isInitialized = initializationStatus;
    }

    private static SystemArchitecture getSystemArchitecture() {
        final String archValue = System.getProperty("os.arch").toLowerCase(Locale.getDefault());
        switch (archValue) {
            case "amd64": return SystemArchitecture.X64;
            case "x86": return SystemArchitecture.X86;
            default:
                throw new IllegalStateException(String.format("Detected unsupported system architecture '%s'. Only x86 and x64 are supported.", archValue));
        }
    }

    private enum SystemArchitecture {
        X86, X64
    }
}
