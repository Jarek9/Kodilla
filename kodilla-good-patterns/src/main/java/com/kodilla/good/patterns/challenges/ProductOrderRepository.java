package com.kodilla.good.patterns.challenges;


public class ProductOrderRepository implements OrderRepository {

    @Override
    public void closeOrder(User user, Product product) {
        System.out.println("Transakcja zakończona sukcesem");
    }
}
