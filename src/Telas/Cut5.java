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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
/**
 *
 * @author CONTROLLER
 */
public class Cut5 extends JFrame implements ActionListener{
    
    private ImageIcon icon = new ImageIcon("img\\Nave4.png");
    private ImageIcon fundo = new ImageIcon("img\\custcene 5.gif");
    private ImageIcon direita = new ImageIcon("img\\direita.png");
    private ImageIcon esquerda = new ImageIcon("img\\esquerda.png");
    private JLabel cut1 = new JLabel();
    private JLabel linha1 = new JLabel();
    private JLabel linha2 = new JLabel();
    private JLabel linha3 = new JLabel();
    private JLabel linha4 = new JLabel();
    private JLabel linha5 = new JLabel();
    private JButton passarDireita = new JButton();
    private JButton passarEsquerda = new JButton();
    
    public Cut5(){
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
        linha1.setText("O rei Hall conseguiu expandir seu domínio, porém ");
        linha1.setBounds(90, 410, 470, 18);
        painel.add(linha1);

        linha2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha2.setForeground(new java.awt.Color(255, 255, 255));
        linha2.setText("eliminando dois planetas Hydris e Vulpecula pois o ");
        linha2.setBounds(90, 440, 550, 18);
        painel.add(linha2);

        linha3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha3.setForeground(new java.awt.Color(255, 255, 255));
        linha3.setText("rei acreditava que às espécies que habitam os pla - ");
        linha3.setBounds(90, 468, 510, 20);
        painel.add(linha3);

        linha4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha4.setForeground(new java.awt.Color(255, 255, 255));
        linha4.setText("netas  eram execrável e por isso eliminando elas,");
        linha4.setBounds(90, 490, 540, 30);
        painel.add(linha4);

        linha5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha5.setForeground(new java.awt.Color(255, 255, 255));
        linha5.setText("Hall passou a ser conhecido por Sr.Galactus. ");
        linha5.setBounds(90, 520, 430, 18);
        painel.add(linha5);
        
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
        
        cut1.setBounds(0, 0, 600, 630);
        cut1.setVisible(true);
        cut1.setIcon(fundo);
        painel.add(cut1);
        
        painel.setLayout(new BorderLayout());
    }
    
    public static void main(String[] agrs){
        new Cut5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == passarEsquerda){
            dispose();
            new Cut4();
        }
        
        if(e.getSource() == passarDireita){
            dispose();
            new Cut6();
        }
        
    }

public class Painel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fundo.getImage(), 0, 0, null);
    }

}
}
