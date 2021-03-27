/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgb;

import javax.swing.UIManager;
import java.awt.Toolkit;
import java.net.URL;
 


public class RGB {
    
    public static void main(String[] args){
        
        
   try {         
            UIManager.setLookAndFeel("com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme");
            URL url = RGB.class.getResource("/imagens/icone.png");      
            new principal().setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
              
    }
    
    
    
}
