package com.sanguine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdEfficientOneRecursiveTest {

    @Test
    void gcd() {
        assertEquals(100, GcdEfficientOneRecursive.gcd(100,200));
    }

    @Test
    void gcd2() {
        assertEquals(2, GcdEfficientOneRecursive.gcd(4,6));
    }
}
