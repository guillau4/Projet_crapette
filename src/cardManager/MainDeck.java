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
public class MainDeck extends CardPile {

    boolean hasDrawn;
    
    public MainDeck(ArrayList<Card> cl) {
        super();
        cardList = cl;
        canAdd = false;
        canRemove = true;
        hasDrawn = false;
    }

    public void set(ArrayList<Card> cl) {
        if (!cardList.isEmpty()) {
            throw new UnsupportedOperationException("Main deck is not empty.");
        }
        cardList = cl;
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
