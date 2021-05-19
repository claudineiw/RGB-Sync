package efeitos;

import IPerifericos.IPerifericos;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;
import java.awt.Color;
import java.util.ArrayList;

public final class efeitoDecremental extends IEfeitos{
    private final ArrayList<Double> velocidade;
    public efeitoDecremental(colecaoPerifericos listaPerifericos, ArrayList<Color> cores, ArrayList<Double> velocidade) {
        super(listaPerifericos, cores);
        this.velocidade=velocidade;
    }

    @Override
    public void run() {
       tempoPorVolta tempo = new tempoPorVolta(velocidade.get(1).intValue());
        while (!allDone) {    
            tempo.setEspera(velocidade.get(1).intValue());
            trocarCorDecremental(velocidade);
            tempo.calculo();
            chamarMetodosClasse();   
            iniciarThreads();
            limparListaThread(tempo); 
        }
    }

     @Override
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou,int pos) {
        motherBoard.setCor(getCor());
        motherBoard.colorirDispositivo();
    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou,int pos) {
        teclado.setCor(getCor());
        teclado.colorirDispositivo();
    }

    @Override
    protected void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou,int pos) {
       Mouse.setCor(getCor());
       Mouse.colorirDispositivo();
    }

    @Override
    protected void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou,int pos) {
       HeadSet.setCor(getCor());
        HeadSet.colorirDispositivo();
    }

    @Override
    protected void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou,int pos) {
        MouseMat.setCor(getCor());
        MouseMat.colorirDispositivo();
    }

    @Override
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou,int pos) {
       HeadsetStand.setCor(getCor());
        HeadsetStand.colorirDispositivo();
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou,int pos) {
         LightingNode.setCor(getCor());
        LightingNode.colorirDispositivo();
    }

    @Override
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou,int pos) {
        CoolerControl.setCor(getCor());
        CoolerControl.colorirDispositivo();
    }
}
