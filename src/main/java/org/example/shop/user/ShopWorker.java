package org.example.shop.user;

public class ShopWorker extends User{
    private String role;

    public ShopWorker(String username, String role) {
        super(username);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
