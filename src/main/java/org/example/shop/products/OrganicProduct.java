package org.example.shop.products;

public class OrganicProduct extends Product{
    private int daysToExpire;

    public int getDaysToExpire() {
        return daysToExpire;
    }

    public void setDaysToExpire(int daysToExpire) {
        this.daysToExpire = daysToExpire;
    }

    public OrganicProduct(String typeOfProduct, double price, int daysToExpire) {
        super(typeOfProduct, price);
        this.daysToExpire = daysToExpire;
    }
    public OrganicProduct() {}
}
