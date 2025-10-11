package org.tarun.oop;

import org.tarun.oop.impl.CreditCard;
import org.tarun.oop.impl.DebitCard;
import org.tarun.oop.impl.Upi;
import org.tarun.oop.impl.Wallet;
import org.tarun.oop.service.PaymentService;

public class Client {
    static void main() {
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("hdfc DC", new DebitCard("Tarun","1234"));
        paymentService.addPaymentMethod("sbi CC", new CreditCard("Tarun","5689"));
        paymentService.addPaymentMethod("phonepe UPI", new Upi("tarun@phonepe"));
        paymentService.addPaymentMethod("wallet", new Wallet());

        /*paymentService.makePayment("hdfc DC");
        paymentService.makePayment("phonepe UPI");*/
        paymentService.makePayment("wallet");


    }
}
