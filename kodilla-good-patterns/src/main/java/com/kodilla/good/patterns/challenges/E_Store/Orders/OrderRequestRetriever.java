package com.kodilla.good.patterns.challenges.E_Store.Orders;

import com.kodilla.good.patterns.challenges.E_Store.Products.Product;
import com.kodilla.good.patterns.challenges.E_Store.Users.User;

public class OrderRequestRetriever {

    public OrderRequest retrive()
    {
        User user = new User("Jan", "Kowalski");
        Product product = new Product("Szczoteczka do zębów");

        return new OrderRequest(user, product);
    }



}
