package com.sanguine;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 6, 5};
        quicksort(a, 0, a.length - 1);
        Arrays.stream(a).forEach(System.out::println);
    }

    private static void quicksort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quicksort(a, low, pi - 1);
            quicksort(a, pi + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int piviot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < piviot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, high);
        return i + 1;

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
