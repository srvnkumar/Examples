package com.sanguine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LcmBruteForceTest {

    @Test
    void lcmBothArePrime(){
        assertEquals(21, LcmBruteForce.lcm(3,7));
    }

    @Test
    void lcm(){
        assertEquals(8, LcmBruteForce.lcm(4,8));
    }

    @Test
    void lcm2(){
        assertEquals(12, LcmBruteForce.lcm(4,6));
    }
}
