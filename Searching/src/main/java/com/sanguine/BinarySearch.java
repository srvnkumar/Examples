package com.sanguine;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(a, 0, a.length - 1, 1));
    }

    public static int binarySearch(int[] a, int low, int high, int n) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (a[mid] == n) {
                return mid;
            } else {
                if (a[mid] > n) {
                    return binarySearch(a, low, mid - 1, n);
                } else {
                    return binarySearch(a, mid + 1, high, n);
                }
            }
        }
        return -1;
    }


}
