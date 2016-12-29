/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

import java.util.List;

/**
 *
 * @author hmynherath
 */
public class Player {
    private int chips = 1000;
    private String name;
    private int total = 0;
    private Card dealersTopCard;
    private List<HitRule> rules;
    private boolean hit = true;

    public Player(String name, Card dealersTopCard) {
        this.name = name;
        this.dealersTopCard = dealersTopCard;
    }
    
    
    
    public int getTotal() {
        return total;
    }
    
    
    public int doHit(Card card) {
        total += card.getValue();
        return total;
    }
    
    public boolean hit() {
        for (HitRule rule : rules) {
            hit = rule.isHit();
        }
        return hit;
    }
    
    public void addRule(HitRule rule) {
        rules.add(rule);
    }
    
    
        
}
