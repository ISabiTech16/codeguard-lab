package com.lab;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReportServiceTest {

    @Test
    void revenueIsTheSumOfOrderTotals() {
        ReportService service = new ReportService(new PriceService());
        double revenue = service.revenue(List.of(
                new Order("A1", "a@example.com", 10.0, 10),
                new Order("A2", "b@example.com", 10.0, 11)));
        assertEquals(199.0, revenue, 0.001);
    }
}
