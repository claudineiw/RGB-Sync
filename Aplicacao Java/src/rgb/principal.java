/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgb;

import Asus.MotherBoard;
import Logitech.Logitech;
import efeitos.efeitoOnda;
import efeitos.efeitoDecremental;
import efeitos.efeitoMusica;
import efeitos.efeitoPorImagemDaTela;
import efeitos.efeitoArcoIris;
import efeitos.efeitoStrobol;
import ca.fiercest.aurasdk.AuraSDK;
import capturaImagem.capturaTela;
import com.logitech.gaming.LogiLED;
import com.sun.glass.events.KeyEvent;
import efeitos.efeitoCorSelecionada;
import efeitos.efeitoPorTemperatura;
import java.awt.AWTException;

import java.awt.Color;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Robot;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import OpenHardwareMonitor.openHardwareMonitorCon;
import org.apache.commons.lang3.ArrayUtils;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import AAPerifericos.colecaoPerifericos;

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
openHardwareMonitorCon openHardwareMonitor;
efeitoPorTemperatura efeitoPorTemperatura;
capturaTela capturaTela;
colecaoPerifericos listaPerifericos = new colecaoPerifericos();
private static int numerais[]={48,49,50,51,52,53,54,55,56,57,96,97,98,99,100,101,102,103,104,105};
 

    public principal(){ 
         initComponents();  
         
         
         
         openHardwareMonitor = new openHardwareMonitorCon(tempCPU,tempGPU);   
         
         
         LogiLED.LogiLedInit();     
         AsusAura = new AuraSDK();
         listaPerifericos.setPerifericos(new MotherBoard(AsusAura.getDevices().get(0).getName(),"teste" ,0, AsusAura, AsusAura.getDevices().get(1)));
         listaPerifericos.setPerifericos(new Logitech());         
         Thread th = new Thread(openHardwareMonitor);
         th.start();          
	 jColorPrincipal.setColor(Color.RED);         
         btnAplicarEfeito.doClick();        
         this.setVisible(true);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        painelInternoImagens = new javax.swing.JPanel();
        lbMouse = new javax.swing.JLabel();
        lbTeclado = new javax.swing.JLabel();
        lbImagem = new javax.swing.JLabel();
        painelInternoArcoIris = new javax.swing.JPanel();
        jcBCoresArcoIris = new javax.swing.JComboBox<>();
        btnAdicionarCorArcoIris = new javax.swing.JButton();
        btnRemoverCorArcoIris = new javax.swing.JButton();
        painelPrincipal = new javax.swing.JLayeredPane();
        painelLateralEsquerda = new javax.swing.JPanel();
        painelCores = new javax.swing.JPanel();
        jColorPrincipal = new javax.swing.JColorChooser();
        jCbXEfeitos = new javax.swing.JComboBox<>();
        btnAplicarEfeito = new javax.swing.JButton();
        painelSuperior = new javax.swing.JPanel();
        tempCPU = new javax.swing.JLabel();
        tempGPU = new javax.swing.JLabel();
        tempCPUDescricao = new javax.swing.JLabel();
        tempGPUDescricao = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnHide = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        painelOpcoes = new javax.swing.JLayeredPane();

        painelInternoTemperatuas.setPreferredSize(new java.awt.Dimension(370, 310));

        lbTemp4.setText("Temperatura 04");

        lbTemp1.setText("Temperatura 01");

        lbTemp2.setText("Temperatura 02");

        lbTemp3.setText("Temperatura 03");

        txtTemp4.setText("0");
        txtTemp4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemp4KeyPressed(evt);
            }
        });

        txtTemp1.setText("0");
        txtTemp1.setPreferredSize(new java.awt.Dimension(11, 21));
        txtTemp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemp1KeyPressed(evt);
            }
        });

        txtTemp2.setText("0");
        txtTemp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemp2KeyPressed(evt);
            }
        });

        txtTemp3.setText("0");
        txtTemp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemp3KeyPressed(evt);
            }
        });

        jCbDispositivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPU", "GPU" }));

        javax.swing.GroupLayout painelInternoTemperatuasLayout = new javax.swing.GroupLayout(painelInternoTemperatuas);
        painelInternoTemperatuas.setLayout(painelInternoTemperatuasLayout);
        painelInternoTemperatuasLayout.setHorizontalGroup(
            painelInternoTemperatuasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInternoTemperatuasLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(painelInternoTemperatuasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInternoTemperatuasLayout.createSequentialGroup()
                        .addGroup(painelInternoTemperatuasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTemp1)
                            .addComponent(lbTemp2)
                            .addComponent(lbTemp3)
                            .addComponent(lbTemp4))
                        .addGap(11, 11, 11)
                        .addGroup(painelInternoTemperatuasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTemp1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemp4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemp2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemp3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelInternoTemperatuasLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jCbDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        painelInternoTemperatuasLayout.setVerticalGroup(
            painelInternoTemperatuasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInternoTemperatuasLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jCbDispositivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelInternoTemperatuasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTemp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelInternoTemperatuasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTemp2, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lbTemp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelInternoTemperatuasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTemp3, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lbTemp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelInternoTemperatuasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTemp4, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lbTemp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        painelInternoImagens.setMaximumSize(new java.awt.Dimension(360, 270));
        painelInternoImagens.setMinimumSize(new java.awt.Dimension(360, 270));
        painelInternoImagens.setPreferredSize(new java.awt.Dimension(360, 270));
        painelInternoImagens.setSize(360,270);
        painelInternoImagens.setRequestFocusEnabled(false);
        painelInternoImagens.setVerifyInputWhenFocusTarget(false);
        painelInternoImagens.setLayout(null);

        lbMouse.setBackground(new java.awt.Color(60, 63, 255));
        lbMouse.setForeground(new java.awt.Color(187, 187, 255));
        lbMouse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mouse.png"))); // NOI18N
        lbMouse.setName("lbMouse"); // NOI18N
        lbMouse.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbMouseMouseDragged(evt);
            }
        });
        painelInternoImagens.add(lbMouse);
        lbMouse.setBounds(290, 100, 60, 70);
        lbMouse.getAccessibleContext().setAccessibleName("lbMouse");

        lbTeclado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teclado 128.png"))); // NOI18N
        lbTeclado.setName("lbTeclado"); // NOI18N
        lbTeclado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbTecladoMouseDragged(evt);
            }
        });
        painelInternoImagens.add(lbTeclado);
        lbTeclado.setBounds(120, 200, 130, 70);
        lbTeclado.getAccessibleContext().setAccessibleName("lbTeclado");

        lbImagem.setName("lbImagem"); // NOI18N
        painelInternoImagens.add(lbImagem);
        lbImagem.setBounds(0, 0, 360, 270);
        lbImagem.getAccessibleContext().setAccessibleName("lbImagem");

        painelInternoArcoIris.setMaximumSize(new java.awt.Dimension(360, 270));
        painelInternoArcoIris.setMinimumSize(new java.awt.Dimension(360, 270));
        painelInternoArcoIris.setPreferredSize(new java.awt.Dimension(360, 270));
        painelInternoArcoIris.setLayout(null);

        jcBCoresArcoIris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBCoresArcoIrisActionPerformed(evt);
            }
        });
        painelInternoArcoIris.add(jcBCoresArcoIris);
        jcBCoresArcoIris.setBounds(100, 80, 144, 26);

        btnAdicionarCorArcoIris.setText("Adicionar");
        btnAdicionarCorArcoIris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCorArcoIrisActionPerformed(evt);
            }
        });
        painelInternoArcoIris.add(btnAdicionarCorArcoIris);
        btnAdicionarCorArcoIris.setBounds(60, 140, 84, 32);

        btnRemoverCorArcoIris.setText("Remover");
        btnRemoverCorArcoIris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCorArcoIrisActionPerformed(evt);
            }
        });
        painelInternoArcoIris.add(btnRemoverCorArcoIris);
        btnRemoverCorArcoIris.setBounds(187, 141, 81, 32);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setName("RGBPrincipal"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        painelCores.setLayout(null);

        jColorPrincipal.removeChooserPanel(jColorPrincipal.getChooserPanels()[4]);
        jColorPrincipal.removeChooserPanel(jColorPrincipal.getChooserPanels()[3]);
        jColorPrincipal.removeChooserPanel(jColorPrincipal.getChooserPanels()[2]);
        jColorPrincipal.removeChooserPanel(jColorPrincipal.getChooserPanels()[0]);
        jColorPrincipal.getPreviewPanel().setVisible(false);
        jColorPrincipal.remove(0);
        jColorPrincipal.getChooserPanels()[0].getComponent(0).setVisible(false);
        painelCores.add(jColorPrincipal);
        jColorPrincipal.setBounds(0, 0, 240, 210);

        jCbXEfeitos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionada", "Musica", "Tela", "Stroob", "ArcoIris", "Onda", "Decremental", "Temperatura" }));
        jCbXEfeitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbXEfeitosActionPerformed(evt);
            }
        });

        btnAplicarEfeito.setText("Aplicar");
        btnAplicarEfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarEfeitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLateralEsquerdaLayout = new javax.swing.GroupLayout(painelLateralEsquerda);
        painelLateralEsquerda.setLayout(painelLateralEsquerdaLayout);
        painelLateralEsquerdaLayout.setHorizontalGroup(
            painelLateralEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralEsquerdaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(painelCores, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelLateralEsquerdaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jCbXEfeitos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelLateralEsquerdaLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnAplicarEfeito))
        );
        painelLateralEsquerdaLayout.setVerticalGroup(
            painelLateralEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralEsquerdaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(painelCores, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCbXEfeitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAplicarEfeito)
                .addContainerGap())
        );

        tempCPU.setText("0");

        tempGPU.setText("0");

        tempCPUDescricao.setText("CPU");

        tempGPUDescricao.setText("GPU");

        btnSair.setBackground(new java.awt.Color(60, 63, 255,0));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/m_fechar.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnHide.setBackground(new java.awt.Color(60, 63, 255,0));
        btnHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/m_hide.png"))); // NOI18N
        btnHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHideActionPerformed(evt);
            }
        });

        btnMinimizar.setBackground(new java.awt.Color(60, 63, 255,0));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/m_minimize.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSuperiorLayout = new javax.swing.GroupLayout(painelSuperior);
        painelSuperior.setLayout(painelSuperiorLayout);
        painelSuperiorLayout.setHorizontalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSuperiorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tempCPUDescricao)
                .addGap(6, 6, 6)
                .addComponent(tempCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(tempGPUDescricao)
                .addGap(6, 6, 6)
                .addComponent(tempGPU, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(420, 420, 420)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHide, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelSuperiorLayout.setVerticalGroup(
            painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnHide, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(painelSuperiorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tempCPUDescricao)
                    .addComponent(tempCPU)
                    .addComponent(tempGPUDescricao)
                    .addComponent(tempGPU)))
        );

        painelOpcoes.setBackground(new java.awt.Color(60, 63, 255,0));
        painelOpcoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelPrincipal.setLayer(painelLateralEsquerda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelPrincipal.setLayer(painelSuperior, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelPrincipal.setLayer(painelOpcoes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLateralEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelLateralEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(painelOpcoes)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        pararEfeito();
         try{
             openHardwareMonitor.allDone=true;
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
      int x=evt.getXOnScreen()-this.getWidth()/2;
      int y=evt.getYOnScreen()-this.getHeight()/2;
      this.setLocation(x,y);
    }//GEN-LAST:event_formMouseDragged

    private void btnAplicarEfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarEfeitoActionPerformed
    try {
        pararEfeito();
        
        Thread.sleep(1000);
        
        Thread th;
        switch(jCbXEfeitos.getSelectedItem().toString()){
            case "Musica":
                efeitomMusica = new efeitoMusica(listaPerifericos);
                th = new Thread(efeitomMusica);
                th.start(); 
                break;
            case "Tela":
                capturaTela.allDone=true;
                efeitoPorImagem = new efeitoPorImagemDaTela(AsusAura,painelInternoImagens);
                th = new Thread(efeitoPorImagem);
                th.start(); 
                break;
            case "Stroob":
                efeitoStrobol = new efeitoStrobol(listaPerifericos);
                th = new Thread(efeitoStrobol);
                th.start(); 
                
                break;
            case "ArcoIris":  
                if(jcBCoresArcoIris.getModel().getSize()>=0){
                    ArrayList<int []> cores = new ArrayList<int []>();
                    for(int i=0;i<jcBCoresArcoIris.getModel().getSize();i++){
                        cores.add(separarCoresTexto(jcBCoresArcoIris.getItemAt(i)));
                    }
                    efeitoArcoIris = new efeitoArcoIris(AsusAura,cores);
                    th = new Thread(efeitoArcoIris);
                    th.start();
                }
                break;
            case "Onda":
                efeitoOnda = new efeitoOnda(AsusAura);
                th = new Thread(efeitoOnda);
                th.start(); 
                break;
            case "Decremental":
                efeitoDecremental = new efeitoDecremental(jColorPrincipal,listaPerifericos);
                th = new Thread(efeitoDecremental);
                th.start();  
                break;
            case "Selecionada":      
                
                efeitoCorSelecionada = new efeitoCorSelecionada(jColorPrincipal,listaPerifericos);
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
                        efeitoPorTemperatura = new efeitoPorTemperatura(listaPerifericos, lbTemp1, lbTemp2, lbTemp3, lbTemp4, tempGPU,temp1,temp2,temp3,temp4);
                        th = new Thread(efeitoPorTemperatura);
                        th.start();
                    }else if(jCbDispositivo.getSelectedItem().toString().equals("CPU")){
                        efeitoPorTemperatura = new efeitoPorTemperatura(listaPerifericos, lbTemp1, lbTemp2, lbTemp3, lbTemp4, tempCPU,temp1,temp2,temp3,temp4);
                        th = new Thread(efeitoPorTemperatura);
                        th.start(); 
                    }
                }
                break;
        }
    } catch (InterruptedException ex) {
        Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAplicarEfeitoActionPerformed

    private void txtTemp1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemp1KeyPressed
        somenteDigitos(evt); 
        lbTemp1.setForeground(jColorPrincipal.getSelectionModel().getSelectedColor());
                
    }//GEN-LAST:event_txtTemp1KeyPressed

    private void txtTemp2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemp2KeyPressed
        somenteDigitos(evt);
        lbTemp2.setForeground(jColorPrincipal.getSelectionModel().getSelectedColor());
       
    }//GEN-LAST:event_txtTemp2KeyPressed

    private void txtTemp3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemp3KeyPressed
        somenteDigitos(evt);
        lbTemp3.setForeground(jColorPrincipal.getSelectionModel().getSelectedColor());
       
    }//GEN-LAST:event_txtTemp3KeyPressed

    private void txtTemp4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemp4KeyPressed
      somenteDigitos(evt);
      lbTemp4.setForeground(jColorPrincipal.getSelectionModel().getSelectedColor());
    }//GEN-LAST:event_txtTemp4KeyPressed

    private void jCbXEfeitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbXEfeitosActionPerformed
     AbsoluteConstraints absoluteConstraints = new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0, 360, 270); 
     painelOpcoes.removeAll();     
     painelOpcoes.repaint();
                try{
                capturaTela.allDone=true;
                }catch(Exception ex){
                                        
                }
                 switch(jCbXEfeitos.getSelectedItem().toString()){
            case "Musica":                 
                   
                break;
            case "Tela":    
                    capturaTela = new capturaTela(lbImagem);
                    Thread thCapturaTela = new Thread(capturaTela);
                    thCapturaTela.start();  
                    painelOpcoes.add(painelInternoImagens, absoluteConstraints);       
                break;
            case "Stroob":
                
                  break;
            case "ArcoIris":                  
              painelOpcoes.add(painelInternoArcoIris, absoluteConstraints); 
                break;
            case "Onda":                  
                    
                break;
            case "Decremental":                
                 
                break;
            case "Selecionada":                
                
                break;
            case "Temperatura": 
                painelOpcoes.add(painelInternoTemperatuas,absoluteConstraints);  
                break;
        }
    }//GEN-LAST:event_jCbXEfeitosActionPerformed

    private void lbTecladoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTecladoMouseDragged
        alocarPerifericos(lbTeclado);
             
    }//GEN-LAST:event_lbTecladoMouseDragged

    private void lbMouseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMouseMouseDragged
        alocarPerifericos(lbMouse);
    }//GEN-LAST:event_lbMouseMouseDragged

    private void btnAdicionarCorArcoIrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCorArcoIrisActionPerformed
        Color cor=jColorPrincipal.getSelectionModel().getSelectedColor();     
        jcBCoresArcoIris.addItem(cor.toString().replace("java.awt.Color",""));
        
        
    }//GEN-LAST:event_btnAdicionarCorArcoIrisActionPerformed

    private void jcBCoresArcoIrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBCoresArcoIrisActionPerformed
       try{
        String corSelecionada= jcBCoresArcoIris.getSelectedItem().toString();
        int [] retorno = separarCoresTexto(corSelecionada);
        jcBCoresArcoIris.setForeground(new Color(retorno[0],retorno[1],retorno[2]));
       }catch(java.lang.NullPointerException ex){
           
       }
    }//GEN-LAST:event_jcBCoresArcoIrisActionPerformed
    
    private  int[] separarCoresTexto(String corSelecionada){
        int r=0;
        int g=0;
        int b=0;  
        r=Integer.valueOf(corSelecionada.substring(corSelecionada.lastIndexOf("r=")+2,corSelecionada.indexOf(","))); 
        g=Integer.valueOf(corSelecionada.substring(corSelecionada.lastIndexOf("g=")+2,corSelecionada.lastIndexOf(","))); 
        b=Integer.valueOf(corSelecionada.substring(corSelecionada.lastIndexOf("b=")+2,corSelecionada.lastIndexOf("]"))); 
        int [] retorno={r,g,b};
        return retorno;
    }
    private void btnRemoverCorArcoIrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCorArcoIrisActionPerformed
       jcBCoresArcoIris.removeItemAt(jcBCoresArcoIris.getSelectedIndex());
    }//GEN-LAST:event_btnRemoverCorArcoIrisActionPerformed
    
    private void alocarPerifericos(JLabel obj){
         Point local=painelInternoImagens.getMousePosition();
        if(local != null){
        int x=new Double(local.getX()).intValue()-obj.getWidth()/2;
        int y=new Double(local.getY()).intValue()-obj.getHeight()/2;           
        if(x>0 && y> 0 && x<painelInternoImagens.getWidth()-obj.getWidth() && y<painelInternoImagens.getHeight()-obj.getHeight()){
           obj.setLocation(x,y); 
        }
        }
    }
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
    private javax.swing.JButton btnAdicionarCorArcoIris;
    private javax.swing.JButton btnAplicarEfeito;
    private javax.swing.JButton btnHide;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRemoverCorArcoIris;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> jCbDispositivo;
    private javax.swing.JComboBox<String> jCbXEfeitos;
    private javax.swing.JColorChooser jColorPrincipal;
    private javax.swing.JComboBox<String> jcBCoresArcoIris;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbMouse;
    private javax.swing.JLabel lbTeclado;
    private javax.swing.JLabel lbTemp1;
    private javax.swing.JLabel lbTemp2;
    private javax.swing.JLabel lbTemp3;
    private javax.swing.JLabel lbTemp4;
    private javax.swing.JPanel painelCores;
    private javax.swing.JPanel painelInternoArcoIris;
    private javax.swing.JPanel painelInternoImagens;
    private javax.swing.JPanel painelInternoTemperatuas;
    private javax.swing.JPanel painelLateralEsquerda;
    private javax.swing.JLayeredPane painelOpcoes;
    private javax.swing.JLayeredPane painelPrincipal;
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