package org.tarun.oop.impl;

import org.tarun.oop.contract.Card;
import org.tarun.oop.contract.Payable;

public class DebitCard extends Card implements Payable {
    public DebitCard(String name, String cardNumber) {
        super(name, cardNumber);
    }

    @Override
    public void pay() {
            System.out.println(getName() + " Debit card has been payed with "  + getCardNumber() );
    }
}
