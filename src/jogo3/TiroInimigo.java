package jogo3;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class TiroInimigo {

    //icone do tireo inimigo 
    protected ImageIcon LaserInimigo;
    //Imagem do tiro inimigo
    private Image imgLaserInimigo;
    //Posição X do tiro inimigo
    private int x;
    //Posição Y do Tiro Inimigo
    private int y;
    //Variavel representante do limite Inimigo
    private int dy;
    //Variavel que determina se esta visivel
    private boolean visible;
    //Larfgura da imagem do tiro inimigo
    private int Largura;
    //Altura da imagem do tiro inimigo
    private int Altura;
    //Velocidade do tiro In inimigo
    private static final int velocidade = 2;
    //Variavel auxiliar de limite aleatorio
    private Random ny;
    //Variavel limite aleatorio
    private int ly;
    
    public TiroInimigo(int x, int y, int limite) {
        LaserInimigo = new ImageIcon("img\\fogo4.png");
        imgLaserInimigo = LaserInimigo.getImage();
        this.x = x;
        this.y = y;
        Altura = imgLaserInimigo.getHeight(LaserInimigo.getImageObserver()) - 40;
        Largura = imgLaserInimigo.getWidth(LaserInimigo.getImageObserver()) - 40;
        visible = true;
        ny = new Random();
        ly = ny.nextInt(1500) + 1000;
        dy = limite;
    }

    //Movimentação do tiro inimigo
    public void Shoot() {
        y += velocidade;
        if (y > 700) {
            visible = false;
        }
    }

    //Retorna a posição X do tiro Inimigo
    public int getX() {
        return x;
    }

    //Retorna a posição Y
    public int getY() {
        return y;
    }

    //Retorna a imagem do tiro inimigo
    public Image getTiro(){
        return imgLaserInimigo;
    }
    
    //Retorna se esta visivel
    public boolean getVisible() {
        return visible;
    }

    //Permite colocar a visibilidade
    public void setVisible(boolean v) {
        visible = v;
    }

    //Retorna a altura
    public int getALtura() {
        return Altura;
    }

    //Retorna a largura
    public int getLargura() {
        return Largura;
    }

}
