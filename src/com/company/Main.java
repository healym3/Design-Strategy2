package com.company;

import com.company.controller.CreditCardAlgorithm;
import com.company.controller.PayPalAlgorithm;
import com.company.controller.ShoppingCart;
import com.company.model.Product;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Product pants = new Product("234",25);
        Product shirt = new Product("987", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        cart.pay(new PayPalAlgorithm("mac@me.com", "password1"));

        cart.pay(new CreditCardAlgorithm("Mac", "123456789"));

    }
}
