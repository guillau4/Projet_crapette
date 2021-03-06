/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardManager;

import gameManager.Player;

/**
 *
 * @author Titi
 */
public class SidePile extends CardPile {

    public SidePile() {
        super();
        canAdd = true;
        canRemove = true;
    }

    @Override
    public boolean addTest(Card c, Player playing) {
        if (isEmpty()) {
            return true;
        }
        Card top = cardList.get(0);
        if (top.oppositColor(c) && top.getValue() - c.getValue() == 1) {
            return true;
        } else {
            return false;
        }
    }
}
