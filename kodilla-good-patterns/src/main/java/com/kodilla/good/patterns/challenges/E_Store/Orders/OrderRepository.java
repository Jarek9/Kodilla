package com.kodilla.good.patterns.challenges.E_Store.Orders;

import com.kodilla.good.patterns.challenges.E_Store.Products.Product;
import com.kodilla.good.patterns.challenges.E_Store.Users.User;

public interface OrderRepository {

    void closeOrder(User user, Product product);
}
