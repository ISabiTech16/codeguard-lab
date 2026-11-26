package com.lab;

public class PriceService {

    /** Total for a line. Ten or more units count as a bulk order and get 10% off. */
    public double total(double unitPrice, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity must be positive");
        }
        double gross = unitPrice * quantity;
        return quantity >= 10 ? gross * 0.9 : gross;
    }
}
