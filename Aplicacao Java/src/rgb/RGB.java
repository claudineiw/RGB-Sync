package rgb;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import javax.swing.UnsupportedLookAndFeelException;




public class RGB {
    
    public static void main(String[] args) throws IOException{    
        
   try {  
       UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme");
            URL url = RGB.class.getResource("/imagens/icone.png");      
            new principal().setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }
              
    }
    
}
