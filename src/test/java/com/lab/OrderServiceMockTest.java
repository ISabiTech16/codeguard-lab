package com.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrderServiceMockTest {

    @Test
    void orderTotalComesFromThePriceService() {
        PriceService prices = mock(PriceService.class);
        NotificationSender sender = mock(NotificationSender.class);
        when(prices.total(10.0, 20)).thenReturn(5.0);

        OrderService service = new OrderService(prices, sender);

        assertEquals(5.0, service.place(new Order("B1", "bob@example.com", 10.0, 20)), 0.001);
    }
}
