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
    protected boolean canAdd;
    protected boolean canRemove;
    protected boolean fifo;

    public CardPile() {
        cardList = new ArrayList<>();
    }

    public void add(Card c) {
        if (canAdd) {
            cardList.add(c);
        } else {
            throw new UnsupportedOperationException("Cannot add card.");
        }
    }

    public Card get(int i) {
        return cardList.get(i);
    }

    public boolean isEmpty() {
        return cardList.isEmpty();
    }

    public Card remove() {
        if (canRemove) {
            if (fifo) {
                return cardList.remove(0);
            } else {
                return cardList.remove(cardList.size() - 1);
            }
        } else {
            throw new UnsupportedOperationException("Cannot remove card.");
        }
    }
}
