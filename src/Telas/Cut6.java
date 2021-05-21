/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
/**
 *
 * @author CONTROLLER
 */
public class Cut6 extends JFrame implements ActionListener{
    
    private ImageIcon icon = new ImageIcon("img\\Nave4.png");
    private ImageIcon fundo = new ImageIcon("img\\custcene 6.png");
    private ImageIcon direita = new ImageIcon("img\\direita.png");
    private ImageIcon esquerda = new ImageIcon("img\\esquerda.png");
    private JLabel cut1 = new JLabel();
    private JLabel linha1 = new JLabel();
    private JLabel linha2 = new JLabel();
    private JLabel linha3 = new JLabel();
    private JLabel linha4 = new JLabel();
    private JLabel linha5 = new JLabel();
    private JLabel linha6 = new JLabel();
    private JLabel linha7 = new JLabel();
    private JButton passarDireita = new JButton();
    private JButton passarEsquerda = new JButton();
    
    public Cut6(){
        setVisible(true);
        setSize(600, 630);
        setLocationRelativeTo(null);
        setTitle("Stars of Tomorrow");
        setIconImage(icon.getImage());
        setResizable(false);
        Painel painel = new Painel();
        add(painel);
    
        linha1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha1.setForeground(new java.awt.Color(255, 255, 255));
        linha1.setText("Hydris era o planeta de Jace, um jovem rapaz que ");
        linha1.setBounds(80, 410, 440, 18);
        painel.add(linha1);

        linha2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha2.setForeground(new java.awt.Color(255, 255, 255));
        linha2.setText("antes do Sr.Galactus extinguir seu planeta e Vulpecu - ");
        linha2.setBounds(80, 430, 490, 20);
        painel.add(linha2);

        linha3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha3.setForeground(new java.awt.Color(255, 255, 255));
        linha3.setText("la, embarcou em uma missão intergaláctica com o ");
        linha3.setToolTipText("");
        linha3.setBounds(80, 450, 470, 18);
        painel.add(linha3);

        linha4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha4.setForeground(new java.awt.Color(255, 255, 255));
        linha4.setText("seu parceiro Ross do planeta Vulpecula. Jace e Ross");
        linha4.setBounds(80, 470, 447, 18);
        painel.add(linha4);

        linha5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha5.setForeground(new java.awt.Color(255, 255, 255));
        linha5.setText("ficaram devastados com o acontecimento e partiram");
        linha5.setBounds(80, 490, 470, 20);
        painel.add(linha5);

        linha6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha6.setForeground(new java.awt.Color(255, 255, 255));
        linha6.setText("em busca de vingar a morte de seus familiares e");
        linha6.setBounds(80, 510, 500, 18);
        painel.add(linha6);

        linha7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha7.setForeground(new java.awt.Color(255, 255, 255));
        linha7.setText("amigos.");
        linha7.setBounds(80, 530, 120, 20);
        painel.add(linha7);

        passarDireita.setBounds(540, 500, 64, 64);
        passarDireita.setVisible(true);
        passarDireita.setIcon(direita);
        passarDireita.setBorderPainted(false);
        passarDireita.setOpaque(false);
        passarDireita.setContentAreaFilled(false);
        passarDireita.addActionListener(this);
        painel.add(passarDireita);
        
        passarEsquerda.setBounds(0, 500, 64, 64);
        passarEsquerda.setVisible(true);
        passarEsquerda.setIcon(esquerda);
        passarEsquerda.setBorderPainted(false);
        passarEsquerda.setOpaque(false);
        passarEsquerda.setContentAreaFilled(false);
        passarEsquerda.addActionListener(this);
        painel.add(passarEsquerda);
        
        painel.setLayout(new BorderLayout());
    }
    
    public static void main(String[] agrs){
        new Cut6();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == passarEsquerda){
            dispose();
            new Cut5();
        }
        
        if(e.getSource() == passarDireita){
            dispose();
            new Tela_mapa();
        }
        
    }

public class Painel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fundo.getImage(), 0, 0, null);
    }

}
}
