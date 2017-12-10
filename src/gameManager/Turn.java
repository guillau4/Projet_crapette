/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameManager;

import cardManager.SecondDeck;
import cardManager.BinDeck;
import cardManager.MainDeck;
import cardManager.CardPile;

/**
 *
 * @author Titi
 */
public class Turn {

    private Board board;
    private Player playing;
    private boolean hasDrawn;
    private int nbFree;

    public Turn(Board b, Player p) {
        board = b;
        playing = p;
        hasDrawn = false;
        setNbFree();
        makeMoves();
    }

    public int getNbFree() {
        return nbFree;
    }

    public Player getPlaying() {
        return playing;
    }

    private void setNbFree() {
        nbFree = 0;
        for (int i = 0; i < 8; ++i) {
            if (board.getSide(i).isEmpty()) {
                ++nbFree;
            }
        }
    }

    private void makeMoves() {

        CardPile[] move;

        do {
            move = playing.getMove();
            switch (move.length) {
                case 1:
                    // Drawing a card
                    if (hasDrawn) {
                        continue;
                    }
                    if (nbFree > 0 && !playing.getSecondDeck().isEmpty()) {
                        if (!(move[0] instanceof SecondDeck)) {
                            continue;
                        }
                        ((SecondDeck) move[0]).draw();
                        hasDrawn = true;
                    } else {
                        if (!(move[0] instanceof MainDeck)) {
                            continue;
                        }
                        if (move[0].isEmpty()) {
                            Move.binToDeck(playing.getBinDeck(), playing.getMainDeck());
                        }
                        ((MainDeck) move[0]).draw();
                        hasDrawn = true;
                    }
                    break;
                case 2:
                    // Moving a card
                    if (move[0] instanceof MainDeck) {
                        if (!((MainDeck) move[0]).getHasDrawn()) {
                            continue;
                        }
                    }
                    if (move[0] instanceof SecondDeck) {
                        if (!((SecondDeck) move[0]).getHasDrawn()) {
                            continue;
                        }
                    }
                    Move.transfer(move[0], move[1], this);
                    break;
                default:
                    throw new UnsupportedOperationException("Cannot transfer" + move.length + " cards.");
            }
        } while (!(move[1] instanceof BinDeck && move[1].belongsTo(playing)));
    }

}
