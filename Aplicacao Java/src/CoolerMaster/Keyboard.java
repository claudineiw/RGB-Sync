package CoolerMaster;

import IPerifericos.IKeyboard;
import com.CollMaster.CoolerMasterDevice;
import com.CollMaster.CoolerMasterRowColumn;
import java.util.List;

public class Keyboard extends ICoolerMaster implements IKeyboard {
    private int[][] teclas;
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
        List<CoolerMasterRowColumn> mapaRowColum=super.getZonas();
        int [] size=pegarMaiorColunaMaiorRow(mapaRowColum);
        for(CoolerMasterRowColumn teclas:mapaRowColum){
            if(tecla==teclas.getCoolerMasterLedId().ordinal()){
                getCoolerMasterSDK().setKeyColor(teclas.getRow(), teclas.getColumn(), super.getCor(),super.getDevice());
                break;
            }
        }
    }
    public int[] pegarMaiorColunaMaiorRow(List<CoolerMasterRowColumn> mapaRowColum){
        int [] size = {0,0};
        for (CoolerMasterRowColumn tecla :mapaRowColum) {               
             if(size[1]<tecla.getColumn()+1){
                size[1]=tecla.getColumn()+1;
            } 
             
            if(size[0]<tecla.getRow()+1){
                size[0]=tecla.getRow()+1;
            }      
        }   
        
        return size;
    }

}
