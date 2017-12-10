/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameManager;

import cardManager.Card;
import cardManager.MainDeck;
import cardManager.BinDeck;
import cardManager.SidePile;
import cardManager.CardPile;

/**
 *
 * @author Titi
 */
public class Move {

    public static boolean transfer(CardPile fromPile, CardPile toPile, Turn turn) {
        if (fromPile instanceof SidePile && toPile instanceof SidePile) {
            return transferSidePile((SidePile) fromPile, (SidePile) toPile, turn.getNbFree());
        }
        
        return transferTop(fromPile, toPile, turn.getPlaying());
    }

    private static boolean transferTop(CardPile fromPile, CardPile toPile, Player playing) {
        if (!fromPile.getCanRemove()) {
            return false;
        }

        if (!toPile.getCanAdd()) {
            return false;
        }

        if (!toPile.addTest(fromPile.get(0), playing)) {
            return false;
        }

        toPile.add(fromPile.remove());
        return true;

    }

    private static boolean transferSidePile(SidePile fromPile, SidePile toPile, int cases) {
        Card top = toPile.get(0);
        int moveSize = top.getValue() - fromPile.get(0).getValue();
        Card from = toPile.get(moveSize - 1);

        if (!toPile.addTest(from, null)) {
            return false;
        }

        if (Math.pow(2, cases) < moveSize) {
            return false;
        }

        SidePile tmp = new SidePile();
        for (int i = 0; i < moveSize; ++i) {
            tmp.add(fromPile.remove());
        }
        for (int i = 0; i < moveSize; ++i) {
            toPile.add(tmp.remove());
        }
        return true;
    }

    public void binToDeck(BinDeck bin, MainDeck deck) {
        deck.set(bin.reset());
    }
}
