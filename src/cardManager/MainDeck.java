/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardManager;

import gameManager.Player;
import java.util.ArrayList;

/**
 *
 * @author Titi
 */
public class MainDeck extends CardPile {

    boolean hasDrawn;
    protected Player owner;

    public MainDeck(ArrayList<Card> cl, Player o) {
        super();
        cardList = cl;
        canAdd = false;
        canRemove = true;
        hasDrawn = false;
        owner = o;
    }

    public void set(ArrayList<Card> cl) {
        if (!cardList.isEmpty()) {
            throw new UnsupportedOperationException("Main deck is not empty.");
        }
        cardList = cl;
    }

    public boolean belongsTo(Player p) {
        return owner.is(p);
    }

    public boolean getHasDrawn() {
        return hasDrawn;
    }

    public void draw() {
        hasDrawn = true;
    }

    public void played() {
        hasDrawn = false;
    }
}
