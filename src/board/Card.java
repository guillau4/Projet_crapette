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

    private int value;
    private int color;
    private boolean visible;
    private int player;

    public Card(int v, int c) {
        value = v;
        color = c;
        visible = true;
        player = 0;
    }

    public Card(int v, int c, boolean vi) {
        value = v;
        color = c;
        visible = vi;
        player = 0;
    }

    public Card(int v, int c, int p) {
        value = v;
        color = c;
        visible = true;
        player = p;
    }

    public Card(int v, int c, boolean vi, int p) {
        value = v;
        color = c;
        visible = vi;
        player = p;
    }
}
