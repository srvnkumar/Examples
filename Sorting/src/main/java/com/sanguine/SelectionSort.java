package com.sanguine;

import static com.sanguine.InsertionSort.print;

public class SelectionSort {

    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min_idx = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
        print(a);
    }
}
