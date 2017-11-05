package com.kodilla.good.patterns.challenges.Food2Door.Service;

import com.kodilla.good.patterns.challenges.Food2Door.Providers.FoodProvider;

public interface OrderService {

    boolean order(FoodProvider FoodProvider, int Quantity, String product);
}
