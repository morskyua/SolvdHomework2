package org.example.shop.discount;

public class VIPDiscount extends Discount{
    private String causeOfDiscount;

    public String getCauseOfDiscount() {
        return causeOfDiscount;
    }

    public void setCauseOfDiscount(String causeOfDiscount) {
        this.causeOfDiscount = causeOfDiscount;
    }

    public VIPDiscount(int discountAmount, String causeOfDiscount) {
        super(discountAmount);
        this.causeOfDiscount = causeOfDiscount;
    }
}
