package com.CollMaster;

import com.sun.jna.Library;

interface CoolerMasterLibrary extends Library {

    int GetCM_SDK_DllVer();

    byte IsDevicePlug(int deviceIndex);

    byte EnableLedControl(boolean bEnable, int deviceIndex);

    byte SetLedColor(int iRow, int iColumn, byte r, byte g, byte b, int deviceIndex);

    byte SetFullLedColor(byte r, byte g, byte b, int deviceIndex);


    byte SwitchLedEffect(int iEffectIndex, int deviceIndex);

    void SetControlDevice(int deviceIndex);

    int GetDeviceLayout(int device);

}
