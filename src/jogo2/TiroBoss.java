package jogo2;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class TiroBoss {

    //icone do tiro do Boss 
    protected ImageIcon LaserBoss;
    //Imagem do tiro do Boss
    protected Image imgLaserBoss;
    //Posição X do tiro do Boss
    private int x;
    //Posição Y do Tiro do Boss
    private int y;
    //Variavel representante do limite Boss
    private int dy;
    //Variavel que determina se esta visivel
    private boolean visible;
    //Larfgura da imagem do tiro do Boss
    private int Largura;
    //Altura da imagem do tiro do Boss
    private int Altura;
    //Velocidade do tiro do Boss
    private static final int velocidade = 2;
    //Variavel auxiliar de limite aleatorio
    private Random ny;
    //Variavel limite aleatorio
    private int ly;

    public TiroBoss(int x, int y, int limite) {
        LaserBoss = new ImageIcon("img\\tiroBoss.png");
        imgLaserBoss = LaserBoss.getImage();
        this.x = x;
        this.y = y;
        Altura = imgLaserBoss.getHeight(LaserBoss.getImageObserver()) - 40;
        Largura = imgLaserBoss.getWidth(LaserBoss.getImageObserver()) - 40;
        visible = true;
        ny = new Random();
        ly = ny.nextInt(1500) + 1000;
        dy = limite;
    }

    //Movimentação do tiro do Boss
    public void Shoot1() {
        y += velocidade;
        x += velocidade;

    }

    //Movimentação do tiro do Boss 
    public void Shoot2() {
        y += velocidade;
        x -= velocidade;

    }

    //Retorna a posição X do tiro do Boss
    public int getX() {
        return x;
    }

    //Retorna a posição Y
    public int getY() {
        return y;
    }

    //Retorna a imagem do tiro do Boss
    public Image getTiro() {
        return imgLaserBoss;
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
