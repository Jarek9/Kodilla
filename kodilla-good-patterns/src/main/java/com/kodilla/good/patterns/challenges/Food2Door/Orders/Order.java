package com.kodilla.good.patterns.challenges.Food2Door.Orders;

import com.kodilla.good.patterns.challenges.Food2Door.Providers.FoodProvider;

public class Order {

    private FoodProvider FoodProvider;
    private String foodType;
    private int quantity;
    private double price;
    private double orderValue = quantity * price;

    public Order(FoodProvider FoodProvider, String foodType, int quantity, double price,
                 double orderValue) {
        this.FoodProvider = FoodProvider;
        this.foodType = foodType;
        this.quantity = quantity;
        this.price = price;
        this.orderValue = orderValue;
    }

    public FoodProvider getFoodProvider() {
        return FoodProvider;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getQuantity() {
        return quantity;
    }


    @Override
    public String toString() {
        return "Order{" +
                "foodType='" + foodType + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", orderValue=" + orderValue +
                '}';
    }
}

