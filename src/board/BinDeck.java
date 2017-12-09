/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

/**
 *
 * @author Titi
 */
public class BinDeck extends CardPile {

    public BinDeck() {
        // Pile vide
    }

    @Override
    public void add(Card c) {
        cardList.add(c);
    }

    @Override
    public Card remove() {
        // Impossible d'enlever une carte de la poubelle
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Card get(int i) {
        // Jamais utilisé
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
