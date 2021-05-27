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

public final class efeitoArcoIris extends IEfeitos {


    public efeitoArcoIris(colecaoPerifericos listaPerifericos, ArrayList<Color> cores) {
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
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou,int pos) {
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
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou,int pos) {
       int [][] teclas=((IKeyboard) teclado).getTeclas();
        for (int y = 0; y < teclas[0].length; y++) {
            trocarCor();
            teclado.setCor(getCor());
            for (int[] sequencia : teclas) {
                if (y < sequencia.length) {
                    ((IKeyboard) teclado).colorirPorTecla(sequencia[y]);
                }

            }
        }
    }

    @Override
    protected void colorirMouse(IPerifericos mouse, ArrayList<Boolean> chegou,int pos) {
        mouse.setCor(getCor());
        mouse.colorirDispositivo();
    }

    @Override
    protected void colorirHeadSet(IPerifericos headSet, ArrayList<Boolean> chegou,int pos) {
        headSet.setCor(getCor());
        headSet.colorirDispositivo();
    }

    @Override
    protected void colorirMouseMat(IPerifericos mouseMat, ArrayList<Boolean> chegou,int pos) {
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
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou,int pos) {
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
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou,int pos) {
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
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou,int pos) {
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
