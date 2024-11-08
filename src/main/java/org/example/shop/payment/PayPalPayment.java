package org.example.shop.payment;

public class PayPalPayment extends Payment {
    private final String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }
}
