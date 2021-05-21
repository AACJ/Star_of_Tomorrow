package jogo;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Tiro {

    //Variavel do icone do tiro
    protected ImageIcon Laser;
    //variavel da image do tiro
    protected Image imgLaser;
    //Variavel da imagem do tiro inimigo
    protected ImageIcon LaserInimigo;
    //Variavel da imagem do tiro inimigo
    protected Image imgLaserInimigo;
    //Posição X do tiro
    private int x;
    //Posição Y do tiro
    private int y;
    //Variavel que determina se o tiro esta visivel
    private boolean visible;
    //Largura da imagem do tiro
    private int Largura;
    //Altura da imegem do tiro
    private int Altura;
    //Velocidade de movimentação do tiro
    private static final int velocidade = 2;

    public Tiro(int x, int y) {
        Laser = new ImageIcon("img\\fogo.png");
        imgLaser = Laser.getImage();
        LaserInimigo = new ImageIcon("img\\fogoIni.png");
        imgLaserInimigo = LaserInimigo.getImage();
        this.x = x;
        this.y = y;
        Altura = imgLaser.getHeight(Laser.getImageObserver());
        Largura = imgLaser.getWidth(Laser.getImageObserver());
        visible = true;
    }

    //Movimentação do tiro na Fase1, com limite de visibilidade
    public void Shoot() {
        y -= velocidade;

        if (y < -50) {
            visible = false;
        }
    }

    //Movimentação do tiro na Fase1, com limite de visibilidade
    public void ShootInimigo() {

        y += velocidade;

        if (y > 490) {
            visible = false;
        }
    }

    //Retorna a posição X do tiro
    public int getX() {
        return x;
    }

    //Retorna a posição Y do tiro
    public int getY() {
        return y;
    }

    //retorna se o tiro esta visivel
    public boolean getVisible() {
        return visible;
    }

    //Permite dizer se esta visivel
    public void setVisible(boolean v) {
        visible = v;
    }

    //retorna a altura da imagem do tiro
    public int getALtura() {
        return Altura;
    }

    //retorna a largura da iamgem o tiro
    public int getLargura() {
        return Largura;
    }

}
