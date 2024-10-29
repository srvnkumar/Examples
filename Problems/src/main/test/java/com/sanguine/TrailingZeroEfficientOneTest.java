package com.sanguine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TrailingZeroEfficientOneTest {
    @Test
    void findZeros(){
        assertEquals(2,TrailingZeroEfficientOne.find(10));
        assertEquals(24,TrailingZeroEfficientOne.find(100));
    }

    @Test
    void findZerosNegative(){
        assertNotEquals(1,TrailingZeroEfficientOne.find(10));
        assertNotEquals(22,TrailingZeroEfficientOne.find(100));
    }
}
