package org.example.shop.products;

public class Furniture extends Product {

    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Furniture(String typeOfFurniture, double price, String material) {
        super(typeOfFurniture, price);
        this.material = material;
    }

    public Furniture() {
    }
}
