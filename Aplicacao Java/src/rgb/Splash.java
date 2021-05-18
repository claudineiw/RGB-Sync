package RGB;

import Metodos.tempoPorVolta;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.CodeSource;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class Splash extends JFrame {

    private static principal principal;
    private static JLabel lbSplash;
    private static ImageIcon imSplash;
    private static final long serialVersionUID = 1L;
    private static tempoPorVolta tempo;

    public static void main(String arg[]) {
        try {
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
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException | URISyntaxException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Splash() throws URISyntaxException, IOException {        
        setLayout(null);    
        imSplash = new ImageIcon(getImagemSplash());
        lbSplash = new JLabel(imSplash);
        lbSplash.setBounds(0, 0, 620, 300);
        add(lbSplash);
    }
    
    
    private URL getImagemSplash(){
        int img=1;
        CodeSource src = Splash.class.getProtectionDomain().getCodeSource();
        if (src != null) {
            ZipInputStream zip = null;
                try {
                    URL jar = src.getLocation();
                    zip = new ZipInputStream(jar.openStream());
                    int imagens=0;
                    while (true) {
                        ZipEntry e = zip.getNextEntry();
                        if (e == null) {
                            if(imagens>0){
                                img=imagens;
                            }
                            break;
                        }
                        String name = e.getName();
                        if (name.startsWith("imagens/Splash/") && name.contains(".jpg")) {
                            imagens++;
                        }
                    }   } catch (IOException ex) {
                    Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        zip.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        } 
        return Splash.class.getResource("/imagens/Splash/" + new Random().nextInt(img) + ".jpg");
    }
    
    @Override
    public void dispose() {
        principal.setVisible(true);
        super.dispose();
    }

}
