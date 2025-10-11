package org.tarun.oop.impl;

import org.tarun.oop.contract.Payable;

public class Upi implements Payable {

    private String upiId;

    public Upi(String upiId) {
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public void pay() {
        System.out.println("Paying upi with id " + upiId);
    }
}
