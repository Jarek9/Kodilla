package com.kodilla.good.patterns.challenges.Food2Door.Suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.Orders.Order;

public class ExtraFoodShop implements FoodProvider {

    private double price;


    public ExtraFoodShop(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean process(Order order) {
        System.out.println("ExtraFoodShop " + order + " is ready for the shipment");
        return true;
    }


}
