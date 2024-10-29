package com.sanguine;

public class TrailingZeroFactBruteForce {
    public static int findTrailingZeros(int num) {
        int res = 1;
        for(int i=2; i<=num; i++){
            res *= i;
        }
        int count= 0;
        while(res % 10 == 0){
            count++;
            res = res /10;
        }
        return count;
    }
}
