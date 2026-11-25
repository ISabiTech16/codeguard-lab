package com.lab;

/**
 * Prices order lines.
 *
 * <p>Bulk discount: more than ten units get 10% off.
 */
public class PriceService {

    /** Total for a line. Ten or fewer units pay full price; more than ten get 10% off. */
    public double total(double unitPrice, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity must be positive");
        }
        double gross = unitPrice * quantity;
        return quantity > 10 ? gross * 0.9 : gross;
    }
}
