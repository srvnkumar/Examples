package com.sanguine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {

    @Test
    public void QuickSortTest(){
        int[] a = {1,4,3, 2,6};
        int[] expected = {1,2,3,4,6};
        new QuickSort().quickSort(a);
    }
}
