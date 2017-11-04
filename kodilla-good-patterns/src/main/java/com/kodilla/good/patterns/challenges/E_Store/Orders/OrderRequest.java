package com.kodilla.good.patterns.challenges.E_Store.Orders;

import com.kodilla.good.patterns.challenges.E_Store.Products.Product;
import com.kodilla.good.patterns.challenges.E_Store.Users.User;

public class OrderRequest {

    private User user;
    private Product product;


    public OrderRequest(final User user, final Product product) {
        this.user = user;
        this.product = product;

    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
