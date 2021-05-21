package jogo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Nave {

    
    //Variavel da lista de tiros
    private List<Tiro> laser;
    //variavel do icone da Nave
    private ImageIcon Nave;
    //Variavel da Image da nave
    protected Image imgNave;
    //Posição X da nave
    private int x;
    //Posição Y da nave
    private int y;
    //Velocidade da posição X
    private int dx;
    //Velocidade da posição Y
    private int dy;
    //Largura da imagem da Nave
    private int largura;
    //Altura da imegem da Nave 
    private int altura;

    public Nave() {
        Nave = new ImageIcon("img\\Nave1.png");
        imgNave = Nave.getImage();
        this.x = 260;
        this.y = 470;
        largura = imgNave.getWidth(Nave.getImageObserver());
        altura = imgNave.getHeight(Nave.getImageObserver());
        laser = new ArrayList<Tiro>();
    }

    //Movimentação da nave, somasse as posições as velocidades correspondentes
    public void movimentar() {
        x += dx;
        y += dy;

        //Limite para ir para baixo
        if (y > 480) {
            this.y = 480;
        }

        //Limite para ir para cima
        if (y < 290) {
            this.y = 290;
        }

        //Limite para ir para direita
        if (x > 520) {
            this.x = 520;
        }

        //Limite para ir para esquerda
        if (x < -20) {
            this.x = -20;
        }
    }

    //Retorna a lista de tiros
    public List<Tiro> getLaser() {
        return laser;
    }

    //Implementa um tiro a lista e permite sua movimentação na tela apartir da classe Fase1
    public void atirar() {
        laser.add(new Tiro(x + 15, y - 20));
       
    }

    //Ações ao pressionar as determinadas teclas do teclado
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

        int tecla = e.getKeyCode();

        //Move para Direitra
        if (tecla == e.VK_RIGHT) {
            dx = 1;
        }

        //Move para Esquerda
        if (tecla == e.VK_LEFT) {
            dx = -1;
        }

        //Move para Cima
        if (tecla == e.VK_UP) {
            dy = -1;
        }

        //Move para Baixo
        if (tecla == e.VK_DOWN) {
            dy = 1;
        }

        //Atira
        if (tecla == e.VK_SPACE) {
            atirar();
        }
        
    }

    //Ações ao parar de presionar a tela
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

        int tecla = e.getKeyCode();

        //Para de ir para Direita
        if (tecla == e.VK_RIGHT) {
            dx = 0;
        }

        //Para de ir para esquerda
        if (tecla == e.VK_LEFT) {
            dx = 0;
        }

        //Para de ir para cima
        if (tecla == e.VK_UP) {
            dy = 0;
        }

        //Para de ir para baixo
        if (tecla == e.VK_DOWN) {
            dy = 0;
        }
         
    }

    //Retorna X
    public int getX() {
        return x;
    }

    //Retorna Y
    public int getY() {
        return y;
    }

    //Retorna a Largura da Nave
    public int getLargura() {
        return largura;
    }

    //Retorna a Altura a Nave
    public int getAltura() {
        return altura;
    }
}
