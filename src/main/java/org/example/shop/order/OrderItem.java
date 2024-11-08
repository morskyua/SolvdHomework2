package org.example.shop.order;

public class OrderItem {
    private String product;
    protected int quantity;

    public OrderItem(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}
