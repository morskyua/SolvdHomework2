package org.example.shop.products;

public class Product {
    private String typeOfProduct;
    private double price;

    public Product(String name, double price) {
        this.typeOfProduct = name;
        this.price = price;
    }

    public Product() {}

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setName(String name) {
        this.typeOfProduct = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
