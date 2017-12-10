/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

import game.Player;

/**
 *
 * @author Titi
 */
public class AcePile extends CardPile {

    public AcePile() {
        super();
        canAdd = true;
        canRemove = false;
    }

    @Override
    public boolean addTest(Card c, Player playing) {
        Card top = cardList.get(0);
        if (top.sameColor(c) && top.getValue() - c.getValue() == 1) {
            return true;
        } else {
            return false;
        }
    }
}
