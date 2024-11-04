package com.sanguine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeTest {
    @Test
    void testPrime(){
        assertTrue(Prime.isPrime(2));
    }

    @Test
    void testNNotPrime(){
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
    }
    @Test
    void testPrimeEfficient(){
        assertTrue(Prime.isPrimeEfficient(2));
    }

    @Test
    void testNNotPrimeEfficient(){
        assertFalse(Prime.isPrimeEfficient(1));
        assertFalse(Prime.isPrimeEfficient(4));
    }

}
