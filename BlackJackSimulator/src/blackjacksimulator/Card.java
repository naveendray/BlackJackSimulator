/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjacksimulator;

/**
 *
 * @author yasitha
 */
public class Card {
    private int value;
    private String type;
    private String displayValue;

    public Card(int value, String type, String displayValue) {
        this.value = value;
        this.type = type;
        this.displayValue = displayValue;
    }
    public Card(int value, String type) {
        this.value = value;
        this.type = type;
    }
    public Card( String type) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDisplayValue() {
        return displayValue;
    }

    public void setDisplayValue(String displayValue) {
        this.displayValue = displayValue;
    }
    
    
}
