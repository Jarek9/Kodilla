package com.kodilla.good.patterns.challenges.Food2Door.Orders;

import com.kodilla.good.patterns.challenges.Food2Door.Providers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.Food2Door.Providers.FoodProvider;

public class OrderReceiver {

    public Order receive()
    {

        FoodProvider extraFoodShop = new ExtraFoodShop(49.90);
        Order extraFoodShopOrder = new Order(extraFoodShop, "Sojowe latte", 4, 49.90,
                199.60);
        return extraFoodShopOrder;

    }


}
