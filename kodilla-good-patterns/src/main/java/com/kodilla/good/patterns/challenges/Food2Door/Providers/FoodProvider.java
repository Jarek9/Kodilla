package com.kodilla.good.patterns.challenges.Food2Door.Providers;

import com.kodilla.good.patterns.challenges.Food2Door.Orders.Order;

public interface FoodProvider {

    boolean process(Order order);
}
