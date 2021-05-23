package CoolerMaster;

import IPerifericos.IKeyboard;
import com.CollMaster.CoolerMasterDevice;
import com.CollMaster.CoolerMasterRowColumn;

public class Keyboard extends ICoolerMaster implements IKeyboard {
    private int[][] teclas = new int[8][25];
    public Keyboard(com.CollMaster.CoolerMasterSDK CoolerMasterSDK,CoolerMasterDevice device) {
        super(CoolerMasterSDK,device);
    }

    @Override
    public int[][] getTeclas() {
        super.getZonas().forEach(tecla -> {
            teclas[tecla.getRow()][tecla.getColumn()]=tecla.getCoolerMasterLedId().ordinal();
        });
        
        return teclas;
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
