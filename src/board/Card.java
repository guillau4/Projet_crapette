/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

/**
 *
 * @author Titi
 */
public class Card {

    public enum Color {
        PIQUE,
        TREFLE,
        CARREAU,
        COEUR
    }
    
    private int value;
    private Color color;
    private boolean visible;
    private int player;

    public Card(int v, Color c) {
        value = v;
        color = c;
        visible = true;
        player = 0;
    }

    public Card(int v, Color c, boolean vi) {
        value = v;
        color = c;
        visible = vi;
        player = 0;
    }

    public Card(int v, Color c, int p) {
        value = v;
        color = c;
        visible = true;
        player = p;
    }

    public Card(int v, Color c, boolean vi, int p) {
        value = v;
        color = c;
        visible = vi;
        player = p;
    }
    
    public boolean sameColor(Color c) {
        return c == color;
    }
    
    public boolean compatibleColor(Color c) {
        if (color == Color.TREFLE || color == Color.PIQUE) {
            return c == Color.TREFLE || c == Color.PIQUE;
        }
        else {
            return c == Color.CARREAU || c == Color.COEUR;
        }
    }
}
