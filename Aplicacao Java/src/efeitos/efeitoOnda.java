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
import java.util.ArrayList;

public final class efeitoOnda extends IEfeitos implements Runnable {

    public efeitoOnda(colecaoPerifericos listaPerifericos, ArrayList<int[]> cores) {
        super(listaPerifericos, cores);
    }

    @Override
    public void run() {
        while (!allDone) {
            trocarCor();
            chamarMetodosClasse();
        }
    }

    @Override
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou) {
        motherBoard.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(100);
        for (int i = 0; i < ((IMotherBoard) motherBoard).getCountLight(); i++) {
            tempo.calculo();
            ((IMotherBoard) motherBoard).colorirPorLed(i);
            tempo.calculo();
        }
        esperar(chegou);
    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou) {
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
        esperar(chegou);
    }

    @Override
    protected void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou) {
        Mouse.setCor(getCor());
        Mouse.colorirDispositivo();
        esperar(chegou);
    }

    @Override
    protected void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou) {
        HeadSet.setCor(getCor());
        HeadSet.colorirDispositivo();
        esperar(chegou);
    }

    @Override
    protected void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou) {
        MouseMat.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((IMouseMat) MouseMat).getCountLight(); i++) {
            tempo.calculo();
            ((IMouseMat) MouseMat).colorirPorLed(i);
            tempo.calculo();
        }
        esperar(chegou);
    }

    @Override
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou) {
        HeadsetStand.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((IHeadsetStand) HeadsetStand).getCountLight(); i++) {
            tempo.calculo();
            ((IHeadsetStand) HeadsetStand).colorirPorLed(i);
            tempo.calculo();
        }
        esperar(chegou);
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou) {
        LightingNode.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((ILightingNode) LightingNode).getCountLight(); i++) {
            tempo.calculo();
            ((ILightingNode) LightingNode).colorirPorLed(i);
            tempo.calculo();
        }
        esperar(chegou);
    }

    @Override
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou) {
        CoolerControl.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(50);
        for (int i = 0; i < ((ICoolerControl) CoolerControl).getCountLight(); i++) {
            tempo.calculo();
            ((ICoolerControl) CoolerControl).colorirPorLed(i);
            tempo.calculo();
        }

        esperar(chegou);
    }

}
