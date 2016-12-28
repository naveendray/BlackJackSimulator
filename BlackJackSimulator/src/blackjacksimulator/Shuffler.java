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
    Stack<Card> shuffledPile;
    List<List<Card>> tempPile;
    int pileSize;
    Random rand;

    public Stack<Card> getShuffledStack(int numberOfPacks) {

        rand = new Random();
        shuffledPile = new Stack<Card>();
        pile = new Stack<Card>();

        //create given number of card packs and add all of them to the list pile
        for (int i = 0; i < numberOfPacks; i++) {
            pile.addAll(new CardPack().createPack());
        }

        System.out.println("number of cards in the pile = " + pile.size());
        int shPiles = rand.nextInt(5) + rand.nextInt(300) + 100;
        tempPile = new ArrayList<>();
        for (int i = 0; i < shPiles; i++) {
            tempPile.add(new ArrayList<Card>());
        }
//        random value for a select random list
        int selectList;
        int tempFilesize = tempPile.size();
        int pileSize = pile.size();
//        seperate cards in list pile to number of seperate lists
        for (int i = 0; i < pileSize; i++) {
            selectList = rand.nextInt(tempFilesize);
            tempPile.get(selectList).add(pile.pop());
        }

//        add all the cads in lists in tempPile to shuffledPile
        for (List<Card> list : tempPile) {
            for (Card card : list) {
                shuffledPile.add(card);
            }
        }

        return shuffledPile;
    }

}
