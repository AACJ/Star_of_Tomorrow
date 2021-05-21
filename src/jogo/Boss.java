package jogo;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;


public class Boss {

    //Icone do Boss
    protected ImageIcon Boss;
    //Iamge do Boss
    protected Image imgBoss;
    //Posição X do Boss
    private int x;
    //Posição y o Boss
    private int y;
    //Variavel que diz se o Boss esta visivel
    private boolean visible;
    //Limite de movimentação o Boss determinado pela variavel nx
    private int limite;
    //Altura da imegem do Boss
    private int Altura;
    //Largura da imagem do Boss
    private int Largura;
    //Variavel para o tiro Boss 1
    private List<TiroBoss> tiroBoss1;
   
    //Velociade de movimentação do Boss
    private static final int velocidade = 2;

    public Boss() {
        x = 100;
        y = -500;
        Boss = new ImageIcon("img\\boss.png");
        imgBoss = Boss.getImage();
        visible = true;
        Altura = imgBoss.getHeight(Boss.getImageObserver()) - 100;
        Largura = imgBoss.getWidth(Boss.getImageObserver()) - 100;
        limite = -80;
        tiroBoss1 = new ArrayList<TiroBoss>();
   
    }

    //Move para Baixo com limite
    public void moveDown() {
        y += velocidade;
        if (y > limite) {
            y = limite;
        }
    }

    //Move para cima
    public void moveUp() {
        y -= 1;

    }

    //Move para esquerda
    public void moveLeft() {
        x -= 1;
    }

    //Move para direita
    public void moveRigth() {
        x += 1;
    }

    //Atira
    public void atirar1() {
        Timer tempo = new Timer();
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                tiroBoss1.add(new TiroBoss(x+240, y + 230, limite));
             
            }
        };
        tempo.scheduleAtFixedRate(tarefa, 2000, 3000);
    }

    
    //Retorna o tiro Boss1
    public List tiro1() {
        return tiroBoss1;
    }

    

    //retorna se estar visivel
    public boolean getVisible() {
        return visible;
    }

    //Permite colocar a visibilidade
    public void setVisible(boolean v) {
        visible = v;
    }

    //retorna a imagem do inimigo
    public Image getImageBoss() {
        return imgBoss;
    }

    //retorna a posição X
    public int getX() {
        return x;
    }

    //retorna a posição Y
    public int getY() {
        return y;
    }

    //retorna a largura
    public int getLargura() {
        return Largura;
    }

    //retorna a altura
    public int getAltura() {
        return Altura;
    }

    //retorna o limite do inimigo
    public int getLimite() {
        return limite;
    }

}
