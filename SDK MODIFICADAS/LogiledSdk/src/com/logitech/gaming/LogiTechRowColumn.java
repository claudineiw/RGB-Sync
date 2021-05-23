package com.logitech.gaming;

public class LogiTechRowColumn {
     private final int row;
    private final int column;
    private final LogiTechLedId LogiTechLedId;
    public LogiTechRowColumn(LogiTechLedId LogiTechLedId,int row,int column){
        this.LogiTechLedId=LogiTechLedId;
        this.row=row;
        this.column=column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public LogiTechLedId getCoolerMasterLedId() {
        return LogiTechLedId;
    }
}
