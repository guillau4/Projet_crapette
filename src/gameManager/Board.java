/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameManager;

import cardManager.AcePile;
import cardManager.SidePile;

/**
 *
 * @author Titi
 */
public class Board {

    private SidePile[] side;
    private AcePile[] ace;
    private Player[] player;

    public Board(Player[] p) {
        side = new SidePile[8];
        ace = new AcePile[8];

        for (int i = 0; i < 8; ++i) {
            side[i] = new SidePile();
            ace[i] = new AcePile();
        }

        player = p;

    }
    
    public AcePile getAce(int i) {
        return ace[i];
    }
    
    public SidePile getSide(int i) {
        return side[i];
    }
}
