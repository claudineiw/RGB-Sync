package com.CollMaster;

import com.sun.jna.Native;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CoolerMasterSDK {

    private CoolerMasterLibrary instancia;


    public static String extrairDll(){
        FileOutputStream osJarDll = null;
        String pa = "";
        try {
            
            String libName = "/X86X64/SDKDLLx";
            if (System.getProperty("os.arch").contains("64")) {
                libName += "64.dll";
            } else {
                libName += "86.dll";
            }   byte[] buffer = new byte[1024];
            int read = -1;
            InputStream isJarDll = CoolerMasterSDK.class.getResourceAsStream(libName);
            String tempDir = System.getProperty("java.io.tmpdir");
            File targetFile = new File(tempDir + "SDKDLL.dll");
            
            osJarDll = new FileOutputStream(targetFile);
            while ((read = isJarDll.read(buffer)) != -1) {
                osJarDll.write(buffer, 0, read);
            }   osJarDll.close();
            isJarDll.close();
            pa = targetFile.getAbsolutePath();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CoolerMasterSDK.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CoolerMasterSDK.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                osJarDll.close();
            } catch (IOException ex) {
                Logger.getLogger(CoolerMasterSDK.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    return pa;
    }


    /**
     * Cm4j main constructor that requires the Cm4jDevice object to work
     *
     * @param device Cm4jDevice object holding the information about the device
     */
    public CoolerMasterSDK() {   
        instancia = Native.load(extrairDll(), CoolerMasterLibrary.class);
    }

    public void setDevice(CoolerMasterDevice device){
         instancia.SetControlDevice(device.getIndex());
    }
    /**
     * Enables the LED connection. Turns the keyboard into "SW" (Software) mode
     *
     * @return True if everything went successfull, otherwise false
     */
    public byte enable(CoolerMasterDevice device) {
        return instancia.EnableLedControl(true,device.getIndex());
    }

    /**
     * Disables the LED connection. Turns the keyboard into "FM" (Firmware) mode
     *
     * @return True if everything went successfull, otherwise false
     */
    public byte disable(CoolerMasterDevice device) {
        return instancia.EnableLedControl(false, device.getIndex());
    }

    /**
     * @return Current Coolermaster SDK version
     */
    public int getSdkVersion() {
        return instancia.GetCM_SDK_DllVer();
    }

    /**
     * Sets the full keyboard LED colors (every key)
     *
     * @param color The color to set
     * @return True if everything went successfull, otherwise false
     */
    public byte setKeyboardColor(CoolerMasterColor color,CoolerMasterDevice device) {
        return instancia.SetFullLedColor(
                color.getRedAsByte(),
                color.getGreenAsByte(),
                color.getBlueAsByte(),
                device.getIndex());
    }

    /**
     * Sets the single-key LED color
     *
     * @param color The color to set
     * @return True if everything went successfull, otherwise false
     */
    public byte setKeyColor(int row, int column, CoolerMasterColor color,CoolerMasterDevice device) {
        return instancia.SetLedColor(row, column,
                color.getRedAsByte(),
                color.getGreenAsByte(),
                color.getBlueAsByte(),
                device.getIndex());
    }

    /**
     * @return If the device is plugged and works properly
     */
    public byte isDevicePlugged(CoolerMasterDevice device) {       
        return instancia.IsDevicePlug(device.getIndex());        
    }

    /**
     * Sets the effect
     *
     * @param effect The effect to set
     * @return True if everything went successfull, otherwise false
     */
    public byte setEffect(CoolerMasterEffect effect,CoolerMasterDevice device) {
        return instancia.SwitchLedEffect(effect.getIndex(),device.getIndex());
    }

    public CoolerMasterLayout getLayout(CoolerMasterDevice device) {
        return CoolerMasterLayout.fromIndex(instancia.GetDeviceLayout(device.getIndex()));
    }

    
    public  ArrayList<String> getDevicesConected(){
        ArrayList<String> conectados = new ArrayList<>();
        for(CoolerMasterDevice device:CoolerMasterDevice.values()){
            if(conectado(device.getIndex())==(byte)1){
                conectados.add(device.name());
            }
        }
        return conectados;
    }
    
    private  byte conectado(int device) {        
        return instancia.IsDevicePlug(device);
        
    }
    
}
