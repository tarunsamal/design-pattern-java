package org.tarun.oop.contract;

public class Card {
    private String name;
    private String cardNumber;

    public Card(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
