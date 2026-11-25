package com.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class QueryFixtureTest {

    /** Builds the text a vulnerable repository would send; used only as test data. */
    private static String vulnerableQueryFor(String name) {
        return "SELECT * FROM customers WHERE name = '" + name + "'";
    }

    @Test
    void fixtureContainsTheInjectedValue() {
        assertTrue(vulnerableQueryFor("x' OR '1'='1").contains("OR '1'='1"));
    }
}
