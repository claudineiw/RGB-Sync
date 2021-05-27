package com.logitech.gaming;

import java.io.*;
public class LogiLED {
    
    public static native boolean LogiLedInit();

    public static native boolean LogiLedInitWithName(char name[]);
    
    public static native double LogiLedGetConfigOptionNumber(String configPath, double defaultValue);

    public static native boolean LogiLedGetConfigOptionBool(String configPath, boolean defaultValue);

    public static native int LogiLedGetConfigOptionColorRed(String configPath, int defaultRed);

    public static native int LogiLedGetConfigOptionColorGreen(String configPath, int defaultGreen);

    public static native int LogiLedGetConfigOptionColorBlue(String configPath, int defaultBlue);

    public static native String LogiLedGetConfigOptionKeyInput(String configPath, String defaultValue);

    public static native boolean LogiLedSetConfigOptionLabel(String configPath, String label);

    //Generic functions => Apply to any device type.
    public static native boolean LogiLedSetTargetDevice(int targetDevice);

    public static native boolean LogiLedSaveCurrentLighting();

    public static native boolean LogiLedSetLighting(int redPercentage, int greenPercentage, int bluePercentage);

    public static native boolean LogiLedRestoreLighting();

    public static native boolean LogiLedFlashLighting(int redPercentage, int greenPercentage, int bluePercentage, int milliSecondsDuration, int milliSecondsInterval);

    public static native boolean LogiLedPulseLighting(int redPercentage, int greenPercentage, int bluePercentage, int milliSecondsDuration, int milliSecondsInterval);

    public static native boolean LogiLedStopEffects();

    //Per-key functions => only apply to LOGI_DEVICETYPE_PERKEY_RGB devices.
    public static native boolean LogiLedSetLightingFromBitmap(byte bitmap[]);

    public static native boolean LogiLedExcludeKeysFromBitmap(int keyList[]);

    public static native boolean LogiLedSetLightingForKeyWithScanCode(int keyCode, int redPercentage, int greenPercentage, int bluePercentage);

    public static native boolean LogiLedSetLightingForKeyWithHidCode(int keyCode, int redPercentage, int greenPercentage, int bluePercentage);

    public static native boolean LogiLedSetLightingForKeyWithQuartzCode(int keyCode, int redPercentage, int greenPercentage, int bluePercentage);

    public static native boolean LogiLedSetLightingForKeyWithKeyName(int keyName, int redPercentage, int greenPercentage, int bluePercentage);

    public static native boolean LogiLedSaveLightingForKey(int keyName);

    public static native boolean LogiLedRestoreLightingForKey(int keyName);

    //Per-key effects => only apply to LOGI_DEVICETYPE_PERKEY_RGB devices.
    public static native boolean LogiLedFlashSingleKey(int keyName, int redPercentage, int greenPercentage, int bluePercentage, int msDuration, int msInterval);

    public static native boolean LogiLedPulseSingleKey(int keyName, int startRedPercentage, int startGreenPercentage, int startBluePercentage, int finishRedPercentage, int finishGreenPercentage, int finishBluePercentage, int msDuration, boolean isInfinite);

    public static native boolean LogiLedStopEffectsOnKey(int keyName);

    //Zonal functions => only apply to devices with zones.
    public static native boolean LogiLedSetLightingForTargetZone(int deviceType, int zone, int redPercentage, int greenPercentage, int bluePercentage);

    public static native void LogiLedShutdown();

    public static String extrairDll() {
        String pa = "";
        String libName = "/x86x64/";
        if (System.getProperty("os.arch").contains("64")) {
            libName += "LogitechLedJNIx64.dll";
        } else {
            libName += "LogitechLedJNIx86.dll";
        }
        try {
            byte[] buffer = new byte[1024];
            int read = -1;

            InputStream isJarDll = LogiLED.class.getResourceAsStream(libName);
            String tempDir = System.getProperty("java.io.tmpdir").replace(" ","%20");
            File targetFile = new File(tempDir + "LogitechLedJNI.dll");
            FileOutputStream osJarDll = new FileOutputStream(targetFile);
            while ((read = isJarDll.read(buffer)) != -1) {
                osJarDll.write(buffer, 0, read);
            }
            osJarDll.close();
            isJarDll.close();
            pa = targetFile.getAbsolutePath();
        } catch (IOException e) {
            System.out.println("Unable to extract the LogitechLedJNI.dll from the jar.");
        }
        return pa;
    }

    // Extract the JNI DLL from the JAR and load it.
    static {
          System.load(extrairDll());
    }
}
