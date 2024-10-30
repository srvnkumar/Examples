package com.sanguine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdEfficientOneTest {


    @Test
    void gcd() {
        assertEquals(100, GcdEfficientOne.gcd(100,200));
    }
}
