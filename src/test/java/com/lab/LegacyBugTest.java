package com.lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** A known, long-standing failure that exists on this branch before any pull request touches it. */
class LegacyBugTest {

    @Test
    void knownBrokenBehaviour() {
        assertEquals(2, 1 + 2);
    }
}
