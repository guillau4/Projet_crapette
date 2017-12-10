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
    
    public Color getColor(){
        return color;
    }
    
    public int getValue(){
        return value;
    }
    
    public boolean sameColor(Card c) {
        return c.getColor() == color;
    }
    
    public boolean oppositColor(Card card) {
        Color c = card.getColor();
        if (color == Color.CARREAU || color == Color.COEUR) {
            return c == Color.TREFLE || c == Color.PIQUE;
        }
        else {
            return c == Color.CARREAU || c == Color.COEUR;
        }
    }
}
