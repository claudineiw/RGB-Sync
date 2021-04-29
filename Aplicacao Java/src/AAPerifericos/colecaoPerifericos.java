package AAPerifericos;

import java.util.ArrayList;

public class colecaoPerifericos {
    private final ArrayList<IPerifericos> Listaperifericos;

    public colecaoPerifericos() {       
        this.Listaperifericos = new ArrayList<>();
    }

    public ArrayList<IPerifericos> getPerifericos() {
        return Listaperifericos;
    }

    public void setPerifericos(IPerifericos perifericos) {
        this.Listaperifericos.add(perifericos);
    }

      
}
