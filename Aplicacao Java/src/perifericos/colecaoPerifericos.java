package perifericos;

import java.util.ArrayList;

public class colecaoPerifericos {
    private final ArrayList<IPerifericos> Listaperifericos;

    public colecaoPerifericos(IPerifericos periferico) {       
        this.Listaperifericos = new ArrayList<>();
        this.Listaperifericos.add(periferico);
    }

    public ArrayList<IPerifericos> getPerifericos() {
        return Listaperifericos;
    }

    public void setPerifericos(IPerifericos perifericos) {
        this.Listaperifericos.add(perifericos);
    }

    
    
}
