package jogo3;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Vida {

    //Icone da vida
    private ImageIcon Vida;
    //imagem da vida
    private Image imgVida;
    //Posição X da vida
    private int x;
    //Posição Y da vida
    private int y;
    //Vaqriavel que diz se a vida esta visivel
    private boolean visible;

    public Vida(int x, int y) {
        Vida = new ImageIcon("img\\vida.png");
        imgVida = Vida.getImage();
        visible = true;
        this.x = x;
        this.y = y;
    }

    //Retorna a image da vida
    public Image getVida() {
        return imgVida;
    }

    //Retorna a posição Xda vida
    public int getX() {
        return x;
    }

    //retorna a posição Y da vida
    public int getY() {
        return y;
    }

    //Retorna a visibiledae da vida
    public boolean getVisible() {
        return visible;
    }

    //Passa por paramentro a visibilidade
    public void setVisible(boolean v) {
        visible = v;
    }
}
