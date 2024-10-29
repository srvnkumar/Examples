package com.sanguine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void fact() {
        assertEquals(1,Factorial.fact(1));
        assertEquals(2, Factorial.fact(2));
        assertEquals(120, Factorial.fact(5));
    }
    @Test
    void invalidTestCase() {
        assertNotEquals(2,Factorial.fact(1));
    }
}