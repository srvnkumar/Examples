package com.sanguine;

public class InsertionSort {

    public int[] insertionSort(int[] a){
        int temp =0;
        for(int i=0; i<a.length;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }


}
