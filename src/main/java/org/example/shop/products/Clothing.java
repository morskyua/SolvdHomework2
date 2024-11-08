package org.example.shop.products;

public class Clothing extends Product {
    protected String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public Clothing() {
    }
}
