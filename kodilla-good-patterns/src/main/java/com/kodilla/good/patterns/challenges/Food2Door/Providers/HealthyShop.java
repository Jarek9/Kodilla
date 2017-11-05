package com.kodilla.good.patterns.challenges.Food2Door.Providers;

import com.kodilla.good.patterns.challenges.Food2Door.Orders.Order;

public class HealthyShop implements FoodProvider {

    private double price;


    public HealthyShop(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean process(Order order) {
        System.out.println("Your order is ready for the shipment");
        return true;
    }

}
