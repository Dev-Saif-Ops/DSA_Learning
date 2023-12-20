package com.saif;

import java.util.Scanner;

//Write a function to print the sum of all odd numbers from 1 to n.

public class QuestionTwo {
    //Create the function
    public static int sumOfOdd(int n){
        int sum =0;

        for (int i = 1; i <= n; i += 2){
            sum +=i;
        }
        return sum;
    }
    //original function
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur no: ");
        int n = in.nextInt();

        int result = sumOfOdd(n);
        System.out.println("Sum of odd numbers " + n + " is: " + result);

    }
}
