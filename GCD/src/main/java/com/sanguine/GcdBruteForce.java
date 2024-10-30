package com.sanguine;

public class GcdBruteForce {
    public static int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res != 0){
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res = res -1;
        }
        return res;
    }
}
