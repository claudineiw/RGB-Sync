package efeitos;

import IPerifericos.IPerifericos;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;
import java.util.ArrayList;

public final class efeitoStrobol extends IEfeitos{
    private final ArrayList<Integer> ciclo;
    public efeitoStrobol(colecaoPerifericos listaPerifericos,ArrayList<Integer> ciclo) {
        super(listaPerifericos);
        this.ciclo=ciclo;
    }

    @Override
    public void run() {
        tempoPorVolta tempo = new tempoPorVolta(ciclo.get(0));
        while (!allDone) {
            tempo.setEspera(ciclo.get(0));
            trocarCorStrobol();
            tempo.calculo();
            chamarMetodosClasse();   
            iniciarThreads();
            limparListaThread(tempo);
        }
    }
    
      @Override
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou) {
        motherBoard.setCor(getCor());
        motherBoard.colorirDispositivo();
    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou) {
        teclado.setCor(getCor());
        teclado.colorirDispositivo();
    }

    @Override
    protected void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou) {
       Mouse.setCor(getCor());
       Mouse.colorirDispositivo();
    }

    @Override
    protected void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou) {
       HeadSet.setCor(getCor());
        HeadSet.colorirDispositivo();
    }

    @Override
    protected void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou) {
        MouseMat.setCor(getCor());
        MouseMat.colorirDispositivo();
    }

    @Override
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou) {
       HeadsetStand.setCor(getCor());
        HeadsetStand.colorirDispositivo();
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou) {
         LightingNode.setCor(getCor());
        LightingNode.colorirDispositivo();
    }

    @Override
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou) {
        CoolerControl.setCor(getCor());
        CoolerControl.colorirDispositivo();
    }

}
