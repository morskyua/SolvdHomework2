package org.example.shop.discount;

public class VIPDiscount extends Discount{
    private int vipLevel;

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    public VIPDiscount(int discountAmount, int vipLevel) {
        super(discountAmount * vipLevel);
        this.vipLevel = vipLevel;
    }
}
