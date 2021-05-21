package Telas;


import jogo.Game;


public class Tela_pause extends javax.swing.JPanel {
    
    private Tela_configuracoes cnf;
    private Game gm;

    public Tela_pause() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        configuracao = new javax.swing.JLabel();
        retorna_ao_jogo = new javax.swing.JLabel();
        sair_mapa = new javax.swing.JLabel();
        imagem_pause = new javax.swing.JLabel();
        configuracoes = new javax.swing.JButton();
        retornar = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        setLayout(null);

        configuracao.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        configuracao.setText("Configurações");
        add(configuracao);
        configuracao.setBounds(260, 254, 110, 20);

        retorna_ao_jogo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        retorna_ao_jogo.setText("Retornar ao jogo");
        add(retorna_ao_jogo);
        retorna_ao_jogo.setBounds(250, 300, 120, 20);

        sair_mapa.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        sair_mapa.setText("Sair para o mapa");
        add(sair_mapa);
        sair_mapa.setBounds(250, 350, 120, 14);

        imagem_pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Tela de pause-1.png (1).png"))); // NOI18N
        add(imagem_pause);
        imagem_pause.setBounds(50, 50, 500, 490);

        configuracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracoesActionPerformed(evt);
            }
        });
        add(configuracoes);
        configuracoes.setBounds(230, 250, 150, 20);

        retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarActionPerformed(evt);
            }
        });
        add(retornar);
        retornar.setBounds(230, 300, 150, 20);

        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        add(sair);
        sair.setBounds(230, 350, 150, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void configuracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracoesActionPerformed
        gm.setVisible(false);
       
        cnf.tela_configuracoes(true);
        cnf.setVisible(true);
        
    }//GEN-LAST:event_configuracoesActionPerformed

    private void retornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarActionPerformed
     
    }//GEN-LAST:event_retornarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
       
    }//GEN-LAST:event_sairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel configuracao;
    private javax.swing.JButton configuracoes;
    private javax.swing.JLabel imagem_pause;
    private javax.swing.JLabel retorna_ao_jogo;
    private javax.swing.JButton retornar;
    private javax.swing.JButton sair;
    private javax.swing.JLabel sair_mapa;
    // End of variables declaration//GEN-END:variables
}
