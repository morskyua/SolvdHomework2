package org.example.shop.payment;

public class CashPayment extends Payment {

    protected int billsAmount;

    public CashPayment(double amount, int billsAmount) {
        super(amount);
        this.billsAmount = billsAmount;
    }
}
