package rgb;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Splash extends JFrame
{
  private static principal principal;
  private static JLabel lbSplash;          
  private ImageIcon imSplash;             
  

  public static void main(String arg[]){
    

    Splash s = new Splash(); 
  
    s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    s.setSize(620,300);
    s.setUndecorated(true);
    s.setLocationRelativeTo(null);
    s.setVisible(true);
          try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme");
            URL url = Splash.class.getResource("/imagens/icone.png");
            principal = new principal();
            principal.setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }
    while(principal.iniciado()<0){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
    
    s.dispose();
  }
 

  public Splash() {

    setLayout(null); 
    imSplash = new ImageIcon(Splash.class.getResource("/imagens/splash.jpg"));
    lbSplash = new JLabel(imSplash);
    lbSplash.setBounds(0,0,620,300);
    add(lbSplash);
  }
 
  public void dispose(){
    principal.setVisible(true);
    super.dispose();
  }
 
}