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
public class SidePile extends CardPile {

    public SidePile() {
        super();
        fifo = false;
        canAdd = true;
        canRemove = true;
    }
}
