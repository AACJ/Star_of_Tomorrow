
package Telas;

import javax.swing.ImageIcon;
import jogo.Game2;
import jogo.Game3;

public class Tela_game_over3 extends javax.swing.JFrame {

    private ImageIcon icon = new ImageIcon("img\\Nave4.png");
    private Tela_mapa mp;
    
    public Tela_game_over3() {
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
        recomeca = new javax.swing.JButton();
        sairmapa = new javax.swing.JButton();
        recomecar = new javax.swing.JLabel();
        saimapa = new javax.swing.JLabel();
        tela_game_over = new javax.swing.JLabel();
        mercurio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        
        recomecar.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        recomecar.setText("Tentar novamente");
        jPanel1.add(recomecar);
        recomecar.setBounds(70, 480, 140, 70);
        
        saimapa.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        saimapa.setText("Sair para mapa");
        jPanel1.add(saimapa);
        saimapa.setBounds(380, 504, 140, 20);

        recomeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); // NOI18N
        recomeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomecaActionPerformed(evt);
            }
        });
        jPanel1.add(recomeca);
        recomeca.setBounds(60, 500, 150, 30);

        sairmapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); // NOI18N
        sairmapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairmapaActionPerformed(evt);
            }
        });
        jPanel1.add(sairmapa);
        sairmapa.setBounds(360, 500, 150, 30);


        tela_game_over.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Ross GAME OVER 600x600.gif"))); // NOI18N
        jPanel1.add(tela_game_over);
        tela_game_over.setBounds(0, 0, 600, 600);

        mercurio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Terra.jpg"))); // NOI18N
        jPanel1.add(mercurio);
        mercurio.setBounds(0, 0, 600, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void sairmapaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        mp = new Tela_mapa();
        mp.desbloqueioVenus();
        mp.desbloqueioTerra();
        dispose();
         
    }                                        

    private void recomecaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new Game3();
        dispose();
        
       
    }                                        

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tela_game_over3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_game_over3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_game_over3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_game_over3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_game_over3().setVisible(true);
            }
        });
    }

                      
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mercurio;
    private javax.swing.JButton recomeca;
    private javax.swing.JLabel recomecar;
    private javax.swing.JLabel saimapa;
    private javax.swing.JButton sairmapa;
    private javax.swing.JLabel tela_game_over;
               
}
