/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

/**
 *
 * @author Shane
 */
public abstract class HitRule {
    private Player player;   
    
    public void setPlayer(Player player){
        this.player = player;
    }
    public Player getPlayer(){
        return player;
    }
    
    public abstract boolean isHit();    
}
