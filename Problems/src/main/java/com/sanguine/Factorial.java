package com.sanguine;

public class Factorial {

    public static long fact(int n){
        if(n <=0){
            return 1;
        }
        long factorial = 1;
        for(int i= 1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFact(int n) {
        if(n<=1)
            return 1;
        return n * recursiveFact(n-1);
    }
}
