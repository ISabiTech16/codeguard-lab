package com.lab;

public class PriceService {

    /**
     * Total for a line, rounded to whole cents. Ten or fewer units pay full price; more than ten get 10% off.
     * Every invoice, report and order total goes through this method.
     */
    public double total(double unitPrice, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity must be positive");
        }
        double gross = unitPrice * quantity;
        double net = quantity > 10 ? gross * 0.9 : gross;
        return Math.round(net * 100.0) / 100.0;
    }
}
