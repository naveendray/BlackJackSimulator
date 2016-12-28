/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author yasitha
 */
public class Shuffler {

    Stack<Card> pile;
    List<Card> shuffledPile;
    List<List<Card>> tempPile;
    int pileSize;

    private List<Card> shuffle(int numberOfPacks) {
        pile = new Stack();
        for (int i = 0; i < numberOfPacks; i++) {
            pile.addAll(new CardPack().createPack());
        }
//        for (Card card : pile) {
//            System.out.println(card.getValue() + card.getType());
//        }
        pileSize = numberOfPacks * 52;
        
        int shPiles = new Random().nextInt(5) + 3;
        System.out.println(shPiles);
        tempPile = new ArrayList<>();
        for (int i = 0; i < shPiles; i++) {
            System.out.println("here");
            tempPile.add(new ArrayList<Card>());
            System.out.println("added");
            System.out.println(tempPile.size());
        }
        
            int selectList = new Random(tempPile.size()).nextInt();
        for (int i = 0; i < pile.size(); i++) {
            System.out.println("selectList ="+selectList);
            System.out.println("poped");
            tempPile.get(selectList).add(pile.pop());
        }
        
        for (List list : tempPile) {
            shuffledPile.addAll(list);
        }
        
        for (Card card : shuffledPile) {
            System.out.println(card.getValue());
        }

        return shuffledPile;
    }

    public static void main(String[] args) {
        System.out.println("something");
        int i = 0;
        new Shuffler().shuffle(2);
        System.out.println(i);
    }

}
