package com.kodilla.good.patterns.challenges.Food2Door.Dto;

import com.kodilla.good.patterns.challenges.Food2Door.Orders.Order;

public class OrderDto {

    private Order order;
    public boolean isOrdered;

    public OrderDto(Order order, boolean isOrdered) {
        this.order = order;
        this.isOrdered = isOrdered;
    }

    public Order getOrder() {
        return order;
    }


    public boolean isOrdered() {
        return isOrdered;
    }
}
