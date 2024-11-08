package org.example.shop.shipping;
public class Shipping {
    protected String trackingNumber;

    public Shipping(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }
}
