package org.tarun.oop.service;

import org.tarun.oop.contract.Payable;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private Map<String, Payable> savedPayment ;
    public PaymentService() {
        savedPayment = new HashMap<String, Payable>();
    }

    public void addPaymentMethod(String title,Payable Payable) {
        savedPayment.put(title, Payable);
    }

    public void makePayment(String title) {
        savedPayment.get(title).pay();
    }
}
