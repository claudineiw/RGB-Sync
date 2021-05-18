package RGB;

import Metodos.tempoPorVolta;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Random;

public final class Splash extends JFrame {

    private static principal principal;
    private static JLabel lbSplash;
    private static ImageIcon imSplash;
    private static final long serialVersionUID = 1L;
    private static tempoPorVolta tempo;

    public static void main(String arg[]) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        tempo = new tempoPorVolta(300);
        URL url = Splash.class.getResource("/imagens/icone.png");

        Splash Splash = new Splash();
        Splash.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Splash.setSize(620, 300);
        Splash.setUndecorated(true);
        Splash.setLocationRelativeTo(null);
        Splash.setVisible(true);
        Splash.setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme");
        principal = new principal();
        principal.setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        while (principal.iniciado() < 0) {
            tempo.calculo();
        }

        Splash.dispose();
    }

    private Splash() throws URISyntaxException {
        setLayout(null);
        imSplash = new ImageIcon(Splash.class.getResource("/imagens/Splash/" + new Random().nextInt(new File(Splash.class.getResource("/imagens/Splash").toURI()).listFiles().length) + ".jpg"));
        lbSplash = new JLabel(imSplash);
        lbSplash.setBounds(0, 0, 620, 300);
        add(lbSplash);
    }

    @Override
    public void dispose() {
        principal.setVisible(true);
        super.dispose();
    }

}
