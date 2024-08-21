package com.sanguine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sort() {
        int[] a = {1,2,4,3,6,5};
        int[] b = {1,2,3,4,5,6};
        new SelectionSort().sort(a);
        assertArrayEquals(b,a);
    }
}