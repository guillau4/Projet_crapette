/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameManager;

/**
 *
 * @author Titi
 */
public class Game {
    
    Player[] player;
    Board board;
    
    public Game() {
        player = new Player[2];
        player[0] = new Player(0);
        player[1] = new Player(1);
        board = new Board(player);
        
        strat();
    }
}
