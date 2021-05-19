package efeitos;

import IPerifericos.ICoolerControl;
import IPerifericos.IHeadsetStand;
import IPerifericos.IKeyboard;
import IPerifericos.ILightingNode;
import IPerifericos.IMotherBoard;
import IPerifericos.IMouseMat;
import IPerifericos.IPerifericos;
import IPerifericos.colecaoPerifericos;
import Metodos.tempoPorVolta;
import java.awt.Color;
import java.util.ArrayList;

public final class efeitoOnda extends IEfeitos {

    public efeitoOnda(colecaoPerifericos listaPerifericos, ArrayList<Color> cores) {
        super(listaPerifericos, cores);
    }

    @Override
    public void run() {
        while (!allDone) {
            trocarCor();
            criarListaChegou();
            chamarMetodosClasse();
            tratarSequenciaThread(getListaTH(), getChegou());
        }
    }

    @Override
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou,int pos) {
        motherBoard.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(100);
        for (int i = 0; i < ((IMotherBoard) motherBoard).getCountLight(); i++) {
            tempo.calculo();
            ((IMotherBoard) motherBoard).colorirPorLed(i);
            tempo.calculo();
        }
        esperarExecucao(chegou,pos);
    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou,int pos) {
        tempoPorVolta tempo = new tempoPorVolta(1000);
        int[][] listaBotoes = ((IKeyboard) teclado).getTeclas();
        for (int i = listaBotoes.length - 1; i >= 0; i--) {
            tempo.calculo();
            for (int y = 0; y < listaBotoes[i].length; y++) {
                if (allDone) {
                    return;
                }
                teclado.setCor(getCor());
                ((IKeyboard) teclado).colorirPorTecla(listaBotoes[i][y]);

            }
            tempo.calculo();
        }
        esperarExecucao(chegou,pos);
    }

    @Override
    protected void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou,int pos) {
        Mouse.setCor(getCor());
        Mouse.colorirDispositivo();
        esperarExecucao(chegou,pos);
    }

    @Override
    protected void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou,int pos) {
        HeadSet.setCor(getCor());
        HeadSet.colorirDispositivo();
       esperarExecucao(chegou,pos);
    }

    @Override
    protected void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou,int pos) {
        MouseMat.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((IMouseMat) MouseMat).getCountLight(); i++) {
            tempo.calculo();
            ((IMouseMat) MouseMat).colorirPorLed(i);
            tempo.calculo();
        }
       esperarExecucao(chegou,pos);
    }

    @Override
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou,int pos) {
        HeadsetStand.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((IHeadsetStand) HeadsetStand).getCountLight(); i++) {
            tempo.calculo();
            ((IHeadsetStand) HeadsetStand).colorirPorLed(i);
            tempo.calculo();
        }
        esperarExecucao(chegou,pos);
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou,int pos) {
        LightingNode.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((ILightingNode) LightingNode).getCountLight(); i++) {
            tempo.calculo();
            ((ILightingNode) LightingNode).colorirPorLed(i);
            tempo.calculo();
        }
        esperarExecucao(chegou,pos);
    }

    @Override
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou,int pos) {
        CoolerControl.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((ICoolerControl) CoolerControl).getCountLight(); i++) {
            tempo.calculo();
            ((ICoolerControl) CoolerControl).colorirPorLed(i);
            tempo.calculo();
        }

        esperarExecucao(chegou,pos);
    }

}
