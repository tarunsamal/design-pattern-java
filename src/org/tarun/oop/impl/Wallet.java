package org.tarun.oop.impl;

import org.tarun.oop.contract.Payable;

public class Wallet implements Payable {

    @Override
    public void pay() {
       System.out.println("Paying with Wallet");
    }
}
