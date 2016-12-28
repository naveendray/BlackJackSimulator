/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

/**
 *
 * @author hmynherath
 */
public class Player {
    int chips;
    String name;
    int total = 0;
    
    public int getCard(Card card) {
        total += card.getValue();
        return total;
    }
        
}
