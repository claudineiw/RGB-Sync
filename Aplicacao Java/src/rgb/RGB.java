package rgb;
import Logitech.HeadSet;
import Logitech.Mouse;
import Logitech.MouseMat;
import Logitech.Teclado;
import static com.logitech.gaming.LogiLED.LogiLedInit;
import java.awt.Color;
import java.io.IOException;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;




public class RGB {
    
    public static void main(String[] args) throws IOException{           
    LogiLedInit();
        Mouse mouse = new Mouse("903","100", Color.BLUE);
        MouseMat mat = new MouseMat("903","100", Color.red);
        Teclado teclado = new Teclado("903","100", Color.GREEN);
        HeadSet HeadSet = new HeadSet("903","100", Color.GREEN);
        do {                
                 teclado.colorirPorTecla(14);
            } while (true);
        
        
        
  /* try {  
       UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme");
            URL url = RGB.class.getResource("/imagens/icone.png");      
            new principal().setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        }
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }
     */       
    }
    
}
