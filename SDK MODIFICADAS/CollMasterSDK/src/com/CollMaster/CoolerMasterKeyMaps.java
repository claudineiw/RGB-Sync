package com.CollMaster;

import java.util.ArrayList;
import java.util.List;

public class CoolerMasterKeyMaps {

    private static final List<CoolerMasterRowColumn> CKxxx_JP = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterKeysL_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> CKxxx_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> CKxxx_EU = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterKeysMK750_850_JP = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterKeysMK750_850_EU = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterKeysMK750_850_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterKeysS_EU = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterKeysS_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterKeysM_EU = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterKeysM_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterKeysL_EU = new ArrayList<>();
/*
    private static final List<CoolerMasterRowColumn> MK730_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MK730_UE = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MK730_JP = new ArrayList<>();

    private static final List<CoolerMasterRowColumn> SK621_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> SK621_UE = new ArrayList<>();

    private static final List<CoolerMasterRowColumn> SK650_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> SK650_UE = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> SK650_JP = new ArrayList<>();

    private static final List<CoolerMasterRowColumn> SK630_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> SK630_UE = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> SK630_JP = new ArrayList<>();

    private static final List<CoolerMasterRowColumn> CK530_US = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> CK530_UE = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> CK530_JP = new ArrayList<>();*/

    private static final List<CoolerMasterRowColumn> MasterMouse_L = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MasterMouse_S = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MM530 = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MM520 = new ArrayList<>();
    private static final List<CoolerMasterRowColumn> MM830 = new ArrayList<>();

    public CoolerMasterKeyMaps() {
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable1, 0, 18));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable2, 0, 19));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable3, 0, 20));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable4, 0, 21));

        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 18));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 19));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 20));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 21));

        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backslash, 2, 14));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 18));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 19));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 20));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 21));

        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 3, 14));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 18));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 19));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 20));

        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 18));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 19));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 20));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 21));

        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 18));
        MasterKeysL_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 20));

        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable1, 0, 18));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable2, 0, 19));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable3, 0, 20));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable4, 0, 21));

        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 18));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 19));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 20));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 21));

        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 2, 14));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 18));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 19));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 20));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 21));

        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsTilde, 3, 12));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 18));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 19));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 20));

        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsBackslash, 4, 1));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 18));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 19));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 20));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 21));

        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 18));
        MasterKeysL_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 20));

        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));

        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 15));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 16));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 17));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 18));

        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backslash, 2, 14));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 15));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 16));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 17));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 18));

        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 3, 14));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 15));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 16));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 17));

        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 15));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 16));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 17));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 18));

        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 15));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num00, 5, 16));
        MasterKeysM_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 17));

        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));

        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 15));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 16));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 17));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 18));

        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backslash, 2, 14));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 15));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 16));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 17));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 18));

        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsTilde, 3, 12));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 15));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 16));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 17));

        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsBackslash, 4, 1));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 15));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 16));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 17));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 18));

        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 15));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num00, 5, 16));
        MasterKeysM_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 17));

        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));

        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));

        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backslash, 2, 14));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));

        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 3, 14));

        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));

        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        MasterKeysS_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));

        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));

        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));

        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 2, 14));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));

        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsTilde, 3, 12));

        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsBackslash, 4, 1));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));

        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        MasterKeysS_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));

        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable1, 0, 18));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable2, 0, 19));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable3, 0, 20));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable4, 0, 21));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom1, 0, 22));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom23, 0, 23));

        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 18));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 19));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 20));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 21));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom2, 1, 22));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom24, 1, 23));

        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backslash, 2, 14));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 18));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 19));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 20));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 21));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom3, 2, 22));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom25, 2, 23));

        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 3, 14));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 18));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 19));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 20));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom4, 3, 22));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom26, 3, 23));

        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 18));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 19));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 20));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 21));

        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 18));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 20));

        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom5, 6, 0));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom6, 6, 1));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom7, 6, 2));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom8, 6, 3));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom9, 6, 4));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom10, 6, 5));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom11, 6, 6));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom12, 6, 7));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom13, 6, 8));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom14, 6, 9));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom15, 6, 10));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom16, 6, 11));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom17, 6, 12));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom18, 6, 13));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom19, 6, 14));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom20, 6, 15));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom21, 6, 16));
        MasterKeysMK750_850_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom22, 6, 17));

        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable1, 0, 18));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable2, 0, 19));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable3, 0, 20));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable4, 0, 21));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom1, 0, 22));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom23, 0, 23));

        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 18));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 19));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 20));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 21));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom2, 1, 22));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom24, 1, 23));

        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 2, 14));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 18));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 19));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 20));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 21));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom3, 2, 22));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom25, 2, 23));

        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsTilde, 3, 12));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 18));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 19));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 20));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom4, 3, 22));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom26, 3, 23));

        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsBackslash, 4, 1));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 18));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 19));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 20));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 21));

        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 18));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 20));

        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom5, 6, 0));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom6, 6, 1));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom7, 6, 2));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom8, 6, 3));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom9, 6, 4));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom10, 6, 5));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom11, 6, 6));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom12, 6, 7));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom13, 6, 8));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom14, 6, 9));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom15, 6, 10));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom16, 6, 11));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom17, 6, 12));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom18, 6, 13));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom19, 6, 14));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom20, 6, 15));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom21, 6, 16));
        MasterKeysMK750_850_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom22, 6, 17));

        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable1, 0, 18));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable2, 0, 19));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable3, 0, 20));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Programmable4, 0, 21));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom1, 0, 22));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom23, 0, 23));

        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International1, 1, 13));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 18));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 19));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 20));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 21));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom2, 1, 22));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom24, 1, 23));

        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 2, 14));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 18));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 19));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 20));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 21));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom3, 2, 22));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom25, 2, 23));

        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backslash, 3, 14));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 18));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 19));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 20));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom4, 3, 22));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom26, 3, 23));

        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International2, 4, 12));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 18));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 19));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 20));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 21));

        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International3, 5, 4));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International4, 5, 8));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International5, 5, 9));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 18));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 20));

        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom5, 6, 0));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom6, 6, 1));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom7, 6, 2));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom8, 6, 3));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom9, 6, 4));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom10, 6, 5));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom11, 6, 6));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom12, 6, 7));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom13, 6, 8));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom14, 6, 9));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom15, 6, 10));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom16, 6, 11));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom17, 6, 12));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom18, 6, 13));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom19, 6, 14));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom20, 6, 15));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom21, 6, 16));
        MasterKeysMK750_850_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Custom22, 6, 17));

        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));

        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 18));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 19));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 20));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 21));

        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backslash, 2, 14));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 18));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 19));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 20));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 21));

        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 3, 14));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 18));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 19));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 20));

        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 18));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 19));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 20));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 21));

        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 18));
        CKxxx_US.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 20));

        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));

        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 18));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 19));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 20));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 21));

        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 2, 14));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 18));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 19));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 20));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 21));

        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsTilde, 3, 12));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 18));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 19));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 20));

        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NonUsBackslash, 4, 1));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 18));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 19));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 20));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 21));

        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 18));
        CKxxx_EU.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 20));

        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Escape, 0, 0));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F1, 0, 1));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F2, 0, 2));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F3, 0, 3));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F4, 0, 4));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F5, 0, 6));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F6, 0, 7));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F7, 0, 8));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F8, 0, 9));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F9, 0, 11));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F10, 0, 12));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F11, 0, 13));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F12, 0, 14));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PrintScreen, 0, 15));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ScrollLock, 0, 16));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PauseBreak, 0, 17));

        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_GraveAccentAndTilde, 1, 0));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_1, 1, 1));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_2, 1, 2));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_3, 1, 3));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_4, 1, 4));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_5, 1, 5));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_6, 1, 6));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_7, 1, 7));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_8, 1, 8));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_9, 1, 9));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_0, 1, 10));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_MinusAndUnderscore, 1, 11));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_EqualsAndPlus, 1, 12));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International1, 1, 13));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backspace, 1, 14));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Insert, 1, 15));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Home, 1, 16));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageUp, 1, 17));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumLock, 1, 18));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumSlash, 1, 19));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumAsterisk, 1, 20));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumMinus, 1, 21));

        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Tab, 2, 0));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Q, 2, 1));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_W, 2, 2));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_E, 2, 3));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_R, 2, 4));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_T, 2, 5));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Y, 2, 6));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_U, 2, 7));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_I, 2, 8));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_O, 2, 9));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_P, 2, 10));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketLeft, 2, 11));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_BracketRight, 2, 12));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Enter, 2, 14));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Delete, 2, 15));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_End, 2, 16));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PageDown, 2, 17));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num7, 2, 18));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num8, 2, 19));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num9, 2, 20));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPlus, 2, 21));

        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CapsLock, 3, 0));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_A, 3, 1));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_S, 3, 2));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_D, 3, 3));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_F, 3, 4));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_G, 3, 5));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_H, 3, 6));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_J, 3, 7));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_K, 3, 8));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_L, 3, 9));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SemicolonAndColon, 3, 10));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ApostropheAndDoubleQuote, 3, 11));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Backslash, 3, 14));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num4, 3, 18));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num5, 3, 19));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num6, 3, 20));

        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftShift, 4, 0));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Z, 4, 2));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_X, 4, 3));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_C, 4, 4));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_V, 4, 5));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_B, 4, 6));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_N, 4, 7));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_M, 4, 8));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_CommaAndLessThan, 4, 9));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_PeriodAndBiggerThan, 4, 10));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_SlashAndQuestionMark, 4, 11));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International2, 4, 12));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightShift, 4, 14));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowUp, 4, 16));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num1, 4, 18));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num2, 4, 19));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num3, 4, 20));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumEnter, 4, 21));

        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftCtrl, 5, 0));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftGui, 5, 1));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_LeftAlt, 5, 2));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International3, 5, 4));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Space, 5, 6));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International4, 5, 8));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_International5, 5, 9));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightAlt, 5, 10));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightGui, 5, 11));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Application, 5, 12));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_RightCtrl, 5, 14));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowLeft, 5, 15));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowDown, 5, 16));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_ArrowRight, 5, 17));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_Num0, 5, 18));
        CKxxx_JP.add(new CoolerMasterRowColumn(CoolerMasterLedId.Keyboard_NumPeriodAndDelete, 5, 20));

        MasterMouse_L.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse1, 0, 0));
        MasterMouse_L.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse2, 0, 1));
        MasterMouse_L.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse3, 0, 2));
        MasterMouse_L.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse4, 0, 3));

        MasterMouse_S.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse1, 0, 0));
        MasterMouse_S.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse2, 0, 1));

        MM530.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse1, 0, 0));
        MM530.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse2, 0, 1));
        MM530.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse3, 0, 2));

        MM520.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse1, 0, 0));
        MM520.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse2, 0, 1));
        MM520.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse3, 0, 2));

        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse1, 0, 0));
        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse2, 0, 1));
        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse3, 0, 2));
        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse4, 0, 3));
        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse5, 0, 4));
        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse6, 0, 5));
        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse7, 0, 6));
        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse8, 0, 7));
        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse9, 0, 8));
        MM830.add(new CoolerMasterRowColumn(CoolerMasterLedId.Mouse2, 0, 9));

    }

    @SuppressWarnings("fallthrough")
    public List<CoolerMasterRowColumn> getKeys(CoolerMasterLayout layout, CoolerMasterDevice device) {
        int devideId = device.getIndex();
        int deviceLayout = layout.getIndex();
        switch (devideId) {
            case 0:
                if (deviceLayout == 1) {
                    return MasterKeysL_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysL_EU;
                }

            case 1:
                if (deviceLayout == 1) {
                    return MasterKeysS_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysS_EU;
                }
            case 2:
                if (deviceLayout == 1) {
                    return MasterKeysL_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysL_EU;
                }
            case 3:
                if (deviceLayout == 1) {
                    return MasterKeysM_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysM_EU;
                }
            case 4:
                return MasterMouse_L;
            case 5:
                return MasterMouse_S;
            case 6:
                if (deviceLayout == 1) {
                    return MasterKeysM_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysM_EU;
                }
            case 7:
                if (deviceLayout == 1) {
                    return MasterKeysS_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysS_EU;
                }
            case 8:
                return MM520;
            case 9:
                return MM530;
            case 10:
                if (deviceLayout == 1) {
                    return MasterKeysMK750_850_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysMK750_850_EU;
                }
                if (deviceLayout == 3) {
                    return MasterKeysMK750_850_JP;
                }
            case 11:
                if (deviceLayout == 1) {
                    return CKxxx_US;
                }
                if (deviceLayout == 2) {
                    return CKxxx_EU;
                }
                if (deviceLayout == 3) {
                    return CKxxx_JP;
                }
            case 12:
                if (deviceLayout == 1) {
                    return CKxxx_US;
                }
                if (deviceLayout == 2) {
                    return CKxxx_EU;
                }
                if (deviceLayout == 3) {
                    return CKxxx_JP;
                }
            case 13:
                if (deviceLayout == 1) {
                    return CKxxx_US;
                }
                if (deviceLayout == 2) {
                    return CKxxx_EU;
                }
                if (deviceLayout == 3) {
                    return CKxxx_JP;
                }
            case 14:
                return MM830;
            case 15:

                //alterar depois ck530
                if (deviceLayout == 1) {
                    return CKxxx_US;
                }
                if (deviceLayout == 2) {
                    return CKxxx_EU;
                }
                if (deviceLayout == 3) {
                    return CKxxx_JP;
                }
            case 16:

                if (deviceLayout == 1) {
                    return MasterKeysMK750_850_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysMK750_850_EU;
                }
                if (deviceLayout == 3) {
                    return MasterKeysMK750_850_JP;
                }
            case 17:
                //alterar depois sk630
                if (deviceLayout == 1) {
                    return MasterKeysMK750_850_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysMK750_850_EU;
                }
                if (deviceLayout == 3) {
                    return MasterKeysMK750_850_JP;
                }
            case 18:
                //alterar depois sk650
                if (deviceLayout == 1) {
                    return MasterKeysMK750_850_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysMK750_850_EU;
                }
                if (deviceLayout == 3) {
                    return MasterKeysMK750_850_JP;
                }
            //alterar depois sk621
            case 19:
                if (deviceLayout == 1) {
                    return MasterKeysMK750_850_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysMK750_850_EU;
                }

            case 20:
                //alterar depois mk730
                if (deviceLayout == 1) {
                    return MasterKeysMK750_850_US;
                }
                if (deviceLayout == 2) {
                    return MasterKeysMK750_850_EU;
                }
                if (deviceLayout == 3) {
                    return MasterKeysMK750_850_JP;
                }
            default:
                return null;
        }

    }

}
