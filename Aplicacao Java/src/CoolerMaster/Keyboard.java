package CoolerMaster;

import IPerifericos.IKeyboard;
import com.CollMaster.CoolerMasterDevice;
import com.CollMaster.CoolerMasterLedId;

public class Keyboard extends ICoolerMaster implements IKeyboard {

    public Keyboard(com.CollMaster.CoolerMasterSDK CoolerMasterSDK,CoolerMasterDevice device) {
        super(CoolerMasterSDK,device);
    }

    @Override
    public int[][] getTeclas() {
        int [][] teclasInt={};
        CoolerMasterLedId[][] teclas=super.getZonas();
        for(int i=0;i<teclas.length;i++){
            int vez[]={};            
            for(int y=0;y<teclas[i].length;y++){
                vez[y]=teclas[i][y].ordinal();
            }
            teclasInt[i]=vez;        
    }
        
        return teclasInt;
    }

    @Override
    public void colorirPorTecla(int tecla) {
        for (int i = 0; i < getTeclas().length; i++) {
            for (int y = 0; y < getTeclas()[i].length; y++) {
                if (getTeclas()[i][y] == (short) tecla) {
                    getCoolerMasterSDK().setKeyColor(i, y, super.getCor(),super.getDevice());
                    break;
                }
            }
        }

    }

}
