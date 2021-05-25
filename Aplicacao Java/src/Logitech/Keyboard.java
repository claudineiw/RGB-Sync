package Logitech;

import IPerifericos.IKeyboard;
import com.logitech.gaming.HIDPID.DevicesLogitech;
import com.logitech.gaming.LogiTechKeyBoardMap;
import com.logitech.gaming.LogiTechRowColumn;
import com.logitech.gaming.LogiTechSDK;

public final class Keyboard extends ILogitech implements IKeyboard {

    private int[][] teclas = new int[6][23];

    public Keyboard(LogiTechSDK sdk, DevicesLogitech device) {
        super(sdk, device);
        preencherTeclas();
    }

    @Override
    public int[][] getTeclas() {
        return teclas;
    }

    @Override
    public void colorirPorTecla(int tecla) {
        try {
            getSdk().SetLightingForKeyWithScanCode(tecla, this.getCor());
        } catch (Exception ex) {
        }
    }

    private void preencherTeclas() {
        LogiTechKeyBoardMap mapaTeclas = new LogiTechKeyBoardMap();
        for (LogiTechRowColumn tecla : mapaTeclas.getKeys(getDevice().getModel())) {          
            teclas[tecla.getRow()][tecla.getColumn()] = tecla.getLogiTechLedId().getIndex();
        }
        
    }

    @Override
    public void colorirDispositivo() {
        LogiTechKeyBoardMap mapaTeclas = new LogiTechKeyBoardMap();
        for (LogiTechRowColumn tecla : mapaTeclas.getKeys(getDevice().getModel())) {
            getSdk().SetLightingForKeyWithScanCode(tecla.getLogiTechLedId().getIndex(), this.getCor());            
        }
    }
}
