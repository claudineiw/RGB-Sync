package com.logitech.gaming;

import com.logitech.gaming.HIDPID.DevicesLogitech;
import com.logitech.gaming.HIDPID.LogiTechLista;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogiTechSDK implements Runnable{
    private boolean alldone=false;
    private final LogiTechLista listaPerifericos;
    
    public LogiTechSDK(){
        InitSDK();   
        this.listaPerifericos=new LogiTechLista();
        new Thread(this).start();
    }
    
    public ArrayList<DevicesLogitech> getDevices(){
        return listaPerifericos.getListDevices();
    }    
    
    private boolean InitSDK(){        
        return LogiLED.LogiLedInit();        
    }

    private boolean InitWithName(char name[]){        
         return LogiLED.LogiLedInitWithName(name);        
    } 
    public double GetConfigOptionNumber(String configPath, double defaultValue){
    
         return LogiLED.LogiLedGetConfigOptionNumber(configPath, defaultValue);
    
    }

    public boolean GetConfigOptionBool(String configPath, boolean defaultValue){
         return LogiLED.LogiLedGetConfigOptionBool(configPath, defaultValue);
    }

    public int GetConfigOptionColorRed(String configPath, int defaultRed){
         return LogiLED.LogiLedGetConfigOptionColorRed(configPath, defaultRed);
    }

    public int GetConfigOptionColorGreen(String configPath, int defaultGreen){
         return  LogiLED.LogiLedGetConfigOptionColorGreen(configPath, defaultGreen);
    }

    public int GetConfigOptionColorBlue(String configPath, int defaultBlue){
         return  LogiLED.LogiLedGetConfigOptionColorBlue(configPath, defaultBlue);
    }

    public String GetConfigOptionKeyInput(String configPath, String defaultValue){
         return  LogiLED.LogiLedGetConfigOptionKeyInput(configPath, defaultValue);
    }

    public boolean SetConfigOptionLabel(String configPath, String label){
         return  LogiLED.LogiLedSetConfigOptionLabel(configPath, label);
    }

    //Generic functions => Apply to any device type.
    public boolean SetTargetDevice(int targetDevice){
         return LogiLED.LogiLedSetTargetDevice(targetDevice);
    }

    public boolean SaveCurrentLighting(){
         return LogiLED.LogiLedSaveCurrentLighting();
    }

    public  boolean SetLighting(LogiTechColor color){
         return LogiLED.LogiLedSetLighting(color.getR(),color.getG(),color.getB());
    }

    public boolean RestoreLighting(){
         return LogiLED.LogiLedRestoreLighting();
    }

    public  boolean FlashLighting(LogiTechColor color, int milliSecondsDuration, int milliSecondsInterval){
         return LogiLED.LogiLedFlashLighting(color.getR(),color.getG(),color.getB(), milliSecondsDuration, milliSecondsInterval);
    }

    public  boolean PulseLighting(LogiTechColor color, int milliSecondsDuration, int milliSecondsInterval){
         return LogiLED.LogiLedPulseLighting(color.getR(),color.getG(),color.getB(), milliSecondsDuration, milliSecondsInterval);
    }

    public  boolean StopEffects(){
         return LogiLED.LogiLedStopEffects();
    }

    //Per-key functions => only apply to LOGI_DEVICETYPE_PERKEY_RGB devices.
    public boolean SetLightingFromBitmap(byte bitmap[]){
         return LogiLED.LogiLedSetLightingFromBitmap(bitmap);
    }

    public  boolean ExcludeKeysFromBitmap(int keyList[]){
         return LogiLED.LogiLedExcludeKeysFromBitmap(keyList);
    }

    public  boolean SetLightingForKeyWithScanCode(int keyCode, LogiTechColor color){
         return LogiLED.LogiLedSetLightingForKeyWithScanCode(keyCode, color.getR(),color.getG(),color.getB());
    }

    public  boolean SetLightingForKeyWithHidCode(int keyCode, LogiTechColor color){
         return LogiLED.LogiLedSetLightingForKeyWithHidCode(keyCode,color.getR(),color.getG(),color.getB());
    }

    public  boolean SetLightingForKeyWithQuartzCode(int keyCode, LogiTechColor color){
         return LogiLED.LogiLedSetLightingForKeyWithQuartzCode(keyCode, color.getR(),color.getG(),color.getB());
    }

    public  boolean SetLightingForKeyWithKeyName(int keyName, LogiTechColor color){
         return LogiLED.LogiLedSetLightingForKeyWithKeyName(keyName, color.getR(),color.getG(),color.getB());
    }

    public  boolean SaveLightingForKey(int keyName){
        
         return LogiLED.LogiLedSaveLightingForKey(keyName);
        
    }

    public  boolean RestoreLightingForKey(int keyName){
         return LogiLED.LogiLedRestoreLightingForKey(keyName);
    }

    //Per-key effects => only apply to LOGI_DEVICETYPE_PERKEY_RGB devices.
    public  boolean FlashSingleKey(int keyName, LogiTechColor color, int msDuration, int msInterval){
    
         return LogiLED.LogiLedFlashSingleKey(keyName, color.getR(),color.getG(),color.getB(), msDuration, msInterval);
    
    }

    public  boolean PulseSingleKey(int keyName, LogiTechColor colorStart, LogiTechColor colorFinish, int msDuration, boolean isInfinite){
         return LogiLED.LogiLedPulseSingleKey(keyName, colorStart.getR(),colorStart.getG(),colorStart.getB(), colorFinish.getR(),colorFinish.getG(),colorFinish.getB(), msDuration, isInfinite);
    }

    public  boolean StopEffectsOnKey(int keyName){
         return LogiLED.LogiLedStopEffectsOnKey(keyName);
    }

    //Zonal functions => only apply to devices with zones.
    public  boolean SetLightingForTargetZone(LogiTechDevicesType deviceType, int zone, LogiTechColor color){    
         return LogiLED.LogiLedSetLightingForTargetZone(deviceType.getIndex(), zone, color.getR(),color.getG(),color.getB());
    
    }

    public void Shutdown(){
        alldone=true;
        LogiLED.LogiLedShutdown();
    }

    @Override
    public void run() {
        while(!alldone){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LogiTechSDK.class.getName()).log(Level.SEVERE, null, ex);
            }
           
             if(alldone){
                 System.out.println(alldone);
                 return;
             }
        }
    }
}
