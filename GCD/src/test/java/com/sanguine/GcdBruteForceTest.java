package com.sanguine;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GcdBruteForceTest {

    @Test
    void gcd() {
        assertEquals(100, GcdBruteForce.gcd(100,200));
    }
}