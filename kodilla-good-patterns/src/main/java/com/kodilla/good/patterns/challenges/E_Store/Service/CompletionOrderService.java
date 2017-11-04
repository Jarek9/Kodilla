package com.kodilla.good.patterns.challenges.E_Store.Service;


import com.kodilla.good.patterns.challenges.E_Store.Products.Product;
import com.kodilla.good.patterns.challenges.E_Store.Users.User;

public class CompletionOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product)
    {
        System.out.println("Kompletowanie zamówienia dla: " + user.getName() + " " + user.getSurname()
                + ". Zamówienie: " + product.getProduct());

        return true;
    }



}
