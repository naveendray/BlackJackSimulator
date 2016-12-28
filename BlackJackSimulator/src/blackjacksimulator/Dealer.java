/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author hmynherath
 */
public class Dealer {
    Stack<Card> shuffle;
    int chips;
    List<Player> players;

    public Dealer(int chips) {
        this.shuffle = new Shuffler().getShuffledStack(6);
        this.chips = chips;
    }
    
}
