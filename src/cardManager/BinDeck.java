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
public class BinDeck extends CardPile {

    public BinDeck() {
        super();
        canAdd = true;
        canRemove = false;
    }

    @Override
    public boolean addTest(Card c, Player playing) {
        if (playing.is(owner)) {
            return true;
        } else {
            Card top = cardList.get(0);
            if (top.sameColor(c) && Math.abs(top.getValue() - c.getValue()) <= 1) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    public ArrayList<Card> reset() {
        ArrayList<Card> ret = (ArrayList<Card>) cardList.clone();
        cardList.clear();
        return ret;
    }
}
