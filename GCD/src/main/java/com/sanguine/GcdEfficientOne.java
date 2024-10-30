package com.sanguine;

public class GcdEfficientOne {
    public static int gcd(int a, int b) {
        while(a!=b){
            if( a < b){
                b = b - a;
            }else{
                 a = a - b;
            }
        }
        return a;
    }
}
