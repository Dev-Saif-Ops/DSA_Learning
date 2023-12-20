package com.saif;

import java.util.Scanner;

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
public class QuestionEight {
    public static int valueRaised(int x, int n){
        return (int) Math.pow(x, n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base no: ");
        int x = in.nextInt();
        System.out.println("Enter the exponent no: ");
        int n = in.nextInt();

        int result = valueRaised(x, n);
        System.out.println("The result is: "+ result);
    }
}
