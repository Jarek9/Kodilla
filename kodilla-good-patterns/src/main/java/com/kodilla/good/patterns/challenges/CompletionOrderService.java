package com.kodilla.good.patterns.challenges;


public class CompletionOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product)
    {
        System.out.println("Kompletowanie zamówienia dla: " + user.getName() + " " + user.getSurname()
                + ". Zamówienie: " + product.getProduct());

        return true;
    }



}
