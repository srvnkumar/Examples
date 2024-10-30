package com.sanguine;

import static java.lang.Boolean.TRUE;

public class LcmBruteForce {
    public static int lcm(int a, int b) {
        int res = Math.max(a,b);
        while(TRUE){
            if(res%a ==0 && res%b == 0){
                break;
            }
            res++;
        }
        return res;
    }
}
