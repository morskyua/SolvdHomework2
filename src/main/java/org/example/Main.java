package org.example;

import org.example.shop.Shop;
import org.example.shop.discount.Discount;
import org.example.shop.discount.VIPDiscount;
import org.example.shop.order.Order;
import org.example.shop.order.OrderItem;
import org.example.shop.payment.CashPayment;
import org.example.shop.payment.CreditCardPayment;
import org.example.shop.payment.PayPalPayment;
import org.example.shop.payment.Payment;
import org.example.shop.products.*;
import org.example.shop.shipping.ExpressShipping;
import org.example.shop.shipping.Shipping;
import org.example.shop.shipping.StandardShipping;
import org.example.shop.user.Customer;
import org.example.shop.user.ShopWorker;
import org.example.shop.user.User;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("rozetka", "New York");

        User user = new User("user");
        ShopWorker admin = new ShopWorker("admin", "admin");
        Customer customer = new Customer("John");

        Product product = new Product("Toy bear", 20);
        Clothing clothing = new Clothing("shirt", 50, "adidas");
        Electronics electronics = new Electronics("phone", 20, "samsung");
        OrganicProduct organicProduct = new OrganicProduct("tomato", 2, 5);
        Furniture furniture = new Furniture("sofa", 1000, "cotton");

        Payment payment = new Payment(50);
        CreditCardPayment creditCardPayment = new CreditCardPayment(20, "12311212332");
        PayPalPayment payPalPayment = new PayPalPayment(123, "asadaa@gmail.com");
        CashPayment cashPayment = new CashPayment(20, 2);

        Shipping shipping = new Shipping("12312312323213");
        StandardShipping standardShipping = new StandardShipping("1312312312321", 4);
        ExpressShipping expressShipping = new ExpressShipping("1312312312", 2);

        Order order = new Order(131231, "John");
        OrderItem orderItem = new OrderItem("phone", 1);

        Discount discount = new Discount(5);
        VIPDiscount vipDiscount = new VIPDiscount(5, "vip customer");

    }
}