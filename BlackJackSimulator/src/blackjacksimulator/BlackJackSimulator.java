/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

import java.util.Stack;

/**
 *
 * @author yasitha
 */
public class BlackJackSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Black jack simulator started");
        Shuffler shuffler = new Shuffler();
        Stack<Card> pile = shuffler.getShuffledStack(2);
        
    }
    
}
