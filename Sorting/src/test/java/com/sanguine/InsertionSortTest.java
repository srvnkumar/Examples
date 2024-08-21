package com.sanguine;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @org.junit.jupiter.api.Test
    void insertionSort() {
        int[] a = {1, 3, 4, 2, 6};
        new InsertionSort().insertionSort(a);
        int[] b = {1, 2, 3, 4, 6};
        assertArrayEquals(b, a);
    }

    @Test
    void insertionSort2() {
        int[] a = {1, 3, 4, 2, 6};
        new InsertionSort().insertionSort2(a);

        int[] b = {1, 2, 3, 4, 6};
        assertArrayEquals(b, a);
    }
}