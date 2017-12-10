/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

import java.util.ArrayList;

/**
 *
 * @author Titi
 */
public class MainDeck extends CardPile {

    public MainDeck(ArrayList<Card> cl) {
        super();
        cardList = cl;
        canAdd = false;
        canRemove = true;
    }

    public void set(ArrayList<Card> cl) {
        if (!cardList.isEmpty()) {
            throw new UnsupportedOperationException("Main deck is not empty.");
        }
        cardList = cl;
    }
}
