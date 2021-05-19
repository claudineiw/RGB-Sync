package efeitos;

import IPerifericos.IPerifericos;
import IPerifericos.colecaoPerifericos;
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_ARGB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import IPerifericos.IKeyboard;
import IPerifericos.IMotherBoard;
import Metodos.tempoPorVolta;
import java.util.ArrayList;

public final class efeitoPorImagemDaTela extends IEfeitos {

    private BufferedImage image;
    private int largura;
    private int altura;
    private int[] dataBuffInt;
    private int[][] matrix;
    private final JPanel painelImagens;
    private JLabel lbT;
    private JLabel lbM;

    public efeitoPorImagemDaTela(colecaoPerifericos listaPerifericos, JPanel painelImagens) {
        super(listaPerifericos);
        this.painelImagens = painelImagens;
        iniciarLabels();
    }

    private void iniciarLabels() {
        for (Component comp : painelImagens.getComponents()) {
            if (comp.getName().equals("lbTeclado")) {
                lbT = (JLabel) comp;
            }
            if (comp.getName().equals("lbMouse")) {
                lbM = (JLabel) comp;
            }

        }
    }

    @Override
    public void run() {
        tempoPorVolta tempo = new tempoPorVolta(650);
        while (!allDone) {
            if (allDone) {
                return;
            }
            capturarImagem();
            chamarMetodosClasse();
            iniciarThreads();
            limparListaThread(tempo);
        }
    }

    private void capturarImagem() {
        try {
            image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            Image img = image.getScaledInstance(80, 50, BufferedImage.SCALE_SMOOTH);
            image = new BufferedImage(80, 50, TYPE_INT_ARGB);
            image.getGraphics().drawImage(img, 0, 0, null);
            largura = image.getWidth();
            altura = image.getHeight();
            dataBuffInt = image.getRGB(0, 0, largura, altura, null, 0, largura);
            matrix = new int[altura][largura];
            int index = 0;
            for (int i = 0; i < altura; i++) {
                for (int y = 0; y < largura; y++) {
                    matrix[i][y] = dataBuffInt[index];
                    index++;
                }
            }
        } catch (AWTException ex) {
            Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void colorirMotherBoard(IPerifericos motherBoard, ArrayList<Boolean> chegou,int pos) {
        int leds=((IMotherBoard)motherBoard).getCountLight();
        for(int i=0;i<leds;i++){
             motherBoard.setCor(new java.awt.Color(dataBuffInt[i+300]));            
            ((IMotherBoard)motherBoard).colorirPorLed(i);
        }
    }

    @Override
    protected void colorirTeclado(IPerifericos teclado, ArrayList<Boolean> chegou,int pos) {
        int[][] botao = ((IKeyboard) teclado).getTeclas();
        for (int i = 0; i < botao.length; i++) {
            for (int y = 0; y < botao[i].length; y++) {
                if (allDone) {
                    return;
                }
                teclado.setCor(new java.awt.Color(matrix[i + lbT.getY() / 10][y + lbT.getX() / 7]));
                ((IKeyboard) teclado).colorirPorTecla(botao[i][y]);
            }
        }
    }

    @Override
    protected void colorirMouse(IPerifericos Mouse, ArrayList<Boolean> chegou,int pos) {
        Mouse.setCor(new java.awt.Color(matrix[lbM.getY() / 10][lbM.getX() / 7]));
        Mouse.colorirDispositivo();
    }

    @Override
    protected void colorirHeadSet(IPerifericos HeadSet, ArrayList<Boolean> chegou,int pos) {
        HeadSet.setCor(new java.awt.Color(matrix[lbM.getY() / 10][lbM.getX() / 7]));
        HeadSet.colorirDispositivo();
    }

    @Override
    protected void colorirMouseMat(IPerifericos MouseMat, ArrayList<Boolean> chegou,int pos) {
       MouseMat.setCor(new java.awt.Color(matrix[lbM.getY() / 10][lbM.getX() / 7]));
       MouseMat.colorirDispositivo();
    }

    @Override
    protected void colorirHeadsetStand(IPerifericos HeadsetStand, ArrayList<Boolean> chegou,int pos) {
       HeadsetStand.setCor(new java.awt.Color(matrix[lbM.getY() / 10][lbM.getX() / 7]));
       HeadsetStand.colorirDispositivo();
    }

    @Override
    protected void colorirLightingNode(IPerifericos LightingNode, ArrayList<Boolean> chegou,int pos) {
       LightingNode.setCor(new java.awt.Color(matrix[lbM.getY() / 10][lbM.getX() / 7]));
       LightingNode.colorirDispositivo();
    }

    @Override
    protected void colorirCoolerControl(IPerifericos CoolerControl, ArrayList<Boolean> chegou,int pos) {
       CoolerControl.setCor(new java.awt.Color(matrix[lbM.getY() / 10][lbM.getX() / 7]));
       CoolerControl.colorirDispositivo();
    }

}
