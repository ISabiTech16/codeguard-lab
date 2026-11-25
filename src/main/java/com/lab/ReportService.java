package com.lab;

import java.util.List;

public class ReportService {
    private final PriceService prices;

    public ReportService(PriceService prices) {
        this.prices = prices;
    }

    public double revenue(List<Order> orders) {
        double sum = 0;
        for (Order o : orders) {
            sum += prices.total(o.unitPrice(), o.quantity());
        }
        return sum;
    }
}
