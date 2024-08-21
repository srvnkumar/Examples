package com.sanguine;

public class InsertionSort {

    public void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            /*
             Move elements of arr[0..i-1], that are
             greater than key, to one position ahead
             of their current position
             */
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        print(a);
    }

    public static void print(int[] a){
        for(int i: a){
            System.out.println(i);
        }
    }
}
