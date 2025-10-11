package org.tarun.oop.impl;

import org.tarun.oop.contract.Card;
import org.tarun.oop.contract.Payable;

public class CreditCard extends Card implements Payable {

    public CreditCard(String name, String cardNumber) {
        super(name, cardNumber);
    }

    @Override
    public void pay() {
        System.out.println(getName() + " Credit card has been payed with "  + getCardNumber() );
    }
}
