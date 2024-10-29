package com.sanguine;

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check its a palindrome or not");
        int number = sc.nextInt();
        System.out.println("Given number "+number+" is Palindrome?: "+(isPalindrome(number)?"TRUE":"FALSE"));
    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int sum = 0;
        while( temp > 0 ){
            sum = (temp % 10 ) + sum * 10;
            temp = temp / 10;
        }
        return sum==number;
    }
}
