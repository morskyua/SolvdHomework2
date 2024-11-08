package org.example.shop.shipping;

import org.example.shop.payment.Payment;

public class ExpressShipping extends Shipping {

    private int daysToDeliver;

    public ExpressShipping(String trackingNumber, int daysToDeliver) {
        super(trackingNumber);
        this.daysToDeliver = daysToDeliver;
    }

    public int getDaysToDeliver() {
        return daysToDeliver;
    }

    public void setDaysToDeliver(int daysToDeliver) {
        this.daysToDeliver = daysToDeliver;
    }

}
