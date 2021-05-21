package Telas;


import javax.swing.ImageIcon;

public class Tela_Inicio extends javax.swing.JFrame {

    private ImageIcon icon = new ImageIcon("img\\Nave4.png");
    private Tela_mapa mp;
    private Tela_configuracoes cnf;
    private Telainstru inst;
    private int cont = 2;
    private int cont1 = 2;
    private int cont2 = 2;

    public Tela_Inicio() {
        initComponents();
        setVisible(true);
        setSize(600, 630);
        setLocationRelativeTo(null);
        setTitle("Stars of Tomorrow");
        setIconImage(icon.getImage());
        setResizable(false);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        joga = new javax.swing.JLabel();
        sai = new javax.swing.JLabel();
        instruc = new javax.swing.JLabel();
        configura = new javax.swing.JLabel();
        jogar = new javax.swing.JButton();
        configur = new javax.swing.JButton();
        instru = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        Imagetelainicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        joga.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        joga.setText("Jogar");
        jPanel1.add(joga);
        joga.setBounds(280, 280, 70, 30);

        sai.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        sai.setText("Sair");
        jPanel1.add(sai);
        sai.setBounds(284, 460, 40, 30);

        instruc.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        instruc.setText("Instruções");
        jPanel1.add(instruc);
        instruc.setBounds(260, 400, 130, 30);

        configura.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        configura.setText("Configurações");
        jPanel1.add(configura);
        configura.setBounds(240, 340, 150, 30);

        jogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); // NOI18N
        jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarActionPerformed(evt);
            }
        });
        jPanel1.add(jogar);
        jogar.setBounds(230, 280, 150, 30);

        configur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); // NOI18N
        configur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configurActionPerformed(evt);
            }
        });
        jPanel1.add(configur);
        configur.setBounds(230, 340, 150, 30);

        instru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); // NOI18N
        instru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruActionPerformed(evt);
            }
        });
        jPanel1.add(instru);
        instru.setBounds(230, 400, 150, 30);

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel1.add(sair);
        sair.setBounds(230, 460, 150, 30);

        Imagetelainicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Tela inicial em pixel 600x600-1.png.png"))); // NOI18N
        jPanel1.add(Imagetelainicial);
        Imagetelainicial.setBounds(0, 0, 600, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jogarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();

        /*if (cont > 1) {
            mp = new Tela_mapa();
            cont -= 2;
        }
        mp.setVisible(true);
        */
        new Cut1();
       
    }

    private void instruActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();

        if (cont1 > 1) {
            inst = new Telainstru();
            cont1 -= 2;
        }
        inst.setVisible(true);
    }

    private void configurActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();

        if (cont2 > 1) {
            cnf = new Tela_configuracoes();
            cont2 -= 2;
        }
        cnf.setVisible(true);
    }

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicio().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel Imagetelainicial;
    private javax.swing.JButton configur;
    private javax.swing.JLabel configura;
    private javax.swing.JButton instru;
    private javax.swing.JLabel instruc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel joga;
    private javax.swing.JButton jogar;
    private javax.swing.JLabel sai;
    private javax.swing.JButton sair;

    private void setIconImage(ImageIcon icon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
