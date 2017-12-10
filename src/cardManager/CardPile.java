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
public abstract class CardPile {

    protected ArrayList<Card> cardList;
    protected boolean visible;
    protected boolean canAdd;
    protected boolean canRemove;
    protected Player owner;

    public CardPile() {
        cardList = new ArrayList<>();
    }

    public boolean getCanAdd() {
        return canAdd;
    }

    public boolean getCanRemove() {
        return canRemove;
    }

    public int getSize() {
        return cardList.size();
    }

    public boolean belongsTo(Player p) {
        return owner.is(p);
    }

    public boolean addTest(Card c, Player playing) {
        throw new UnsupportedOperationException("Cannot add card.");
    }

    public void add(Card c) {
        if (canAdd) {
            cardList.add(0, c);
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
            return cardList.remove(0);
        } else {
            throw new UnsupportedOperationException("Cannot remove card.");
        }
    }
}
