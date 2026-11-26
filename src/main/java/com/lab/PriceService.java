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

    /** Gold members get a further 5% off the discounted total; everyone else pays the plain total. */
    public double total(double unitPrice, int quantity, String tier) {
        double base = total(unitPrice, quantity);
        return "GOLD".equals(tier) ? base * 0.95 : base;
    }
}
