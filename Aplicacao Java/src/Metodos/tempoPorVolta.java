package Metodos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class tempoPorVolta {
    private long comeco=0l;
    private long termino=0l;
    private long resultado=0l;
    private long espera=0l;

    public tempoPorVolta(int espera){
        this.espera=new Long(String.valueOf(espera));
    }
    
    
    private long getComeco() {
        return comeco;
    }

    private void setComeco(long comeco) {
        this.comeco = comeco;
    }

    private long getTermino() {
        return termino;
    }

    private void setTermino(long termino) {
        this.termino = termino;
    }

    private long getResultado() {
        return resultado;
    }

    private void setResultado(long resultado) {
        this.resultado = resultado;
    }

    private long getEspera() {
        return espera;
    }
    public void setEspera(long espera){
        this.espera=espera;
    }
    public void calculo(){
        if(getComeco()==0l){
            setComeco(System.currentTimeMillis());
        }else{
            if(getTermino()==0l){
                setTermino(System.currentTimeMillis());                
            }else{
                setResultado(getTermino()-getComeco());
                if(getResultado()>getEspera()){
                    setComeco(0l);
                    setTermino(0l);
                    setResultado(0l);
                }else{
                    try {
                        Thread.sleep(getEspera()-getResultado());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(tempoPorVolta.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    setComeco(System.currentTimeMillis());
                    setTermino(0l);
                    setResultado(0l);
                }
            }
        }
    }
    
    
    
    
    
    
}
