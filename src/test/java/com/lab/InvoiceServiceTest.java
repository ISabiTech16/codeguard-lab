package com.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceServiceTest {

    @Test
    void invoiceLineShowsIdAndDiscountedTotal() {
        InvoiceService service = new InvoiceService(new PriceService());
        assertEquals("A1: 99.00", service.line(new Order("A1", "ann@example.com", 10.0, 11)));
    }
}
