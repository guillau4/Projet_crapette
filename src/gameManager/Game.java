/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameManager;

import cardManager.*;
import java.util.ArrayList;

/**
 *
 * @author Titi
 */
public class Game {

    Player[] player;
    Board board;

    public Game() {
        init();
        play();
    }

    private void init() {
        player = new Player[2];
        for (int i = 0; i < 2; ++i) {
            player[i] = new Player(i);
            FullDeck deck = new FullDeck();
            ArrayList<Card> cardList = deck.getDeck();
            ArrayList<Card> secondCardList = new ArrayList<>();
            for (int j = 0; j < 13; ++j) {
                secondCardList.add(cardList.remove(0));
            }
            player[i].setDecks(cardList, secondCardList);
        }
        board = new Board(player);
    }

    private void play() {
        int playing = 0;

        while (!over()) {
            Turn turn = new Turn(board, player[playing]);
            turn.makeMoves();
            playing = 1 - playing;
        }
    }

    private boolean won(Player p) {
        return p.getBinDeck().getSize() + p.getMainDeck().getSize() == 0;
    }

    private boolean over() {
        return won(player[0]) || won(player[1]);
    }
}
