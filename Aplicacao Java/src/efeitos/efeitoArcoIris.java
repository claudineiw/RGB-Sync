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

public final class efeitoArcoIris extends IEfeitos {


    public efeitoArcoIris(colecaoPerifericos listaPerifericos, ArrayList<int[]> cores) {
        super(listaPerifericos, cores);
    }

    @Override
    public void run() {
       tempoPorVolta tempo = new tempoPorVolta(250);
        while (!allDone) {            
            trocarCor();
            tempo.calculo();
            chamarMetodosClasse();   
            iniciarThreads();
            limparListaThread(tempo);
            tempo.calculo();           
        }
    }

    @Override
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou) {
        motherBoard.setCor(getCor());
        for (int i = 0; i < ((IMotherBoard) motherBoard).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                motherBoard.setCor(getCor());
            }
            ((IMotherBoard) motherBoard).colorirPorLed(i);

        }   
    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou) {
        for (int y = 0; y < 25; y++) {
            trocarCor();
            teclado.setCor(getCor());
            for (int[] sequencia : ((IKeyboard) teclado).getTeclas()) {
                if (y < sequencia.length) {
                    ((IKeyboard) teclado).colorirPorTecla(sequencia[y]);
                }

            }
        }
    }

    @Override
    protected void colorirMouse(IPerifericos mouse, ArrayList<Boolean> chegou) {
        mouse.setCor(getCor());
        mouse.colorirDispositivo();
    }

    @Override
    protected void colorirHeadSet(IPerifericos headSet, ArrayList<Boolean> chegou) {
        headSet.setCor(getCor());
        headSet.colorirDispositivo();
    }

    @Override
    protected void colorirMouseMat(IPerifericos mouseMat, ArrayList<Boolean> chegou) {
        mouseMat.setCor(getCor());
        for (int i = 0; i < ((IMouseMat) mouseMat).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                mouseMat.setCor(getCor());
            }
            ((IMouseMat) mouseMat).colorirPorLed(i);
        }
    }

    @Override
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou) {
        HeadsetStand.setCor(getCor());
        for (int i = 0; i < ((IHeadsetStand) HeadsetStand).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                HeadsetStand.setCor(getCor());
            }
            ((IHeadsetStand) HeadsetStand).colorirPorLed(i);
        }
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou) {
        LightingNode.setCor(getCor());
        for (int i = 0; i < ((ILightingNode) LightingNode).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                LightingNode.setCor(getCor());
            }
            ((ILightingNode) LightingNode).colorirPorLed(i);
        }
    }

    @Override
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou) {
        CoolerControl.setCor(getCor());
        for (int i = 0; i < ((ICoolerControl) CoolerControl).getCountLight(); i++) {
            if (i % 10 == 0) {
                trocarCor();
                CoolerControl.setCor(getCor());
            }
            ((ICoolerControl) CoolerControl).colorirPorLed(i);
        }
    }


}
