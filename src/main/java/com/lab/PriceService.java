package com.lab;

public class PriceService {
    static final int BULK_THRESHOLD = 10;
    static final double BULK_RATE = 0.10;

    /** Discount rate for a quantity: 10% above ten units, otherwise none. */
    double discountRate(int quantity) {
        return quantity > BULK_THRESHOLD ? BULK_RATE : 0.0;
    }

    /** Total for a line. Ten or fewer units pay full price; more than ten get 10% off. */
    public double total(double unitPrice, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity must be positive");
        }
        double gross = unitPrice * quantity;
        return gross * (1.0 - discountRate(quantity));
    }
}
