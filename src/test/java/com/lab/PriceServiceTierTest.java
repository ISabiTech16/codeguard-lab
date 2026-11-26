package com.lab;

import org.junit.jupiter.api.Test;

class PriceServiceTierTest {

    @Test
    void goldTierRuns() {
        PriceService service = new PriceService();
        service.total(10.0, 20, "GOLD");
    }

    @Test
    void standardTierRuns() {
        PriceService service = new PriceService();
        service.total(10.0, 20, "STANDARD");
    }
}
