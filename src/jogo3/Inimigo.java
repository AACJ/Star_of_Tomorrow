package jogo3;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;

public class Inimigo {

    //Icone do inimigo
    protected ImageIcon Inimigo;
    //Iamge do inimigo
    protected Image imgInimigo;
    //Posição X do inimigo
    private int x;
    //Posição y o inimigo
    private int y;
    //Variavel que diz se o inimigo esta visivel
    private boolean visible;
    //Variavel de geração da posição X aletoriamente
    private Random nx;
    //Variavel de geração da posição Y aletoriamente
    private Random ny;
    //Limite de movimentação o inimigo determinado pela variavel nx
    private int limite;
    //Altura da imegem do inimigo
    private int Altura;
    //Largura da imagem do inimigo
    private int Largura;
    //Variavel para o tiro inimigo
    private List<TiroInimigo> tiroInimigo;
    //Variavel de tempo aleatorio do tiro do inimigo
    private Random tempoAleatorio;
    //Variavel  para receber o tempo aleatorio
    private int ta;
    //Variavel de tempo aleatorio para inicialização do tiro inimigo
    private Random tempoAleatorioIni;
    //Variavel auxiliar para receber o tempo aleatorio
    private int ti;
    //Velociade de movimentação do inimigo
    private static final int velocidade = 2;
    private int contVida = 0;
    private int contTiro = 0;
    private int dx;
    
    public Inimigo() {
        nx = new Random();
        ny = new Random();
        tempoAleatorio = new Random();
        tempoAleatorioIni = new Random();
        x = nx.nextInt(520);
        y = - 100;
        Inimigo = new ImageIcon("img\\inimigo.png.png");
        imgInimigo = Inimigo.getImage();
        visible = true;
        Altura = imgInimigo.getHeight(Inimigo.getImageObserver()) - 50;
        Largura = imgInimigo.getWidth(Inimigo.getImageObserver()) - 50;
        limite = ny.nextInt(280) - 24;
        tiroInimigo = new ArrayList<TiroInimigo>();
        ta = tempoAleatorio.nextInt(5000) + 2000;
        ti = tempoAleatorioIni.nextInt(2000) + 1000;
        dx = 1;
    }

    //Altera a movimentação ao bater na parede
    public void moveColisao(){
    if((x < - 20) || (x > 520)){
        dx *= -1;
    }
        x += dx;
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
        
        //Limite para ir para esquerda
        if (x < -20) {
            this.x = -20;
        }
    }

    //Move para direita
    public void moveRigth() {
        x += 1;
        
         //Limite para ir para direita
        if (x > 520) {
            this.x = 520;
        }

    }

    //Retorna o tiro inimigo
    public List tiro() {
        return tiroInimigo;
    }

    //Adiciona um tiro inimigo
    public void atira() {
        Timer tempo = new Timer();
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                tiroInimigo.add(new TiroInimigo(x + Largura, y + Altura, limite));            
                contTiro++;
         
            }
        };
        tempo.scheduleAtFixedRate(tarefa, ti, ta);
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
    public Image getImageInimigo() {
        return imgInimigo;
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
    
    public int getContVida(){
        return contVida;
    }
    
    public void tirarVida(){
        contVida++;
    }
    
    public int getContTiro(){
        return contTiro;
    }
     

}
