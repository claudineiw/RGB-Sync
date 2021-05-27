package ca.fiercest.cuesdk;

import ca.fiercest.cuesdk.enums.LedId;

public class CorsairRowColumn {
     private final int row;
    private final int column;
    private final LedId CorsairLedId;
    public CorsairRowColumn(LedId CorsairLedId,int row,int column){
        this.CorsairLedId=CorsairLedId;
        this.row=row;
        this.column=column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public LedId getCorsaIdLedId() {
        return CorsairLedId;
    }
}
