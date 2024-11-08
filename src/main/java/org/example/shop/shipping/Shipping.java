package org.example.shop.shipping;
public class Shipping {
    protected String trackingNumber;

    protected int daysToDelivery;

    public Shipping(String trackingNumber, int daysToDelivery) {
        this.trackingNumber = trackingNumber;
        this.daysToDelivery = daysToDelivery;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }
}
