package com.kodilla.good.patterns.challenges.E_Store;

import com.kodilla.good.patterns.challenges.E_Store.Orders.OrderRequest;
import com.kodilla.good.patterns.challenges.E_Store.Orders.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.E_Store.Orders.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.E_Store.Orders.ProductOrderService;
import com.kodilla.good.patterns.challenges.E_Store.Service.CompletionOrderService;
import com.kodilla.good.patterns.challenges.E_Store.Service.MailService;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new CompletionOrderService(), new ProductOrderRepository());
        productOrderService.process(orderRequest);

    }
}
