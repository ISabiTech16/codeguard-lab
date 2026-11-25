package com.lab;

public class InvoiceService {
    private final PriceService prices;

    public InvoiceService(PriceService prices) {
        this.prices = prices;
    }

    public String line(Order order) {
        return order.id() + " - " + String.format("%.2f", prices.total(order.unitPrice(), order.quantity()));
    }
}
