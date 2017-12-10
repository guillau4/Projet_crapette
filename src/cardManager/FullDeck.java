/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardManager;

import cardManager.Card.Color;

/**
 *
 * @author Titi
 */
public class FullDeck extends CardPile {

    public FullDeck() {
        super();
        canAdd = false;
        canRemove = true;

        init();
    }

    private void init() {
        for (int i = 1; i < 14; i++) {
            cardList.add(new Card(i, Color.CARREAU));
        }
        for (int i = 1; i < 14; i++) {
            cardList.add(new Card(i, Color.COEUR));
        }
        for (int i = 1; i < 14; i++) {
            cardList.add(new Card(i, Color.PIQUE));
        }
        for (int i = 1; i < 14; i++) {
            cardList.add(new Card(i, Color.TREFLE));
        }
    }

    private void scramble() {

    }
}
