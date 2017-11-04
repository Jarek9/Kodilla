package com.kodilla.good.patterns.challenges.E_Store.Orders;


import com.kodilla.good.patterns.challenges.E_Store.Products.Product;
import com.kodilla.good.patterns.challenges.E_Store.Users.User;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void closeOrder(User user, Product product) {
        System.out.println("Transakcja zakończona sukcesem");
    }
}
