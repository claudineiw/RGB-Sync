package Corsair;

import IPerifericos.IKeyboard;
import ca.fiercest.cuesdk.CorsairDevice;
import ca.fiercest.cuesdk.CorsairKeyBoardMap;
import ca.fiercest.cuesdk.CorsairRowColumn;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.enums.LedId;
import java.util.List;

public class Keyboard extends ICorsair implements IKeyboard {
    private int[][] teclas;
    public Keyboard(CueSDK CorsairSDK, CorsairDevice device) {
        super(CorsairSDK, device, 1, 147);
        preencherTeclas();
    }

    @Override
    public int[][] getTeclas() {
        return this.teclas;
    }

    @Override
    public void colorirPorTecla(int tecla) {
        getCorsairSDK().SetLedColor(LedId.byOrdinal(tecla), getCor());
    }
    
    
    
    private void preencherTeclas() {
        CorsairKeyBoardMap keyboard = new CorsairKeyBoardMap();
        List<CorsairRowColumn> mapaRowColum= keyboard.getKeys(super.getNome());
        int [] size=pegarMaiorColunaMaiorRow(mapaRowColum);
        teclas = new int[size[0]][size[1]];
        for (CorsairRowColumn tecla : mapaRowColum) {          
            teclas[tecla.getRow()][tecla.getColumn()] = tecla.getCorsaIdLedId().getId();
        }        
    }
    
    
       public int[] pegarMaiorColunaMaiorRow(List<CorsairRowColumn> mapaRowColum){
        int [] size = {0,0};
        for (CorsairRowColumn tecla :mapaRowColum) {    
            
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
