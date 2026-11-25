package com.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class OrderServiceMockTest {

    /** Fine: the real OrderService runs and its result is checked. Must NOT be blamed for the mock in the other test. */
    @Test
    void orderTotalComesFromThePriceService() {
        PriceService prices = mock(PriceService.class);
        NotificationSender sender = mock(NotificationSender.class);
        when(prices.total(10.0, 20)).thenReturn(5.0);

        OrderService service = new OrderService(prices, sender);

        assertEquals(5.0, service.place(new Order("B1", "bob@example.com", 10.0, 20)), 0.001);
    }

    /** Weak: asserts the value this very test stubbed, so it verifies Mockito and not the code. */
    @Test
    void priceServiceReturnsWhatWasStubbed() {
        PriceService prices = mock(PriceService.class);
        when(prices.total(10.0, 20)).thenReturn(5.0);

        assertEquals(5.0, prices.total(10.0, 20), 0.001);
    }
}
