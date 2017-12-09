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
public abstract class CardPile {

    protected ArrayList<Card> cardList;
    protected boolean visible;

    public CardPile() {
        cardList = new ArrayList<>();
    }

    public abstract Card remove();

    public void add(Card c) {
        cardList.add(c);
    }

    public Card get(int i) {
        return cardList.get(i);
    }

    public boolean isEmpty() {
        return cardList.isEmpty();
    }
}
