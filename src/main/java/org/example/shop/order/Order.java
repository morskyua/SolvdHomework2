package org.example.shop.order;

public class Order {
    private int orderId;
    private String customer;

    public Order(int orderId, String customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
