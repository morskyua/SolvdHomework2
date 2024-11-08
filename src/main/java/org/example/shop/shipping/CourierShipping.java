package org.example.shop.shipping;

public class CourierShipping extends Shipping {

    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public CourierShipping(String trackingNumber, int daysToDeliver, String adress) {
        super(trackingNumber, daysToDeliver);
        this.adress = adress;
    }

}
