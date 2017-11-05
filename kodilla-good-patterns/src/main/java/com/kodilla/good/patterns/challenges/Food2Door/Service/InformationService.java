package com.kodilla.good.patterns.challenges.Food2Door.Service;

import com.kodilla.good.patterns.challenges.Food2Door.Orders.Order;
import com.kodilla.good.patterns.challenges.Food2Door.Providers.FoodProvider;

public interface InformationService {

    void inform(FoodProvider FoodProvider, Order order);
}
