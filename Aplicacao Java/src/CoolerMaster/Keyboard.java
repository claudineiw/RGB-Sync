package CoolerMaster;

import IPerifericos.IKeyboard;
import com.CollMaster.CoolerMasterDevice;
import com.CollMaster.CoolerMasterRowColumn;

public class Keyboard extends ICoolerMaster implements IKeyboard {

    public Keyboard(com.CollMaster.CoolerMasterSDK CoolerMasterSDK,CoolerMasterDevice device) {
        super(CoolerMasterSDK,device);
    }

    @Override
    public int[][] getTeclas() {
        int [][] teclasInt={};
        super.getZonas().forEach(tecla -> {
            teclasInt[tecla.getRow()][tecla.getColumn()]=tecla.getCoolerMasterLedId().ordinal();
        });
        
        return teclasInt;
    }

    @Override
    public void colorirPorTecla(int tecla) {        
        for(CoolerMasterRowColumn teclas:super.getZonas()){
            if(tecla==teclas.getCoolerMasterLedId().ordinal()){
                getCoolerMasterSDK().setKeyColor(teclas.getRow(), teclas.getColumn(), super.getCor(),super.getDevice());
                break;
            }
        }

    }

}
