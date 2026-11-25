package com.lab;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderServiceTest {

    @Test
    void placingAnOrderReturnsTheTotalAndNotifiesTheCustomer() {
        List<String> sent = new ArrayList<>();
        OrderService service = new OrderService(new PriceService(), (to, message) -> sent.add(to + "|" + message));

        double total = service.place(new Order("A1", "ann@example.com", 10.0, 11));

        assertEquals(99.0, total, 0.001);
        assertEquals(1, sent.size());
        assertTrue(sent.get(0).startsWith("ann@example.com|Order A1 placed"));
    }
}
