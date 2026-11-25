package com.lab;

public class InvoiceService {
    private final PriceService prices;

    public InvoiceService(PriceService prices) {
        this.prices = prices;
    }

    public String line(Order order) {
        double net = prices.total(order.unitPrice(), order.quantity());
        double withTax = net * (1 + taxRate);
        return order.id() + ": " + String.format("%.2f", withTax);
    }
}
