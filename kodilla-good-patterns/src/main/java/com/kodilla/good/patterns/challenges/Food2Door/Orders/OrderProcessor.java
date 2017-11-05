package com.kodilla.good.patterns.challenges.Food2Door.Orders;


import com.kodilla.good.patterns.challenges.Food2Door.Dto.OrderDto;
import com.kodilla.good.patterns.challenges.Food2Door.Service.InformationService;
import com.kodilla.good.patterns.challenges.Food2Door.Service.OrderService;

public class OrderProcessor {
    private InformationService informationService ;
    private OrderService orderService;

    public OrderProcessor(final InformationService informationService, final OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto createOrderDto(Order order)
    {
        boolean isOrdered = orderService.order(order.getFoodProvider(), order.getQuantity(), order.getFoodType());

        if(isOrdered)
        {
            informationService.inform(order.getFoodProvider(), order);
            return new OrderDto(order, true);
        } else
        {
            return new OrderDto(order, false);
        }
    }
}
