/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameManager;

import cardManager.SecondDeck;
import cardManager.Card;
import cardManager.BinDeck;
import cardManager.MainDeck;
import cardManager.CardPile;
import java.util.ArrayList;

/**
 *
 * @author Titi
 */
public class Player {

    private int playerNumber;
    private MainDeck mainDeck;
    private SecondDeck secondDeck;
    private BinDeck binDeck;

    public Player(int pn) {
        playerNumber = pn;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public MainDeck getMainDeck() {
        return mainDeck;
    }

    public SecondDeck getSecondDeck() {
        return secondDeck;
    }

    public boolean is(Player p) {
        return p.getPlayerNumber() == playerNumber;
    }

    public void setDecks(ArrayList<Card> main, ArrayList<Card> second) {
        mainDeck = new MainDeck(main);
        secondDeck = new SecondDeck(second);
        binDeck = new BinDeck();
    }

    public CardPile[] getMove() {
        
        // TODO

        return new CardPile[]{mainDeck, binDeck};
    }
}
