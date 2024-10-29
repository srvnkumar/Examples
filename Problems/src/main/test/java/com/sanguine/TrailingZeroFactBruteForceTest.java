package com.sanguine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrailingZeroFactBruteForceTest {

    @Test
    void findZeros(){
        assertEquals(2,TrailingZeroFactBruteForce.findTrailingZeros(10));
    }
}
