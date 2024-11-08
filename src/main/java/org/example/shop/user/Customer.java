package org.example.shop.user;

public class Customer extends User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String username) {
        super(username);
    }
}
