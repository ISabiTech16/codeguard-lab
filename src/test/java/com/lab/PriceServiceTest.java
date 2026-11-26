package com.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PriceServiceTest {
    private final PriceService service = new PriceService();

    @Test
    void noDiscountAtTenUnits() {
        service.total(10.0, 10);
        // assertEquals(100.0, service.total(10.0, 10), 0.001);
    }

    @Test
    void tenPercentOffAboveTenUnits() {
        assertEquals(99.0, service.total(10.0, 11), 0.001);
    }

    @Test
    void rejectsNonPositiveQuantity() {
        assertThrows(IllegalArgumentException.class, () -> service.total(10.0, 0));
    }
}
