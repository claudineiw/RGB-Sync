/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgb;

import efeitos.efeitoOnda;
import efeitos.efeitoDecremental;
import efeitos.efeitoMusica;
import efeitos.efeitoPorImagemDaTela;
import efeitos.efeitoArcoIris;
import efeitos.efeitoStrobol;
import ca.fiercest.aurasdk.AuraSDK;
import com.logitech.gaming.LogiLED;
import com.sun.glass.events.KeyEvent;
import efeitos.efeitoCorSelecionada;
import efeitos.efeitoPorTemperatura;
import java.awt.AWTException;

import java.awt.Color;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.Robot;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import openHardware.openHardwareMonitorCon;
import org.apache.commons.lang3.ArrayUtils;


/**
 *
 * @author Claud
 */
public class principal extends javax.swing.JFrame {
AuraSDK AsusAura;
static TrayIcon trayIcon;
efeitoDecremental efeitoDecremental;
efeitoStrobol efeitoStrobol;
efeitoArcoIris efeitoArcoIris;
efeitoOnda efeitoOnda;
efeitoMusica efeitomMusica;
efeitoPorImagemDaTela efeitoPorImagem;
efeitoCorSelecionada efeitoCorSelecionada;
openHardwareMonitorCon power;
efeitoPorTemperatura efeitoPorTemperatura;
private static int numerais[]={48,49,50,51,52,53,54,55,56,57,96,97,98,99,100,101,102,103,104,105};
    /**
     * Creates new form principal
     */
    public principal(){ 
         initComponents(); 
         
         LogiLED.LogiLedInit(); 
         AsusAura = new AuraSDK();
         
         power = new openHardwareMonitorCon(tempCPU,tempGPU);             
         Thread th = new Thread(power);
         th.start(); 
         
	 jColor.setColor(Color.RED);         
         btnAplicarEfeito.doClick(); 
         painelInternoTemperatuas.setVisible(false);
         this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCores = new javax.swing.JPanel();
        jColor = new javax.swing.JColorChooser();
        painelOpcoes = new javax.swing.JPanel();
        jCbXEfeitos = new javax.swing.JComboBox<>();
        btnAplicarEfeito = new javax.swing.JButton();
        painelInternoTemperatuas = new javax.swing.JPanel();
        lbTemp4 = new javax.swing.JLabel();
        lbTemp1 = new javax.swing.JLabel();
        lbTemp2 = new javax.swing.JLabel();
        lbTemp3 = new javax.swing.JLabel();
        txtTemp4 = new javax.swing.JFormattedTextField();
        txtTemp1 = new javax.swing.JFormattedTextField();
        txtTemp2 = new javax.swing.JFormattedTextField();
        txtTemp3 = new javax.swing.JFormattedTextField();
        jCbDispositivo = new javax.swing.JComboBox<>();
        painelSuperior = new javax.swing.JPanel();
        tempCPU = new javax.swing.JLabel();
        tempGPU = new javax.swing.JLabel();
        tempCPUDescricao = new javax.swing.JLabel();
        tempGPUDescricao = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnHide = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(460, 270));
        setMinimumSize(new java.awt.Dimension(460, 270));
        setName("RGBPrincipal"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(460, 270));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jColor.removeChooserPanel(jColor.getChooserPanels()[4]);
        jColor.removeChooserPanel(jColor.getChooserPanels()[3]);
        jColor.removeChooserPanel(jColor.getChooserPanels()[2]);
        jColor.removeChooserPanel(jColor.getChooserPanels()[0]);
        jColor.getPreviewPanel().setVisible(false);
        jColor.remove(0);
        jColor.getChooserPanels()[0].getComponent(0).setVisible(false);
        painelCores.add(jColor);

        getContentPane().add(painelCores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, 220));

        painelOpcoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCbXEfeitos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionada", "Musica", "Tela", "Stroob", "ArcoIris", "Onda", "Decremental", "Temperatura" }));
        jCbXEfeitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbXEfeitosActionPerformed(evt);
            }
        });
        painelOpcoes.add(jCbXEfeitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, -1));

        btnAplicarEfeito.setText("Aplicar");
        btnAplicarEfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarEfeitoActionPerformed(evt);
            }
        });
        painelOpcoes.add(btnAplicarEfeito, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        painelInternoTemperatuas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTemp4.setText("Temp4");
        painelInternoTemperatuas.add(lbTemp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lbTemp1.setText("Temp1");
        painelInternoTemperatuas.add(lbTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lbTemp2.setText("Temp2");
        painelInternoTemperatuas.add(lbTemp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lbTemp3.setText("Temp3");
        painelInternoTemperatuas.add(lbTemp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtTemp4.setText("0");
        txtTemp4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemp4KeyPressed(evt);
            }
        });
        painelInternoTemperatuas.add(txtTemp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 30, -1));

        txtTemp1.setText("0");
        txtTemp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemp1KeyPressed(evt);
            }
        });
        painelInternoTemperatuas.add(txtTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 30, -1));

        txtTemp2.setText("0");
        txtTemp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemp2KeyPressed(evt);
            }
        });
        painelInternoTemperatuas.add(txtTemp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 30, -1));

        txtTemp3.setText("0");
        txtTemp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemp3KeyPressed(evt);
            }
        });
        painelInternoTemperatuas.add(txtTemp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 30, -1));

        jCbDispositivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPU", "GPU" }));
        painelInternoTemperatuas.add(jCbDispositivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        painelOpcoes.add(painelInternoTemperatuas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 140));

        getContentPane().add(painelOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 190, 220));

        painelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tempCPU.setText("0");
        painelSuperior.add(tempCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, -1));

        tempGPU.setText("0");
        painelSuperior.add(tempGPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 30, -1));

        tempCPUDescricao.setText("CPU");
        painelSuperior.add(tempCPUDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tempGPUDescricao.setText("GPU");
        painelSuperior.add(tempGPUDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        btnSair.setBackground(new java.awt.Color(60, 63, 255,0));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/m_fechar.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelSuperior.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 30));

        btnHide.setBackground(new java.awt.Color(60, 63, 255,0));
        btnHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/m_hide.png"))); // NOI18N
        btnHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHideActionPerformed(evt);
            }
        });
        painelSuperior.add(btnHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, 30));

        btnMinimizar.setBackground(new java.awt.Color(60, 63, 255,0));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/m_minimize.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        painelSuperior.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        getContentPane().add(painelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        pararEfeito();
         try{
             power.allDone=true;
         }catch(Exception ex){             
         }
        AsusAura.ReleaseControl();        
        LogiLED.LogiLedShutdown();
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHideActionPerformed
        tray();
    }//GEN-LAST:event_btnHideActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
       this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
      int x=evt.getXOnScreen()-(int)this.getWidth()/2;
      int y=evt.getYOnScreen()-(int)this.getHeight()/2;
       this.setLocation(x,y);
    }//GEN-LAST:event_formMouseDragged

    private void btnAplicarEfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarEfeitoActionPerformed
         pararEfeito();
         Thread th;
        switch(jCbXEfeitos.getSelectedItem().toString()){
            case "Musica":                 
                 efeitomMusica = new efeitoMusica(AsusAura);
                 th = new Thread(efeitomMusica);
                 th.start(); 
                break;
            case "Tela":
                 
                    efeitoPorImagem = new efeitoPorImagemDaTela(AsusAura);
                    th = new Thread(efeitoPorImagem);
                    th.start(); 
                break;
            case "Stroob":
                 efeitoStrobol = new efeitoStrobol(AsusAura);    
                  th = new Thread(efeitoStrobol);
                  th.start(); 
                
                  break;
            case "ArcoIris":                  
               efeitoArcoIris = new efeitoArcoIris(AsusAura);    
                th = new Thread(efeitoArcoIris);
                th.start(); 
                break;
            case "Onda":                  
                    efeitoOnda = new efeitoOnda(AsusAura);
                    th = new Thread(efeitoOnda);
                    th.start(); 
                break;
            case "Decremental":                
                 efeitoDecremental = new efeitoDecremental(jColor,AsusAura);    
                 th = new Thread(efeitoDecremental);
                 th.start();  
                break;
            case "Selecionada":                
                 efeitoCorSelecionada = new efeitoCorSelecionada(jColor,AsusAura);    
                 th = new Thread(efeitoCorSelecionada);
                 th.start(); 
                break;
            case "Temperatura":
                int temp1=Integer.valueOf(txtTemp1.getText());
                int temp2=Integer.valueOf(txtTemp2.getText()); 
                int temp3=Integer.valueOf(txtTemp3.getText()); 
                int temp4=Integer.valueOf(txtTemp4.getText());
                if(temp4 < temp3 || temp3<temp2 || temp2<temp1){
                    JOptionPane.showMessageDialog(this,"As temperaturas devem ser em ordem crescente");
                }else{                
                if(jCbDispositivo.getSelectedItem().toString().equals("GPU")){
                 efeitoPorTemperatura = new efeitoPorTemperatura(AsusAura, lbTemp1, lbTemp2, lbTemp3, lbTemp4, tempGPU,temp1,temp2,temp3,temp4);
                th = new Thread(efeitoPorTemperatura);
                th.start();  
                }else if(jCbDispositivo.getSelectedItem().toString().equals("CPU")){
                efeitoPorTemperatura = new efeitoPorTemperatura(AsusAura, lbTemp1, lbTemp2, lbTemp3, lbTemp4, tempCPU,temp1,temp2,temp3,temp4);
                th = new Thread(efeitoPorTemperatura);
                th.start(); 
                }
                }
                break;
        }
    }//GEN-LAST:event_btnAplicarEfeitoActionPerformed

    private void txtTemp1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemp1KeyPressed
        somenteDigitos(evt); 
        lbTemp1.setForeground(jColor.getSelectionModel().getSelectedColor());
                
    }//GEN-LAST:event_txtTemp1KeyPressed

    private void txtTemp2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemp2KeyPressed
        somenteDigitos(evt);
        lbTemp2.setForeground(jColor.getSelectionModel().getSelectedColor());
       
    }//GEN-LAST:event_txtTemp2KeyPressed

    private void txtTemp3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemp3KeyPressed
        somenteDigitos(evt);
        lbTemp3.setForeground(jColor.getSelectionModel().getSelectedColor());
       
    }//GEN-LAST:event_txtTemp3KeyPressed

    private void txtTemp4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemp4KeyPressed
      somenteDigitos(evt);
      lbTemp4.setForeground(jColor.getSelectionModel().getSelectedColor());
    }//GEN-LAST:event_txtTemp4KeyPressed

    private void jCbXEfeitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbXEfeitosActionPerformed
        
                 switch(jCbXEfeitos.getSelectedItem().toString()){
            case "Musica":                 
                    painelInternoTemperatuas.setVisible(false);
                break;
            case "Tela":
                  painelInternoTemperatuas.setVisible(false);
                    
                break;
            case "Stroob":
                 painelInternoTemperatuas.setVisible(false);
                  break;
            case "ArcoIris":                  
               painelInternoTemperatuas.setVisible(false);
                break;
            case "Onda":                  
                    painelInternoTemperatuas.setVisible(false);
                break;
            case "Decremental":                
                  painelInternoTemperatuas.setVisible(false);
                break;
            case "Selecionada":                
                 painelInternoTemperatuas.setVisible(false);
                break;
            case "Temperatura":
                       painelInternoTemperatuas.setVisible(true);         
                break;
        }
    }//GEN-LAST:event_jCbXEfeitosActionPerformed
    
    
       private void somenteDigitos(java.awt.event.KeyEvent evt) {
           if(!ArrayUtils.contains(numerais,evt.getKeyCode())){         
          if(evt.getKeyCode()!=8 && evt.getKeyCode()!=127){
              try {
                  Robot robot = new Robot();
                  robot.keyPress(KeyEvent.VK_BACKSPACE);           
              } catch (AWTException ex) {
                  Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
      }
       
} 
    
    private void tray(){
        this.dispose();        
        trayIcon=new TrayIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico.png")).getImage());
        trayIcon.setToolTip("RGB");       
        final SystemTray tray = SystemTray.getSystemTray();
        final PopupMenu menu =  new PopupMenu();
        MenuItem abrir = new MenuItem("Abrir");
        MenuItem exit = new MenuItem("Sair");        
        menu.add(abrir);
        menu.addSeparator();
        menu.add(exit);
        
        trayIcon.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              setVisible(true);
              tray.remove(trayIcon);
            }
        });
        
        abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
                tray.remove(trayIcon);
            }
        });
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pararEfeito();
                AsusAura.ReleaseControl();        
                LogiLED.LogiLedShutdown();
               System.exit(0);
            }
        });
        
        
        trayIcon.setPopupMenu(menu);
    try {
        tray.add(trayIcon);
    } catch (AWTException ex) {
        Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
    }
    }  

    
    public void pararEfeito(){
         try{
       efeitoArcoIris.allDone=true;         
        }catch(Exception ex){        
        }
         try{
         efeitoDecremental.allDone=true;  
          }catch(Exception ex){        
        }
         try{
        efeitoStrobol.allDone=true; 
         }catch(Exception ex){        
        }
         try{
             efeitoOnda.allDone=true;
         }catch(Exception ex){
             
         }
         try{
             efeitomMusica.allDone=true;
         }catch(Exception ex){             
         }
           try{
             efeitoPorImagem.allDone=true;
         }catch(Exception ex){             
         }       
         try{
             efeitoCorSelecionada.allDone=true;
         }catch(Exception ex){             
         }
         try{
             efeitoPorTemperatura.allDone=true;
         }catch(Exception ex){             
         }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarEfeito;
    private javax.swing.JButton btnHide;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> jCbDispositivo;
    private javax.swing.JComboBox<String> jCbXEfeitos;
    private javax.swing.JColorChooser jColor;
    private javax.swing.JLabel lbTemp1;
    private javax.swing.JLabel lbTemp2;
    private javax.swing.JLabel lbTemp3;
    private javax.swing.JLabel lbTemp4;
    private javax.swing.JPanel painelCores;
    private javax.swing.JPanel painelInternoTemperatuas;
    private javax.swing.JPanel painelOpcoes;
    private javax.swing.JPanel painelSuperior;
    private javax.swing.JLabel tempCPU;
    private javax.swing.JLabel tempCPUDescricao;
    private javax.swing.JLabel tempGPU;
    private javax.swing.JLabel tempGPUDescricao;
    private javax.swing.JFormattedTextField txtTemp1;
    private javax.swing.JFormattedTextField txtTemp2;
    private javax.swing.JFormattedTextField txtTemp3;
    private javax.swing.JFormattedTextField txtTemp4;
    // End of variables declaration//GEN-END:variables
}