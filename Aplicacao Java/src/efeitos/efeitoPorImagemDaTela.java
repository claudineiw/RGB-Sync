package efeitos;

import AAPerifericos.IMouse;
import AAPerifericos.IPerifericos;
import AAPerifericos.colecaoPerifericos;
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
import AAPerifericos.IKeyboard;

public class efeitoPorImagemDaTela implements Runnable {

    BufferedImage image;
    int largura;
    int altura;
    int[] dataBuffInt;
    int[][] matrix;
    public boolean allDone = false;
    private JPanel painelImagens;
    colecaoPerifericos listaPerifericos;

    public efeitoPorImagemDaTela(colecaoPerifericos listaPerifericos, JPanel painelImagens) {
        this.painelImagens = painelImagens;
        this.listaPerifericos = listaPerifericos;
    }

    public void run() {
        JLabel lbT = new JLabel();
        JLabel lbM = new JLabel();
        for (Component comp : painelImagens.getComponents()) {
            if (comp.getName().equals("lbTeclado")) {
                lbT = (JLabel) comp;
            }
            if (comp.getName().equals("lbMouse")) {
                lbM = (JLabel) comp;
            }

        }

        while (!allDone) {

            if (allDone) {
                return;
            }
            try {
                Thread.sleep(500);
                image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            } catch (AWTException ex) {
                Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
            }

            Image img = image.getScaledInstance(60, 30, BufferedImage.SCALE_SMOOTH);
            image = new BufferedImage(60, 30, TYPE_INT_ARGB);
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
            for (IPerifericos periferico : listaPerifericos.getPerifericos()) {
                if (periferico instanceof IKeyboard) {
                    colorirTeclado(lbT, periferico);
                }
                if (periferico instanceof IMouse) {
                    colorirMouse(lbM, periferico);
                }
            }

        }
    }

    private void colorirMouse(JLabel lbM, IPerifericos mouse) {
        mouse.setCor(new java.awt.Color(matrix[lbM.getY() / 10][lbM.getX() / 7]));
        mouse.colorirDispositivo();
    }

    private void colorirTeclado(JLabel lbT, IPerifericos teclado) {
        int[][] botao = ((IKeyboard) teclado).getTeclas();
        for (int i = 0; i < botao.length; i++) {
            for (int y = 0; y < botao[i].length; y++) {
                if (allDone) {
                    return;
                }
                teclado.setCor(new java.awt.Color(matrix[i + lbT.getY() / 10][y + lbT.getX() / 7]));
                try {
                    ((IKeyboard) teclado).colorirPorTecla(botao[i][y]);
                } catch (Exception ex) {
                    Logger.getLogger(efeitoPorImagemDaTela.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }

}
