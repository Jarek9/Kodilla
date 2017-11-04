package com.kodilla.good.patterns.challenges.E_Store;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new CompletionOrderService(), new ProductOrderRepository());
        productOrderService.process(orderRequest);



    }
}
