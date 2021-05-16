package RGB;

import efeitos.efeitoOnda;
import efeitos.efeitoDecremental;
import efeitos.efeitoMusica;
import efeitos.efeitoPorImagemDaTela;
import efeitos.efeitoArcoIris;
import efeitos.efeitoStrobol;
import capturaImagem.capturaTela;
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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Temperatura.RGBexeCon;
import org.apache.commons.lang3.ArrayUtils;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import IPerifericos.colecaoPerifericos;
import Asus.MotherBoard;
import Logitech.HIDPID.DevicesLogitech;
import Logitech.HeadSet;
import Logitech.Mouse;
import Logitech.Keyboard;
import Logitech.MouseMat;
import ca.fiercest.cuesdk.CueSDK;
import ca.fiercest.cuesdk.NoServerException;
import javax.swing.DefaultListModel;
import Logitech.HIDPID.verificarPerifericosLogitech;
import Metodos.tempoPorVolta;
import ca.fiercest.aurasdk.AuraSDK;
import ca.fiercest.cuesdk.CorsairDevice;
import efeitos.IEfeitos;
import efeitos.efeitoPassagem;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import javax.swing.event.ChangeEvent;

@SuppressWarnings("serial")
public final class principal extends javax.swing.JFrame {

    private AuraSDK AsusAura;
    private CueSDK CorsairSDK;
    private static TrayIcon trayIcon;
    private IEfeitos efeito;
    private RGBexeCon RGBexeCon;
    private capturaTela capturaTela;
    private colecaoPerifericos listaPerifericos;
    private verificarPerifericosLogitech verificarPerifericosLogitech;
    private ArrayList<Color> cores;
    private ArrayList<Integer> temperaturas;
    private Mixer.Info[] mixerInfo;
    private ArrayList<Mixer.Info> mixerChoices;
                
    public principal() {
        initComponents();
        iniciaBibliotecas();

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
        painelInternoSelecaoDeCores = new javax.swing.JPanel();
        jcBSelecaoDeCores = new javax.swing.JComboBox<>();
        btnAdicionarCorSelecionada = new javax.swing.JButton();
        btnRemoverCorSelecionada = new javax.swing.JButton();
        painelInternoPerifericos = new javax.swing.JPanel();
        btnAdicionarNaLista = new javax.swing.JButton();
        btnRemoverDaLista = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLPerifericos = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLSelecionados = new javax.swing.JList<>();
        painelInternoMusica = new javax.swing.JPanel();
        jcbMusica = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
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

        painelInternoSelecaoDeCores.setMaximumSize(new java.awt.Dimension(360, 270));
        painelInternoSelecaoDeCores.setMinimumSize(new java.awt.Dimension(360, 270));
        painelInternoSelecaoDeCores.setPreferredSize(new java.awt.Dimension(360, 270));
        painelInternoSelecaoDeCores.setLayout(null);

        jcBSelecaoDeCores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBSelecaoDeCoresActionPerformed(evt);
            }
        });
        painelInternoSelecaoDeCores.add(jcBSelecaoDeCores);
        jcBSelecaoDeCores.setBounds(100, 80, 144, 26);

        btnAdicionarCorSelecionada.setText("Adicionar");
        btnAdicionarCorSelecionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCorSelecionadaActionPerformed(evt);
            }
        });
        painelInternoSelecaoDeCores.add(btnAdicionarCorSelecionada);
        btnAdicionarCorSelecionada.setBounds(60, 140, 84, 32);

        btnRemoverCorSelecionada.setText("Remover");
        btnRemoverCorSelecionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCorSelecionadaActionPerformed(evt);
            }
        });
        painelInternoSelecaoDeCores.add(btnRemoverCorSelecionada);
        btnRemoverCorSelecionada.setBounds(187, 141, 81, 32);

        painelInternoPerifericos.setMaximumSize(new java.awt.Dimension(360, 270));
        painelInternoPerifericos.setMinimumSize(new java.awt.Dimension(360, 270));
        painelInternoPerifericos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdicionarNaLista.setBackground(new java.awt.Color(60, 63, 255,0));
        btnAdicionarNaLista.setText(">>");
        btnAdicionarNaLista.setPreferredSize(new java.awt.Dimension(10, 10));
        btnAdicionarNaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarNaListaActionPerformed(evt);
            }
        });
        painelInternoPerifericos.add(btnAdicionarNaLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 50, 30));

        btnRemoverDaLista.setBackground(new java.awt.Color(60, 63, 255,0));
        btnRemoverDaLista.setText("<<");
        btnRemoverDaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverDaListaActionPerformed(evt);
            }
        });
        painelInternoPerifericos.add(btnRemoverDaLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 50, -1));

        jLPerifericos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jLPerifericos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );

        painelInternoPerifericos.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 190));

        jLSelecionados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jLSelecionados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );

        painelInternoPerifericos.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 130, 190));

        painelInternoMusica.setMaximumSize(new java.awt.Dimension(360, 270));
        painelInternoMusica.setMinimumSize(new java.awt.Dimension(360, 270));
        painelInternoMusica.setPreferredSize(new java.awt.Dimension(360, 210));
        painelInternoMusica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelInternoMusica.add(jcbMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, -1));

        jLabel1.setText("Selecione o dispositivo de escuta");
        painelInternoMusica.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

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
        jColorPrincipal.getSelectionModel().addChangeListener(new javax.swing.event.ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                alterarArrayCores();
            }
        });

        jCbXEfeitos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionada", "Musica", "Tela", "Stroob", "ArcoIris", "Onda", "Decremental", "Temperatura", "Passagem" }));
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
        tempCPU.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tempCPUPropertyChange(evt);
            }
        });

        tempGPU.setText("0");
        tempGPU.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tempGPUPropertyChange(evt);
            }
        });

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

    private void iniciaBibliotecas() {
        jColorPrincipal.setColor(Color.RED);
        this.temperaturas = new ArrayList<>();
        this.cores = new ArrayList<>();
        listaPerifericos = new colecaoPerifericos();
        verificarPerifericosLogitech = new verificarPerifericosLogitech();
        preencherListaPerifericos();
        iniciarMonitorTemperatura();
        iniciarDispositivosDeAudio();
    }
    

    private void iniciarDispositivosDeAudio(){
        mixerInfo = AudioSystem.getMixerInfo();
        mixerChoices = new ArrayList<>();
        for (Mixer.Info info : mixerInfo) {
                    if (info.getDescription().equals("Direct Audio Device: DirectSound Capture")) {
                        jcbMusica.addItem(info.getName());
                        mixerChoices.add(info);
                    }
                }     
    }
    
    
    private void iniciarMonitorTemperatura() {
        RGBexeCon = new RGBexeCon(tempCPU, tempGPU);
        Thread th = new Thread(RGBexeCon);
        th.start();
    }

    private int iniciadoPerifericos() {
        return jLPerifericos.getModel().getSize();
    }

    private int iniciadoTemperaturas() {
        return Integer.valueOf(tempGPU.getText()) + Integer.valueOf(tempCPU.getText());
    }

    public int iniciado() {
        if (iniciadoPerifericos() > 0) {
            if (iniciadoTemperaturas() > 0) {
                return 1;
            }
            return -1;
        }
        return -1;
    }

    private void alterarArrayCores() {
        try {
            if (!cores.isEmpty()) {
                switch (jCbXEfeitos.getSelectedItem().toString()) {
                    case "Musica":
                        cores.clear();
                        cores.add(jColorPrincipal.getSelectionModel().getSelectedColor());
                        break;
                    case "Tela":

                        break;
                    case "Stroob":

                        break;
                    case "ArcoIris":

                        break;
                    case "Onda":

                        break;
                    case "Decremental":
                        cores.clear();
                        cores.add(jColorPrincipal.getSelectionModel().getSelectedColor());
                        break;
                    case "Selecionada":
                        cores.clear();
                        cores.add(jColorPrincipal.getSelectionModel().getSelectedColor());
                        break;
                    case "Temperatura":

                        break;
                    case "Passagem":

                        break;
                }

            }
        } catch (Exception ex) {

        }
    }

    private void preencherListaPerifericos() {
        DefaultListModel<String> model = new DefaultListModel<>();
        jLPerifericos.setModel(model);

        try {
            this.AsusAura = new AuraSDK();
            AsusAura.getDevices().forEach(de -> {
                model.addElement("Asus: " + de.getName());
            });
        } catch (Exception ex) {
        }

        try {
            DevicesLogitech.GetPerifericos().stream().filter(device -> (verificarPerifericosLogitech.testarPeriferico(device.toString()))).forEachOrdered(device -> {
                model.addElement(device.getMarca() + ": " + device.getDeviceType() + " " + device.getModel());
            });
        } catch (Exception ex) {
        }
        try {
            this.CorsairSDK = new CueSDK();
            CorsairSDK.getDevices().forEach(corsair -> {
                model.addElement("Corsair: " + corsair.getModelName());
            });
        } catch (NoServerException ex) {
        }
        if (jLPerifericos.getModel().getSize() == 0) {
            model.addElement("Sem Hardwares Compativeis");
        }
        painelOpcoes.add(painelInternoPerifericos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 270));
    }


    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        pararEfeito();
        RGBexeCon.allDone = true;
        AsusAura.ReleaseControl();
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHideActionPerformed
        tray();
    }//GEN-LAST:event_btnHideActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen() - this.getWidth() / 2;
        int y = evt.getYOnScreen() - this.getHeight() / 2;
        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged

    private void btnAplicarEfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarEfeitoActionPerformed
        pararEfeito();
        Thread th;
        if (listaPerifericos.getPerifericos().size() > 0) {
            switch (jCbXEfeitos.getSelectedItem().toString()) {
                case "Musica":     
                    cores.clear();
                    cores.add(jColorPrincipal.getSelectionModel().getSelectedColor());
                    efeito = new efeitoMusica(listaPerifericos,cores,mixerChoices.get(jcbMusica.getSelectedIndex()));
                    break;
                case "Tela":
                    capturaTela.allDone = true;
                    efeito = new efeitoPorImagemDaTela(listaPerifericos, painelInternoImagens);
                    break;
                case "Stroob":
                    efeito = new efeitoStrobol(listaPerifericos);
                    break;
                case "ArcoIris":
                    if (jcBSelecaoDeCores.getModel().getSize() > 0) {
                        selecionarCores();
                        efeito = new efeitoArcoIris(listaPerifericos, cores);
                    } else {
                        JOptionPane.showMessageDialog(this, "Favor Selecionar as cores");
                    }
                    break;
                case "Onda":
                    if (jcBSelecaoDeCores.getModel().getSize() > 0) {
                        selecionarCores();
                        efeito = new efeitoOnda(listaPerifericos, cores);
                    } else {
                        JOptionPane.showMessageDialog(this, "Favor Selecionar as cores");
                    }
                    break;
                case "Decremental":
                    cores.clear();
                    cores.add(jColorPrincipal.getSelectionModel().getSelectedColor());
                    efeito = new efeitoDecremental(listaPerifericos, cores);
                    break;
                case "Selecionada":
                    cores.clear();
                    cores.add(jColorPrincipal.getSelectionModel().getSelectedColor());
                    efeito = new efeitoCorSelecionada(listaPerifericos, cores);
                    break;
                case "Temperatura":
                    if (preencherTemperaturas()) {
                        efeito = new efeitoPorTemperatura(listaPerifericos, cores, temperaturas);
                    }
                    break;
                case "Passagem":
                    if (jcBSelecaoDeCores.getModel().getSize() > 0) {
                        selecionarCores();
                        efeito = new efeitoPassagem(listaPerifericos, cores);
                    } else {
                        JOptionPane.showMessageDialog(this, "Favor Selecionar as cores");
                    }
                    break;
            }

            if (efeito != null) {
                th = new Thread(efeito);
                th.start();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecionar perifericos");
        }
    }//GEN-LAST:event_btnAplicarEfeitoActionPerformed

    private boolean preencherTemperaturas() {
        try {
            int temp1 = Integer.valueOf(txtTemp1.getText());
            int temp2 = Integer.valueOf(txtTemp2.getText());
            int temp3 = Integer.valueOf(txtTemp3.getText());
            int temp4 = Integer.valueOf(txtTemp4.getText());
            if (temp1 > 0 && temp2 > 0 && temp3 > 0 && temp4 > 0) {
                if (temp4 < temp3 || temp3 < temp2 || temp2 < temp1) {
                    JOptionPane.showMessageDialog(this, "As temperaturas devem ser em ordem crescente");
                    return false;
                } else {
                    temperaturas.clear();
                    temperaturas.add(temp1);
                    temperaturas.add(temp2);
                    temperaturas.add(temp3);
                    temperaturas.add(temp4);
                    cores.clear();
                    cores.add(lbTemp1.getForeground());
                    cores.add(lbTemp2.getForeground());
                    cores.add(lbTemp3.getForeground());
                    cores.add(lbTemp4.getForeground());

                    if (jCbDispositivo.getSelectedItem().toString().equals("GPU")) {
                        temperaturas.add(Integer.valueOf(tempGPU.getText()));
                    } else if (jCbDispositivo.getSelectedItem().toString().equals("CPU")) {
                        temperaturas.add(Integer.valueOf(tempCPU.getText()));
                    }
                    return true;
                }
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    private void selecionarCores() {
        cores.clear();
        for (int i = 0; i < jcBSelecaoDeCores.getModel().getSize(); i++) {
            int[] cor = separarCoresTexto(jcBSelecaoDeCores.getItemAt(i));
            cores.add(new Color(cor[0], cor[1], cor[2]));
        }
    }
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
        try {
            capturaTela.allDone = true;
        } catch (Exception ex) {
        }
        AbsoluteConstraints absoluteConstraints = new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 270);
        painelOpcoes.removeAll();
        painelOpcoes.repaint();
        switch (jCbXEfeitos.getSelectedItem().toString()) {
            case "Musica":   
                painelOpcoes.add(painelInternoMusica, absoluteConstraints);
                break;
            case "Tela":
                capturaTela = new capturaTela(lbImagem);
                Thread thCapturaTela = new Thread(capturaTela);
                thCapturaTela.setName("capturaTela");
                thCapturaTela.start();
                painelOpcoes.add(painelInternoImagens, absoluteConstraints);
                break;
            case "Stroob":

                break;
            case "ArcoIris":
                painelOpcoes.add(painelInternoSelecaoDeCores, absoluteConstraints);
                break;
            case "Onda":
                painelOpcoes.add(painelInternoSelecaoDeCores, absoluteConstraints);
                break;
            case "Decremental":

                break;
            case "Selecionada":
                painelOpcoes.add(painelInternoPerifericos, absoluteConstraints);
                break;
            case "Temperatura":
                painelOpcoes.add(painelInternoTemperatuas, absoluteConstraints);
                break;
            case "Passagem":
                painelOpcoes.add(painelInternoSelecaoDeCores, absoluteConstraints);
                break;
        }
    }//GEN-LAST:event_jCbXEfeitosActionPerformed

    private void lbTecladoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTecladoMouseDragged
        alocarPerifericos(lbTeclado);

    }//GEN-LAST:event_lbTecladoMouseDragged

    private void lbMouseMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMouseMouseDragged
        alocarPerifericos(lbMouse);
    }//GEN-LAST:event_lbMouseMouseDragged

    private void btnAdicionarCorSelecionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCorSelecionadaActionPerformed
        Color cor = jColorPrincipal.getSelectionModel().getSelectedColor();
        jcBSelecaoDeCores.addItem(cor.toString().replace("java.awt.Color", ""));
        selecionarCores();


    }//GEN-LAST:event_btnAdicionarCorSelecionadaActionPerformed

    private void jcBSelecaoDeCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBSelecaoDeCoresActionPerformed
        try {
            String corSelecionada = jcBSelecaoDeCores.getSelectedItem().toString();
            int[] retorno = separarCoresTexto(corSelecionada);
            jcBSelecaoDeCores.setForeground(new Color(retorno[0], retorno[1], retorno[2]));
        } catch (java.lang.NullPointerException ex) {

        }
    }//GEN-LAST:event_jcBSelecaoDeCoresActionPerformed

    private int[] separarCoresTexto(String corSelecionada) {
        int r;
        int g;
        int b;
        r = Integer.valueOf(corSelecionada.substring(corSelecionada.lastIndexOf("r=") + 2, corSelecionada.indexOf(",")));
        g = Integer.valueOf(corSelecionada.substring(corSelecionada.lastIndexOf("g=") + 2, corSelecionada.lastIndexOf(",")));
        b = Integer.valueOf(corSelecionada.substring(corSelecionada.lastIndexOf("b=") + 2, corSelecionada.lastIndexOf("]")));
        int[] retorno = {r, g, b};
        return retorno;
    }
    private void btnRemoverCorSelecionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCorSelecionadaActionPerformed
        jcBSelecaoDeCores.removeItemAt(jcBSelecaoDeCores.getSelectedIndex());
        selecionarCores();
    }//GEN-LAST:event_btnRemoverCorSelecionadaActionPerformed

    private void btnAdicionarNaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarNaListaActionPerformed
        try {
            DefaultListModel<String> model = new DefaultListModel<>();
            for (int i = 0; i < jLSelecionados.getModel().getSize(); i++) {
                model.addElement(jLSelecionados.getModel().getElementAt(i));

            }
            jLSelecionados.setModel(model);
            criarListaPerifericos(jLPerifericos.getSelectedValue());
            model.addElement(jLPerifericos.getSelectedValue());

            int selectedIndex = jLPerifericos.getSelectedIndex();
            String[] ListData = new String[jLPerifericos.getModel().getSize()];
            for (int i = 0; i < ListData.length; i++) {
                if (i != selectedIndex) {
                    ListData[i] = jLPerifericos.getModel().getElementAt(i);
                }
            }
            jLPerifericos.setListData(ListData);
        } catch (Exception ex) {

        }

    }//GEN-LAST:event_btnAdicionarNaListaActionPerformed

    private void criarListaPerifericos(String periferico) {
        if (periferico.toLowerCase().contains("logitech:".toLowerCase())) {
            if (periferico.toLowerCase().contains("mouse ".toLowerCase())) {
                listaPerifericos.setPerifericos(new Mouse(periferico, periferico, Color.red));
            } else {
                if (periferico.toLowerCase().contains("keyboard".toLowerCase())) {
                    listaPerifericos.setPerifericos(new Keyboard(periferico, periferico, Color.red));
                } else {
                    if (periferico.toLowerCase().contains("headset".toLowerCase())) {
                        listaPerifericos.setPerifericos(new HeadSet(periferico, periferico, Color.red));
                    } else {
                        if (periferico.toLowerCase().contains("Mousepad".toLowerCase())) {
                            listaPerifericos.setPerifericos(new MouseMat(periferico, periferico, Color.red));
                        }
                    }
                }
            }

        } else {
            if (periferico.toLowerCase().contains("asus:".toLowerCase())) {
                AsusAura.getDevices().stream().filter(device -> (periferico.toLowerCase().contains(device.getName().toLowerCase()))).forEachOrdered(device -> {
                    listaPerifericos.setPerifericos(new MotherBoard(periferico, periferico, 0, AsusAura, device));
                });

            } else {
                if (periferico.toLowerCase().contains("corsair:".toLowerCase())) {
                    for (CorsairDevice corsair : CorsairSDK.getDevices()) {
                        if (corsair.getType().toString().toLowerCase().contains("keyboard".toLowerCase()) && periferico.toLowerCase().contains(corsair.getModelName().toLowerCase())) {
                            listaPerifericos.setPerifericos(new Corsair.Keyboard(corsair.getModelName(), CorsairSDK, corsair));
                            break;
                        }
                        if (corsair.getType().toString().toLowerCase().contains("Mouse".toLowerCase()) && periferico.toLowerCase().contains(corsair.getModelName().toLowerCase())) {
                            if (!corsair.getType().toString().toLowerCase().contains("MouseMat".toLowerCase())) {
                                listaPerifericos.setPerifericos(new Corsair.Mouse(corsair.getModelName(), CorsairSDK, corsair));
                                break;
                            }
                        }

                        if (corsair.getType().toString().toLowerCase().contains("Headset".toLowerCase()) && periferico.toLowerCase().contains(corsair.getModelName().toLowerCase())) {
                            if (!corsair.getType().toString().toLowerCase().contains("HeadsetStand".toLowerCase())) {
                                listaPerifericos.setPerifericos(new Corsair.HeadSet(corsair.getModelName(), CorsairSDK, corsair));
                                break;
                            }
                        }

                        if (corsair.getType().toString().toLowerCase().contains("HeadsetStand".toLowerCase()) && periferico.toLowerCase().contains(corsair.getModelName().toLowerCase())) {
                            listaPerifericos.setPerifericos(new Corsair.HeadsetStand(corsair.getModelName(), CorsairSDK, corsair));
                            break;
                        }
                        if (corsair.getType().toString().toLowerCase().contains("MouseMat".toLowerCase()) && periferico.toLowerCase().contains(corsair.getModelName().toLowerCase())) {
                            listaPerifericos.setPerifericos(new Corsair.MouseMat(corsair.getModelName(), CorsairSDK, corsair));
                            break;
                        }

                        if (corsair.getType().toString().toLowerCase().contains("CommanderPro".toLowerCase()) && periferico.toLowerCase().contains(corsair.getModelName().toLowerCase())) {
                            listaPerifericos.setPerifericos(new Corsair.CoolerControl(corsair.getModelName(), CorsairSDK, corsair));
                            break;
                        }

                        if (corsair.getType().toString().toLowerCase().contains("LightingNodePro".toLowerCase()) && periferico.toLowerCase().contains(corsair.getModelName().toLowerCase())) {
                            listaPerifericos.setPerifericos(new Corsair.LightingNode(corsair.getModelName(), CorsairSDK, corsair));
                            break;
                        }

                        if (corsair.getType().toString().toLowerCase().contains("Motherboard".toLowerCase()) && periferico.toLowerCase().contains(corsair.getModelName().toLowerCase())) {
                            listaPerifericos.setPerifericos(new Corsair.MotherBoard(corsair.getModelName(), CorsairSDK, corsair));
                            break;
                        }

                    }
                }
            }
        }
    }

    private void tirarDaListaPerifericos(String periferico) {

        for (int i = 0; i < listaPerifericos.getPerifericos().size(); i++) {
            if (listaPerifericos.getPerifericos().get(i).getNome().toLowerCase().contains(periferico.toLowerCase())) {
                listaPerifericos.getPerifericos().remove(i);
            }
        }

    }

    private void btnRemoverDaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverDaListaActionPerformed

        try {
            DefaultListModel<String> model = new DefaultListModel<>();
            for (int i = 0; i < jLPerifericos.getModel().getSize(); i++) {
                model.addElement(jLPerifericos.getModel().getElementAt(i));

            }
            jLPerifericos.setModel(model);
            model.addElement(jLSelecionados.getSelectedValue());
            tirarDaListaPerifericos(jLSelecionados.getSelectedValue());
            int selectedIndex = jLSelecionados.getSelectedIndex();
            String[] ListData = new String[jLSelecionados.getModel().getSize()];
            for (int i = 0; i < ListData.length; i++) {
                if (i != selectedIndex) {
                    ListData[i] = jLSelecionados.getModel().getElementAt(i);
                }
            }
            jLSelecionados.setListData(ListData);
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnRemoverDaListaActionPerformed

    private void tempCPUPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tempCPUPropertyChange
        switch (jCbXEfeitos.getSelectedItem().toString()) {
            case "Temperatura":
                preencherTemperaturas();
                break;
        }
    }//GEN-LAST:event_tempCPUPropertyChange

    private void tempGPUPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tempGPUPropertyChange
        switch (jCbXEfeitos.getSelectedItem().toString()) {
            case "Temperatura":
                preencherTemperaturas();
                break;
        }
    }//GEN-LAST:event_tempGPUPropertyChange

    private void alocarPerifericos(JLabel obj) {
        Point local = painelInternoImagens.getMousePosition();
        if (local != null) {
            int x = new Double(local.getX()).intValue() - obj.getWidth() / 2;
            int y = new Double(local.getY()).intValue() - obj.getHeight() / 2;
            if (x > 0 && y > 0 && x < painelInternoImagens.getWidth() - obj.getWidth() && y < painelInternoImagens.getHeight() - obj.getHeight()) {
                obj.setLocation(x, y);
            }
        }
    }

    private void somenteDigitos(java.awt.event.KeyEvent evt) {
        int numerais[] = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105};
        if (!ArrayUtils.contains(numerais, evt.getKeyCode())) {
            if (evt.getKeyCode() != 8 && evt.getKeyCode() != 127) {
                try {
                    Robot robot = new Robot();
                    robot.keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
                } catch (AWTException ex) {
                    Logger.getLogger(principal.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    private void tray() {
        this.dispose();
        trayIcon = new TrayIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ico.png")).getImage());
        trayIcon.setToolTip("RGB");
        final SystemTray tray = SystemTray.getSystemTray();
        final PopupMenu menu = new PopupMenu();
        MenuItem abrir = new MenuItem("Abrir");
        MenuItem exit = new MenuItem("Sair");
        menu.add(abrir);
        menu.addSeparator();
        menu.add(exit);

        trayIcon.addActionListener((ActionEvent e) -> {
            setVisible(true);
            tray.remove(trayIcon);
        });

        abrir.addActionListener((ActionEvent e) -> {
            setVisible(true);
            tray.remove(trayIcon);
        });

        exit.addActionListener((ActionEvent e) -> {
            pararEfeito();
            AsusAura.ReleaseControl();
            System.exit(0);
        });

        trayIcon.setPopupMenu(menu);
        try {
            tray.add(trayIcon);
        } catch (AWTException ex) {
            Logger.getLogger(principal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pararEfeito() {
        tempoPorVolta tempo = new tempoPorVolta(2000);
        tempo.calculo();
        tempo.calculo();
        if (efeito != null) {
            efeito.allDone = true;
            efeito = null;
        }
        tempo.calculo();
        try {
            listaPerifericos.getPerifericos().forEach(periferico -> {
                periferico.limparCorDispositivo();
            });
        } catch (Exception ex) {
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarCorSelecionada;
    private javax.swing.JButton btnAdicionarNaLista;
    private javax.swing.JButton btnAplicarEfeito;
    private javax.swing.JButton btnHide;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRemoverCorSelecionada;
    private javax.swing.JButton btnRemoverDaLista;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> jCbDispositivo;
    private javax.swing.JComboBox<String> jCbXEfeitos;
    private javax.swing.JColorChooser jColorPrincipal;
    private javax.swing.JList<String> jLPerifericos;
    private javax.swing.JList<String> jLSelecionados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcBSelecaoDeCores;
    private javax.swing.JComboBox<String> jcbMusica;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbMouse;
    private javax.swing.JLabel lbTeclado;
    private javax.swing.JLabel lbTemp1;
    private javax.swing.JLabel lbTemp2;
    private javax.swing.JLabel lbTemp3;
    private javax.swing.JLabel lbTemp4;
    private javax.swing.JPanel painelCores;
    private javax.swing.JPanel painelInternoImagens;
    private javax.swing.JPanel painelInternoMusica;
    private javax.swing.JPanel painelInternoPerifericos;
    private javax.swing.JPanel painelInternoSelecaoDeCores;
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