package com.saif;

import java.util.Scanner;

//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

public class QuestionNineBonusOne {
    public static int greatestCommonDivisor(int a, int b){
        if (b == 0){
            return a;
        }else {
            return greatestCommonDivisor(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur first no: ");
        int a = in.nextInt();
        System.out.println("Enter ur second no: ");
        int b = in.nextInt();

        int gcd = greatestCommonDivisor(a, b);

        System.out.println("The greatest common divisor is: "+ gcd);
    }
}
