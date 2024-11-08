package org.example.shop.shipping;

public class StandardShipping extends Shipping{

    private int daysToDeliver;
    public StandardShipping(String trackingNumber, int daysToDeliver) {
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
