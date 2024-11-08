package org.example.shop.products;

public class Electronics extends Product {
    protected String brand;

    public Electronics(String typeOfElectronics, double price, String brand) {
        super(typeOfElectronics, price);
        this.brand = brand;
    }

    public Electronics() {
    }
}
