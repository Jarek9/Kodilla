package com.kodilla.good.patterns.challenges.Food2Door.Service;

import com.kodilla.good.patterns.challenges.Food2Door.Orders.Order;
import com.kodilla.good.patterns.challenges.Food2Door.Providers.FoodProvider;

public class MailService implements InformationService{
    @Override
    public void inform(FoodProvider FoodProvider, Order order) {
        if(FoodProvider.process(order)) {
            System.out.println("Your order has been realized.");
        } else
        {
            System.out.println("Sorry but this product is not available");
        }
    }
}
