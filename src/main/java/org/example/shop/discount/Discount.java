package org.example.shop.discount;

public class Discount {
    private int discountAmount;

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Discount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Discount() {}
}
