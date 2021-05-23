/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CollMaster;

/**
 *
 * @author Claud
 */
public class CoolerMasterRowColumn {
    private final int row;
    private final int column;
    private final CoolerMasterLedId CoolerMasterLedId;
    public CoolerMasterRowColumn(CoolerMasterLedId CoolerMasterLedId,int row,int column){
        this.CoolerMasterLedId=CoolerMasterLedId;
        this.row=row;
        this.column=column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public CoolerMasterLedId getCoolerMasterLedId() {
        return CoolerMasterLedId;
    }
    
    
}
