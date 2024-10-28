package com.sanguine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input = sc.next();
        System.out.println("Enter the substring length");
        int k = sc.nextInt();
        for(String s: getSubStrings(input, k))
        {
            System.out.println(s);
        }
    }

    public static List<String> getSubStrings(String input, int k){
        List<String> result = new ArrayList<>();
        for (int i=0; i<input.length()-k+1; i++){
            result.add(input.substring(i,i+k));
        }
        return result;
    }
}