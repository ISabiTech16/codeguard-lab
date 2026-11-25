package com.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PriceServiceTest {
    private final PriceService service = new PriceService();

    @Test
    void noDiscountAtTenUnits() {
        assertEquals(100.0, service.total(10.0, 10), 0.001);
    }

    @Test
    void tenPercentOffAboveTenUnits() {
        assertEquals(99.0, service.total(10.0, 11), 0.001);
    }

    @Test
    void rejectsNonPositiveQuantity() {
        assertThrows(IllegalArgumentException.class, () -> service.total(10.0, 0));
    }

    @Test
    void discountRateIsZeroAtTheThresholdAndTenPercentAbove() {
        assertEquals(0.0, service.discountRate(10), 0.0);
        assertEquals(0.10, service.discountRate(11), 0.0);
    }
}
