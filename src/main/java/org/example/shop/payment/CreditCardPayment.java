package org.example.shop.payment;

public class CreditCardPayment extends Payment {
    protected String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
}
