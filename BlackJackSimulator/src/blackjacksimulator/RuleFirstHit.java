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
public class RuleFirstHit extends HitRule{

    @Override
    public boolean isHit() {
        if(getPlayer().getTotal()>=17)
            return false;
        else
            return true;
    }
    
    public boolean hisHit(int margine){
        if(getPlayer().getTotal()>=margine)
            return false;
        else
            return true;
    }
    
}
