package com.kodilla.good.patterns.challenges.Food2Door;


import com.kodilla.good.patterns.challenges.Food2Door.Orders.Order;
import com.kodilla.good.patterns.challenges.Food2Door.Orders.OrderProcessor;
import com.kodilla.good.patterns.challenges.Food2Door.Orders.OrderReceiver;
import com.kodilla.good.patterns.challenges.Food2Door.Service.SuppliersOrderService;
import com.kodilla.good.patterns.challenges.Food2Door.Service.MailService;

public class Main {

    public static void main(String[] args) {

        OrderReceiver orderReceiver = new OrderReceiver();

        Order order = orderReceiver.receive();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new SuppliersOrderService());
        orderProcessor.createOrderDto(order);

    }
}
