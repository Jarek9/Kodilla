package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrive()
    {
        User user = new User("Jan", "Kowalski");
        Product product = new Product("Szczoteczka do zębów");

        return new OrderRequest(user, product);
    }



}
