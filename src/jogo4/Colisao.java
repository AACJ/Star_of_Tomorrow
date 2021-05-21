/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo4;

/**
 *
 * @author Aluno
 */
public class Colisao {

    public static boolean colidir(int x1, int y1, int larg1, int alt1, int x2, int y2, int larg2, int alt2) {

        final int pLargA = x1 + larg1;
        final int pLargB = x2 + larg2;

        final int pAltA = y1 + alt1;
        final int pAltB = y2 + alt2;

        if (pLargA > x2 && x1 < pLargB && pAltA > y2 && y1 < pAltB) {
            return true;
        }

        return false;
    }

}
