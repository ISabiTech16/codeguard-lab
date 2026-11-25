package com.lab;

public class OrderService {
    private final PriceService prices;
    private final NotificationSender sender;

    public OrderService(PriceService prices, NotificationSender sender) {
        this.prices = prices;
        this.sender = sender;
    }

    public double place(Order order) {
        double total = prices.total(order.unitPrice(), order.quantity());
        sender.send(order.customer(), "Order " + order.id() + " placed, total " + String.format("%.2f", total));
        return total;
    }
}
