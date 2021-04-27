package perifericos;

import java.util.ArrayList;

public class colecaoPerifericos {
    private final ArrayList<perifericos> Listaperifericos;

    public colecaoPerifericos(perifericos periferico) {       
        this.Listaperifericos = new ArrayList<>();
        this.Listaperifericos.add(periferico);
    }

    public ArrayList<perifericos> getPerifericos() {
        return Listaperifericos;
    }

    public void setPerifericos(perifericos perifericos) {
        this.Listaperifericos.add(perifericos);
    }

    
    
}
