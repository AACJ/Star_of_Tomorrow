package jogo2;

import Telas.Tela_game_over4;
import Telas.Tela_vencer4;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Game4 extends JFrame {

    private ImageIcon img = new ImageIcon("img\\Nave4.png");
    //Variavel que corresponde a fase
    private Fase4 fase4 = new Fase4();

    public Game4() {

        
        setTitle("Stars of Tomorrow");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        fase4.setVisible(true);
        setVisible(true);
        setFocusable(true);
        setIconImage(img.getImage());
        add(fase4);
        addKeyListener(new Teclado());
    }

    public static void main(String[] agrs) {
        Game4 jogo = new Game4();
    }

    //Da a possibilidade da movimentação da Nave pelo teclado
    private class Teclado extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            fase4.nave.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub
            fase4.nave.keyReleased(e);
        }

    }

    public class Fase4 extends JPanel implements ActionListener {

        //Icone da tela
        private ImageIcon Fundo;
        //Image da tela
        private Image imgFundo;
        //Variave que controla o tempo de repintagem
        private Timer tempo;
        //Variavel da classe nave
        protected Nave nave;
        //Variavel que corresponde a lista de inimigos
        private List<Inimigo> inimigo;
        //Variavel que verifica a colisão do tiro da nave com o inimigo
        private Colisao colisaoTiro;
        //Variavel que verifica a colisão o tiro inimigo com a Nave
        private Colisao colisaoInimigo;
        //Variaveis de contagem de geração de inimigos
        private int cont = 0;//conta o numrero de inimigos
        private int cont2 = 0;//conta o numero de inimigos derrotados
        private int cont3 = 0;// conta o numero de tiros no boss
        private int cont4 = 0;//Conta a vida
        //Variaveis auxiliares de confirmação de colisao
        private boolean CT;//Colisao Tiro da nave com os inimigos
        private boolean CI;//Colisao Tiro do Inimigo com a Nave
        private boolean CTI;//Colisao do tiro do Inimigo com o Tiro da nave
        //Variavel da vida da Nave
        private List<Vida> vida;
        private JLabel ondas = new JLabel("Ondas:");
        private JLabel numOndas = new JLabel();
        protected boolean emJogo;

        public Fase4() {
            setFocusable(true);
            setDoubleBuffered(true);
            Fundo = new ImageIcon("img\\Marte.jpg");
            imgFundo = Fundo.getImage();
            nave = new Nave();
            inimigo = new ArrayList<Inimigo>();
            vida = new ArrayList<Vida>();
            tempo = new Timer(5, this);
            requestFocusInWindow();
            tempo.start();
        }

        //Desenha os Componentes
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            //Desenha o Fundo		
            g.drawImage(imgFundo, 0, 0, null);

            //Desenha a Nave
            g.drawImage(nave.imgNave, nave.getX(), nave.getY(), this);

            //Desenha o Tiro da Nave
            //Nave - Declaração e implementação da lista de tiros
            List<Tiro> tiro = nave.getLaser();

            //Nave - Desenhano os tiros
            for (int i = 0; i < tiro.size(); i++) {
                Tiro t = (Tiro) tiro.get(i);
                g.drawImage(t.imgLaser, t.getX(), t.getY(), this);
            }

            //Desenha os Inimigos
            for (int i = 0; i < inimigo.size(); i++) {
                Inimigo ini = (Inimigo) inimigo.get(i);
                g.drawImage(ini.imgInimigo, ini.getX(), ini.getY(), this);
            }

            //Desenha Tiro Inimigo
            for (int i = 0; i < inimigo.size(); i++) {
                List<TiroInimigo> tiroInimigo = inimigo.get(i).tiro();

                for (int j = 0; j < tiroInimigo.size(); j++) {
                    TiroInimigo tiroIni = (TiroInimigo) tiroInimigo.get(j);
                    g.drawImage(tiroIni.getTiro(), tiroIni.getX(), tiroIni.getY(), this);
                }
            }

            //Desnha a vida
            if (vida.get(0).getVisible()) {
                g.drawImage(vida.get(0).getVida(), vida.get(0).getX(), vida.get(0).getY(), this);
            }
            if (vida.get(1).getVisible()) {
                g.drawImage(vida.get(1).getVida(), vida.get(1).getX(), vida.get(1).getY(), this);
            }
            if (vida.get(2).getVisible()) {
                g.drawImage(vida.get(2).getVida(), vida.get(2).getX(), vida.get(2).getY(), this);
            }
            if (vida.get(3).getVisible()) {
                g.drawImage(vida.get(3).getVida(), vida.get(3).getX(), vida.get(3).getY(), this);
            }

            g.setFont(new Font("Serif", Font.ROMAN_BASELINE, 15));
            g.setColor(Color.WHITE);
            if (cont2 < 5) {
                g.drawString("ONDAS: " + (cont2 + 1) + " / 5", 10, 20);
            }
            if (inimigo.size() == 0) {
                Vencer();
                dispose();

            }

            if (vida.get(3).getVisible() == false) {
                Vida();
                dispose();
            }
            
            g.dispose();
        }

        //Da ação aos Componentes
        @Override
        public void actionPerformed(ActionEvent arg0) {

            if (cont2 < 4) {
                java.util.Timer temp = new java.util.Timer();
                TimerTask tarefa = new TimerTask() {
                    //Realiza uma tarefa em determinao espaço e tempo
                    @Override
                    public void run() {
                        while (cont < 10) {
                            //Gera Inimigos
                            inimigo.add(new Inimigo());
                            //Gera Tiros dos inimigos
                            inimigo.get(cont).atira();

                            cont++;
                        }
                    }
                };

                temp.scheduleAtFixedRate(tarefa, 5, 1000000000);

            }

            //Movimentação do tiro da Nave
            //Controlado pelo mouse, toda vez que o usuario aperta na tecla 
            //SPACE o movimento do tiro será realizado
            List<Tiro> tiro = nave.getLaser();
            for (int i = 0; i < tiro.size(); i++) {
                Tiro t = (Tiro) tiro.get(i);
                //Condição para realizar o movimento do tiro, se o tiro estiver visivel será realizado
                if (t.getVisible()) {
                    t.Shoot();
                } else {
                    //Caso não estiver visivel (for falso) será removido
                    tiro.remove(i);
                }
            }

            //Movimentação dos inimigos
            for (int i = 0; i < inimigo.size(); i++) {
                Inimigo ini = (Inimigo) inimigo.get(i);
                if (ini.getVisible()) {

                    //Move O inimgo para baixo
                    ini.moveDown();

                } else {
                    inimigo.remove(i);
                    //tiroInimigo.remove(i);

                }
            }

            //Movimentação do tiro do inimigo
            for (int j = 0; j < inimigo.size(); j++) {
                List<TiroInimigo> tiroInimigo = inimigo.get(j).tiro();
                for (int i = 0; i < tiroInimigo.size(); i++) {
                    if (tiroInimigo.get(i).getVisible()) {
                        tiroInimigo.get(i).Shoot();

                    } else {
                        tiroInimigo.remove(i);
                    }
                }
            }

            //Colisão do tiro das naves com as naves inimigas
            //Ambos os 'For' pecorrem pelos ArrayList de tiro e inimigo respectivamente
            for (int k = 0; k < tiro.size(); k++) {
                for (int j = 0; j < inimigo.size(); j++) {
                    //Variaveis auxiliares
                    Tiro t = (Tiro) tiro.get(k);
                    Inimigo in = (Inimigo) inimigo.get(j);
                    CT = Colisao.colidir(t.getX(), t.getY(), t.getLargura(), t.getALtura(), in.getX(), in.getY(), in.getLargura(), in.getAltura());

                    //Consição de colisão, utilizando a classe Colisão
                    if (CT == true) {
                        tiro.get(k).setVisible(false);
                        inimigo.get(j).tirarVida();
                    }
                    if (inimigo.get(j).getContVida() > 1) {
                        //Deixa o tiro e o inimigo que colidiram não visiveis e falsos
                        //tiro.get(k).setVisible(false);
                        //inimigo.get(j).setVisible(false);

                        inimigo.get(j).setVisible(false);
                       
                        //Condição para que toda vez que os inimigos cheguem em 1 gerem mais inimigos
                    }
                    if (inimigo.size() == 1) {
                        cont = 0;
                        cont2++;
                    }

                }
            }

            //Colisao do tiro do inimigo com a nave
            for (int i = 0; i < inimigo.size(); i++) {
                List<TiroInimigo> tiroInimigo = inimigo.get(i).tiro();
                for (int j = 0; j < tiroInimigo.size(); j++) {
                    TiroInimigo t = (TiroInimigo) tiroInimigo.get(j);
                    CI = Colisao.colidir(t.getX(), t.getY(), t.getLargura(), t.getALtura(), nave.getX(), nave.getY(), nave.getLargura(), nave.getAltura());
                    if (CI == true) {
                        tiroInimigo.get(j).setVisible(false);
                        vida.get(cont4).setVisible(false);
                        cont4++;
                       
                    }
                }
            }

            //Colisao do tiro do Inimigo com o tiro da nave
            for (int i = 0; i < inimigo.size(); i++) {
                List<TiroInimigo> tiroInimigo = inimigo.get(i).tiro();
                for (int j = 0; j < tiroInimigo.size(); j++) {
                    for (int k = 0; k < tiro.size(); k++) {
                        TiroInimigo ti = (TiroInimigo) tiroInimigo.get(j);
                        Tiro t = (Tiro) tiro.get(k);
                        CTI = Colisao.colidir(t.getX(), t.getY(), t.getLargura(), t.getALtura(), ti.getX(), ti.getY(), ti.getLargura(), ti.getALtura());
                        if (CTI == true) {
                            tiro.get(k).setVisible(false);
                            tiroInimigo.get(j).setVisible(false);
                           

                        }
                    }
                }
            }

            vida.add(new Vida(120, 500));
            vida.add(new Vida(80, 500));
            vida.add(new Vida(40, 500));
            vida.add(new Vida(0, 500));

            //Da ação aos movimentos da Nave, controle da Nave pelo teclado
            nave.movimentar();

            //Movimeta o Boss para Baixo
            repaint();

        }

        private void Vida() {
            emJogo = false;
            setVisible(false);
            new Tela_game_over4();
        }

        private void Vencer() {
            emJogo = false;
            setVisible(false);
            new Tela_vencer4();
        }
    }

}
