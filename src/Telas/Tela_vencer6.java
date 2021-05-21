
package Telas;

import javax.swing.ImageIcon;
import jogo.Game2;
import jogo.Game3;
import jogo2.Game4;
import jogo2.Game5;
import jogo3.Game6;
import jogo3.Game7;

public class Tela_vencer6 extends javax.swing.JFrame {
    
    private ImageIcon icon = new ImageIcon("img\\Nave4.png");
     private Tela_mapa mp;

    public Tela_vencer6() {
        initComponents();
        setVisible(true);
        setSize(600, 630);
        setLocationRelativeTo(null);
        setTitle("Stars of Tomorrow");
        setIconImage(icon.getImage());
        setResizable(false);
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        proximonivel = new javax.swing.JLabel();
        mapa = new javax.swing.JLabel();
        recomeca = new javax.swing.JLabel();
        recomecar = new javax.swing.JButton();
        smapa = new javax.swing.JButton();
        pNivel = new javax.swing.JButton();
        tela_vencer = new javax.swing.JLabel();
        mercurio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        proximonivel.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        proximonivel.setText("Próximo Nível");
        jPanel1.add(proximonivel);
        proximonivel.setBounds(440, 505, 120, 20);

        mapa.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        mapa.setText("Mapa");
        jPanel1.add(mapa);
        mapa.setBounds(280, 505, 70, 20);

        recomeca.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        recomeca.setText("Recomeçar");
        jPanel1.add(recomeca);
        recomeca.setBounds(70, 505, 90, 20);

        recomecar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); // NOI18N
        recomecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomecarActionPerformed(evt);
            }
        });
        jPanel1.add(recomecar);
        recomecar.setBounds(40, 500, 150, 30);

        smapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); // NOI18N
        smapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smapaActionPerformed(evt);
            }
        });
        jPanel1.add(smapa);
        smapa.setBounds(230, 500, 150, 30);

        pNivel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); // NOI18N
        pNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNivelActionPerformed(evt);
            }
        });
        jPanel1.add(pNivel);
        pNivel.setBounds(420, 500, 150, 30);

        tela_vencer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/TELA VENCEU (1).gif"))); // NOI18N
        jPanel1.add(tela_vencer);
        tela_vencer.setBounds(0, 0, 600, 600);

        mercurio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Saturno.jpg"))); // NOI18N
        jPanel1.add(mercurio);
        mercurio.setBounds(0, 0, 600, 600);

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

    private void smapaActionPerformed(java.awt.event.ActionEvent evt) {                                      
       mp = new Tela_mapa();
        mp.desbloqueioVenus();
        mp.desbloqueioTerra();
        mp.desbloqueioMarte();
        mp.desbloqueioJupiter();
        mp.desbloqueioSaturno();
        mp.desbloqueioUrano();
        dispose();
              
    }                                     

    private void pNivelActionPerformed(java.awt.event.ActionEvent evt) {                                       
        new Game7();
        /*mp.desbloqueioVenus();
        mp.desbloqueioTerra();
        mp.desbloqueioMarte();
        mp.desbloqueioJupiter();
        mp.desbloqueioSaturno();
        mp.desbloqueioUrano();*/
        dispose();
    }                                      

    private void recomecarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        mp.desbloqueioVenus();
        mp.desbloqueioTerra();
        mp.desbloqueioMarte();
        mp.desbloqueioJupiter();
        mp.desbloqueioSaturno();
        mp.desbloqueioUrano();
        new Game6();
        dispose();
      
    }                                         

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_vencer6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_vencer6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_vencer6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_vencer6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_vencer6().setVisible(true);
            }
        });
    }

                  
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mapa;
    private javax.swing.JLabel mercurio;
    private javax.swing.JButton pNivel;
    private javax.swing.JLabel proximonivel;
    private javax.swing.JLabel recomeca;
    private javax.swing.JButton recomecar;
    private javax.swing.JButton smapa;
    private javax.swing.JLabel tela_vencer;
                 
}
