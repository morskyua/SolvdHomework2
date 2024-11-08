package org.example.shop.shipping;

public class PickUp extends Shipping {
    private String store;

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public PickUp(String trackingNumber, int daysToDeliver, String store) {
        super(trackingNumber, daysToDeliver);
        this.store = store;
    }

}
