package com.sanguine;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 5};
        sort(a, 0, (a.length - 1));
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] arr, int l, int r) {

        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] a, int l, int m, int u) {

        int n1 = m - l + 1;// 2
        int n2 = u - m;//3

        int[] L = new int[n1];
        int[] U = new int[n2];
        // Copy data to temp arrays
        System.arraycopy(a, l, L, 0, n1);
        Arrays.setAll(U, j -> a[m + 1 + j]);

        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= U[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = U[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = U[j];
            j++;
            k++;
        }


    }
}
