package com.sanguine;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        System.out.println(countOfDigits(number));

    }

    private static int countOfDigits(int number) {
        if(number <= 0){
            return 0;
        }
        int count =0;
        while(number >0){
            count++;
            number = number / 10;
        }
        return count;

    }


}
