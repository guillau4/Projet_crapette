/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardManager;

import java.util.ArrayList;

/**
 *
 * @author Titi
 */
public class SecondDeck extends CardPile {

    boolean hasDrawn;

    public SecondDeck(ArrayList<Card> cl) {
        super();
        cardList = cl;
        canAdd = false;
        canRemove = true;
        hasDrawn = false;

        if (cl.size() != 13) {
            throw new UnsupportedOperationException("Crapette must be 13 cards big.");
        }
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
