/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author yasitha
 */
public class Shuffler {

    List<Card> pile;
    List<Card> shuffledPile;
        int pileSize ;

    private List<Card> shuffle(int numberOfPacks) {
        pile = new ArrayList();
        for (int i = 0; i < numberOfPacks; i++){
            pile.addAll(new CardPack().createPack());
        }
        for (Card card : pile) {
            System.out.println(card.getValue()+card.getType());
        }
        pileSize =  numberOfPacks * 52;
        return shuffledPile;
    }

    public static void main(String[] args) {
        System.out.println("something");
        int i = 0;
        new Shuffler().shuffle(2);
        System.out.println(i);
    }

}
