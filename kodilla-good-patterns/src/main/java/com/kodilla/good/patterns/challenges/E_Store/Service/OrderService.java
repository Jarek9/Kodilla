package com.kodilla.good.patterns.challenges.E_Store.Service;

import com.kodilla.good.patterns.challenges.E_Store.Products.Product;
import com.kodilla.good.patterns.challenges.E_Store.Users.User;

public interface OrderService {

   boolean order(User user, Product product);
}
