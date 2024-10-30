package com.sanguine;

public class GcdEfficientOneRecursive {
    public static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcd(a, a%b);//Euclidian Algorithm
    }
}
