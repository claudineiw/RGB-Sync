package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.LedId;
import java.util.ArrayList;
import java.util.List;

public class CorsairKeyBoardMap {

    private static final List<CorsairRowColumn> K95RGB = new ArrayList<>();

    private static final List<CorsairRowColumn> NAODEFINIDO = new ArrayList<>();
    public CorsairKeyBoardMap() {    
        
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Mute,0,22));
        
        
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G1,1,0));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G2,1,1));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G3,1,2));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Escape,1,3));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F1,1,4));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F2,1,5));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F3,1,6));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F4,1,7));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F5,1,9));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F6,1,10));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F7,1,11));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F8,1,12));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F9,1,14));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F10,1,15));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F11,1,16));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F12,1,17));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_PrintScreen,1,18));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_ScrollLock,1,19));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_PauseBreak,1,20));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Stop,1,21));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_ScanPreviousTrack,1,22));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_PlayPause,1,23));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_ScanNextTrack,1,24));
        
        
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G4,2,0));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G5,2,1));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G6,2,2));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_GraveAccentAndTilde,2,3));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_1,2,4));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_2,2,5));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_3,2,6));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_4,2,7));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_5,2,8));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_6,2,9));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_7,2,10));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_8,2,11));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_9,2,12));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_0,2,13));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_MinusAndUnderscore,2,14));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_EqualsAndPlus,2,15));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Backspace,2,17));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Insert,2,18));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Home,2,19));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_PageUp,2,20));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_NumLock,2,21));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_KeypadSlash,2,22));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_KeypadAsterisk,2,23));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_KeypadMinus,2,24));
        
        
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G7,3,0));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G8,3,1));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G9,3,2));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Tab,3,3));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Q,3,4));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_W,3,5));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_E,3,6));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_R,3,7));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_T,3,8));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Y,3,9));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_U,3,10));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_I,3,11));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_O,3,12));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_P,3,13));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_BracketLeft,3,14));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_BracketRight,3,15));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Backslash,3,17));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Delete,3,18));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_End,3,19));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_PageDown,3,20));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad7,3,21));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad8,3,22));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad9,3,23));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_KeypadPlus,3,24));
        
       
        
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G10,4,0));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G11,4,1));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G12,4,2));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_CapsLock,4,3));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_A,4,4));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_S,4,5));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_D,4,6));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_F,4,7));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G,4,8));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_H,4,9));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_J,4,10));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_K,4,11));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_L,4,12));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_SemicolonAndColon,4,13));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_ApostropheAndDoubleQuote,4,14));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Enter,4,17));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad4,4,21));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad5,4,22));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad6,4,23));
        
        
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G13,5,0));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G14,5,1));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G15,5,2));      
        K95RGB.add(new CorsairRowColumn(LedId.CLK_LeftShift,5,3));  
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Z,5,5)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_X,5,6)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_C,5,7)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_V,5,8)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_B,5,9)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_N,5,10)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_M,5,11)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_CommaAndLessThan,5,12)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_PeriodAndBiggerThan,5,13)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_SlashAndQuestionMark,5,14)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_RightShift,5,17)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_UpArrow,5,19)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad1,5,21)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad2,5,22)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad3,5,23)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_KeypadEnter,5,24)); 
        
        
        
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G16,6,0));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G17,6,1));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_G18,6,2)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_LeftCtrl,6,3)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_LeftGui,6,4)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_LeftAlt,6,5)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Space,6,9)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_RightAlt,6,13)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_RightGui,6,14)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Application,6,15)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_RightCtrl,6,17));
        K95RGB.add(new CorsairRowColumn(LedId.CLK_LeftArrow,6,18)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_DownArrow,6,19)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_RightArrow,6,20)); 
        K95RGB.add(new CorsairRowColumn(LedId.CLK_Keypad0,6,21));   
        K95RGB.add(new CorsairRowColumn(LedId.CLK_KeypadPeriodAndDelete,6,23)); 
        
        
     
    }
    
    
    public List<CorsairRowColumn> getKeys(String device){
        if(device.toLowerCase().contains("K95 RGB".toLowerCase())){
            return K95RGB;
        }else{
           return NAODEFINIDO; 
        }
        
    }
    
}
