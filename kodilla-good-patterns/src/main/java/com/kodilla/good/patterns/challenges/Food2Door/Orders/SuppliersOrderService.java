package com.kodilla.good.patterns.challenges.Food2Door.Orders;

import com.kodilla.good.patterns.challenges.Food2Door.Service.OrderService;
import com.kodilla.good.patterns.challenges.Food2Door.Providers.FoodProvider;

public class SuppliersOrderService implements OrderService {
    @Override
    public boolean order(FoodProvider FoodProvider, int Quantity, String product) {
        return true;
    }
}
