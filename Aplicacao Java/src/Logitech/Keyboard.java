package Logitech;

import IPerifericos.IKeyboard;
import com.logitech.gaming.HIDPID.DevicesLogitech;
import com.logitech.gaming.LogiTechKeyBoardMap;
import com.logitech.gaming.LogiTechRowColumn;
import com.logitech.gaming.LogiTechSDK;
import java.util.List;

public final class Keyboard extends ILogitech implements IKeyboard {

    private int[][] teclas;

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
        List<LogiTechRowColumn> mapaRowColum =mapaTeclas.getKeys(getDevice().getModel());
        int [] size=pegarMaiorColunaMaiorRow(mapaRowColum);
        teclas = new int[size[0]][size[1]];
        for (LogiTechRowColumn tecla :mapaRowColum) {          
            teclas[tecla.getRow()][tecla.getColumn()] = tecla.getLogiTechLedId().getIndex();
        }        
    }
   
    public int[] pegarMaiorColunaMaiorRow(List<LogiTechRowColumn> mapaRowColum){
        int [] size = {0,0};
        for (LogiTechRowColumn tecla :mapaRowColum) {    
            
             if(size[1]<tecla.getColumn()+1){
                size[1]=tecla.getColumn()+1;
            } 
             
            if(size[0]<tecla.getRow()+1){
                size[0]=tecla.getRow()+1;
            }      
        }   
        
        return size;
    }

    @Override
    public void colorirDispositivo() {
        LogiTechKeyBoardMap mapaTeclas = new LogiTechKeyBoardMap();
        for (LogiTechRowColumn tecla : mapaTeclas.getKeys(getDevice().getModel())) {
            getSdk().SetLightingForKeyWithScanCode(tecla.getLogiTechLedId().getIndex(), this.getCor());            
        }
    }
}
