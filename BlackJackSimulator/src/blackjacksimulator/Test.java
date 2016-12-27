/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author yasitha
 */
public class Test {

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(rand.nextInt(5));
        }
        Set myset = new HashSet();
        while(myset.size()<10){
            myset.add(rand.nextInt(10));
        }
        System.out.println(myset);
    }
}
