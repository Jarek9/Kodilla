package com.kodilla.good.patterns.challenges.E_Store.Orders;

import com.kodilla.good.patterns.challenges.E_Store.Dto.OrderDto;
import com.kodilla.good.patterns.challenges.E_Store.Service.InformationService;
import com.kodilla.good.patterns.challenges.E_Store.Service.OrderService;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest)
    {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if(isOrdered)
        {
            informationService.inform(orderRequest.getUser());
            orderRepository.closeOrder(orderRequest.getUser(),orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        }else
        {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
