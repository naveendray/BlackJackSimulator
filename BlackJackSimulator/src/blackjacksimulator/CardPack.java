/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yasitha
 */
public class CardPack {

    private List<Card> pack;
    private Card tempCard;
    private String[] types = {"Diomonds", "Hearts", "Spades", "Clubs"};

    public List<Card> createPack() {

        pack = new ArrayList();
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            tempCard = new Card( types[i]);
            for (int j = 0; j < 13; j++) {
                tempCard.setValue(j+1);
                System.out.println(j);
                tempCard.setDisplayValue(DetermineDisplayValue(tempCard));
                pack.add(tempCard);
                System.out.println("Card added to pack" + tempCard.getDisplayValue() + tempCard.getType() + tempCard.getValue());
            }
        }
        return pack;
    }

    private String DetermineDisplayValue(Card card) {
        if (card.getValue() > 1 && card.getValue() < 10) {
            return String.valueOf(card.getValue());
        } else {
            switch (card.getValue()) {
                case 1:
                    return "A";
                case 10:
                    return "10";
                case 11:
                    return "J";
                case 12:
                    return "Q";
                case 13:
                    return "K";
                default:
                    return null;
            }
        }
    }

    public static void main(String[] args) {
        CardPack cp = new CardPack();
        for (Card card : cp.createPack()) {
            System.out.println("New card created " + card.getDisplayValue() + card.getType() + card.getValue());
            System.out.println(cp.pack.size());
        }
    }

}
