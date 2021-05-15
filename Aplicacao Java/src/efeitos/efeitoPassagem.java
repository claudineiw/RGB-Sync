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

public class efeitoPassagem extends IEfeitos{

    public efeitoPassagem(colecaoPerifericos listaPerifericos, ArrayList<Color> cores) {
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
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou) {
        tempoPorVolta tempo = new tempoPorVolta(5);
        motherBoard.setCor(getCor());
        for (int i = 0; i < ((IMotherBoard) motherBoard).getCountLight(); i++) {
            tempo.calculo();
            ((IMotherBoard) motherBoard).colorirPorLed(i);
            tempo.calculo();
        }
        esperarExecucao(chegou);

        motherBoard.setCor(getCor());
        for (int i = ((IMotherBoard) motherBoard).getCountLight() - 1; i >= 0; i--) {
            tempo.calculo();
            ((IMotherBoard) motherBoard).colorirPorLed(i);
            tempo.calculo();
        }

    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou) {
        teclado.setCor(getCor());
        tempoPorVolta tempo = new tempoPorVolta(100);
        for (int y = 0; y < 25; y++) {
            tempo.calculo();
            for (int[] sequencia : ((IKeyboard) teclado).getTeclas()) {
                if (y < sequencia.length) {
                    ((IKeyboard) teclado).colorirPorTecla(sequencia[y]);
                }

            }
            tempo.calculo();
        }

        esperarExecucao(chegou);

        teclado.setCor(getCor());
        for (int y = 25; y >= 0; y--) {
            tempo.calculo();
            for (int[] sequencia : ((IKeyboard) teclado).getTeclas()) {
                if (y < sequencia.length) {
                    ((IKeyboard) teclado).colorirPorTecla(sequencia[y]);
                }

            }
            tempo.calculo();
        }

    }

    @Override
    protected void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou) {
        Mouse.setCor(getCor());
        Mouse.colorirDispositivo();
        esperarExecucao(chegou);        
    }

    @Override
    protected void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou) {

        HeadSet.setCor(getCor());
        HeadSet.colorirDispositivo();

        esperarExecucao(chegou);

    }

    @Override
    protected void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou) {

        tempoPorVolta tempo = new tempoPorVolta(150);
        MouseMat.setCor(getCor());
        for (int i = 0; i < ((IMouseMat) MouseMat).getCountLight(); i++) {
            tempo.calculo();
            ((IMouseMat) MouseMat).colorirPorLed(i);
            tempo.calculo();
        }

        esperarExecucao(chegou);

        MouseMat.setCor(getCor());
        for (int i = ((IMouseMat) MouseMat).getCountLight() - 1; i >= 0; i--) {
            tempo.calculo();
            ((IMouseMat) MouseMat).colorirPorLed(i);
            tempo.calculo();
        }
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

        esperarExecucao(chegou);

        HeadsetStand.setCor(getCor());
        for (int i = ((IHeadsetStand) HeadsetStand).getCountLight() - 1; i >= 0; i--) {
            tempo.calculo();
            ((IHeadsetStand) HeadsetStand).colorirPorLed(i);
            tempo.calculo();
        }
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou) {
        tempoPorVolta tempo = new tempoPorVolta(50);

        LightingNode.setCor(getCor());
        for (int i = 0; i < ((ILightingNode) LightingNode).getCountLight(); i++) {
            tempo.calculo();
            ((ILightingNode) LightingNode).colorirPorLed(i);
            tempo.calculo();
        }

        esperarExecucao(chegou);

        LightingNode.setCor(getCor());
        for (int i = ((ILightingNode) LightingNode).getCountLight() - 1; i >= 0; i--) {
            tempo.calculo();
            ((ILightingNode) LightingNode).colorirPorLed(i);
            tempo.calculo();
        }
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

        esperarExecucao(chegou);

        CoolerControl.setCor(getCor());
        for (int i = ((ICoolerControl) CoolerControl).getCountLight() - 1; i >= 0; i--) {
            tempo.calculo();
            ((ICoolerControl) CoolerControl).colorirPorLed(i);
            tempo.calculo();
        }
    }
}
