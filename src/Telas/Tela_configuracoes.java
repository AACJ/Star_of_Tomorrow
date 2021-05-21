package Telas;


import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import jogo.Game;

public class Tela_configuracoes extends javax.swing.JFrame {

    private boolean condicao;
    private Tela_Inicio tn;
    private Game gm;
    private int cont = 2;
    private ImageIcon img = new ImageIcon("img\\Nave4.png");
    //private Som s = new Som();
    
    public Tela_configuracoes() {
        initComponents();
        setVisible(true);
        setSize(600,630);
        setLocationRelativeTo(null);
        setTitle("Stars of Tomorrow");
        condicao = false;
        setIconImage(img.getImage());
    }
    
    public  void tela_configuracoes(boolean v) {
        
        condicao = v;

    }


  
    @SuppressWarnings("unchecked")
      
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Configuracoes-1.png.png")));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 30, 360, 80);

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 13)); 
        jLabel3.setText("VOLTAR");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 530, 140, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Teclado com seta-1.png (3).png"))); 
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 230, 140, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Controle-1.png (3).png"))); 
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 140, 210, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Teclado two-1.png (2).png")));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 370, 140, 110);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Musica-1.png.png")));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 130, 210, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Caixinha de musica ativada -1.png (1).png"))); 
        jPanel1.add(jLabel8);
        jLabel8.setBounds(350, 220, 80, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Caixinha de som desativada-1.png (2).png"))); 
        jPanel1.add(jLabel9);
        jLabel9.setBounds(350, 410, 90, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Caixinha de som ativo-1.png.png")));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(460, 410, 80, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/caixinha de som desativada-1.png (1).png"))); 
        jPanel1.add(jLabel11);
        jLabel11.setBounds(460, 230, 80, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/Som-1.png.png"))); 
        jPanel1.add(jLabel12);
        jLabel12.setBounds(350, 340, 150, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/BOTAO 7.png"))); 
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }

        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 530, 150, 30);
        
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setBackground(new java.awt.Color(0, 0, 102));
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseReleased(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(170, 440, 20, 23);
        
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setBackground(new java.awt.Color(0, 51, 102));
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseReleased(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(170, 309, 20, 21);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseReleased(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(430, 250, 20, 21);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseReleased(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(540, 250, 20, 21);

        buttonGroup3.add(jRadioButton5);
        jRadioButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton5MouseReleased(evt);
            }
        });
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(430, 430, 20, 21);

        jRadioButton6.setText("jRadioButton6");
        buttonGroup3.add(jRadioButton6);
        jRadioButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton6MouseReleased(evt);
            }
        });
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(540, 430, 20, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/configuracao 01 600x600.jpg")));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 600);
        setResizable(false);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 601, 600);

        pack();
    }// </editor-fold>                        

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) { 
        
      /*  if(condicao){
            
            setVisible(false);
            gm.setVisible(true);
            
        }else{
            
    	setVisible(false);
        
        tn.setVisible(true);
        
        }*/
      setVisible(false);
      new Tela_Inicio();
      
    }  
    
     private void jButton1MouseReleased(MouseEvent evt) {
        
     }

    //Teclado de setas
    private void jRadioButton1MousePressed(java.awt.event.MouseEvent evt) {                                           
       
    }      

    private void jRadioButton1MouseReleased(java.awt.event.MouseEvent evt) {                                            
        
    }                                           

    private void jRadioButton2MousePressed(java.awt.event.MouseEvent evt) {  
    	
    }                                          
 
    //teclado W,A,S,D
    private void jRadioButton2MouseReleased(java.awt.event.MouseEvent evt) {                                            
       
    }                                           

    //Música Ligada
    private void jRadioButton3MousePressed(java.awt.event.MouseEvent evt) {                                           
       
    }                                          

    private void jRadioButton3MouseReleased(java.awt.event.MouseEvent evt) {                                            
       
    }                                           

    //Música Desligada
    private void jRadioButton4MousePressed(java.awt.event.MouseEvent evt) {                                           
        
    }                                          

    private void jRadioButton4MouseReleased(java.awt.event.MouseEvent evt) {                                            
       
    }                                           

    //Som Liogado
    private void jRadioButton5MousePressed(java.awt.event.MouseEvent evt) {                                           
      
    }                                          

    private void jRadioButton5MouseReleased(java.awt.event.MouseEvent evt) {                                            
       
    }                                           

    //Som desligado
    private void jRadioButton6MousePressed(java.awt.event.MouseEvent evt) {                                           
        
    }                                          

    private void jRadioButton6MouseReleased(java.awt.event.MouseEvent evt) {                                            
      
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
            java.util.logging.Logger.getLogger(Tela_configuracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_configuracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_configuracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_configuracoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_configuracoes().setVisible(true);
            }
        });
    }

   
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
        
}
