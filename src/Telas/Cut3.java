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
public class Cut3 extends JFrame implements ActionListener{
    
    private ImageIcon icon = new ImageIcon("img\\Nave4.png");
    private ImageIcon fundo = new ImageIcon("img\\custcene 3.png");
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
    
    public Cut3(){
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
        linha1.setText("Com o passar dos anos Hall sentiu que faltava algo");
        linha1.setBounds(80, 410, 470, 30);
        painel.add(linha1);

        linha2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha2.setForeground(new java.awt.Color(255, 255, 255));
        linha2.setText("e que nada estava o suficiente, seus pais passaram ");
        linha2.setBounds(80, 440, 450, 18);
        painel.add(linha2);

        linha3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha3.setForeground(new java.awt.Color(255, 255, 255));
        linha3.setText("a se preocupar pois viam que Hall era uma criança");
        linha3.setBounds(80, 460, 450, 30);
        painel.add(linha3);

        linha4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha4.setForeground(new java.awt.Color(255, 255, 255));
        linha4.setText("narcisista e gananciosa, essa escuridão só crescia ");
        linha4.setBounds(80, 490, 510, 18);
        painel.add(linha4);

        linha5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        linha5.setForeground(new java.awt.Color(255, 255, 255));
        linha5.setText("mais e mais dentro dele.");
        linha5.setBounds(80, 510, 250, 18);
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
        
        painel.setLayout(new BorderLayout());
    }
    
    public static void main(String[] agrs){
        new Cut3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == passarEsquerda){
            dispose();
            new Cut2_2();
        }
        
        if(e.getSource() == passarDireita){
            dispose();
            new Cut3_1();
        }
        
    }

public class Painel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fundo.getImage(), 0, 0, null);
    }

}
}
