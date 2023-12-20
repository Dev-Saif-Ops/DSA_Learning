package com.saif;

import java.util.Scanner;

//Write a function which takes in 2 numbers and returns the greater of those two.

public class QuestionThree {
    public static int greaterNo(int a, int b){
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur first no: ");
        int a = in.nextInt();
        System.out.println("Enter ur second no: ");
        int b = in.nextInt();

        int result = greaterNo(a, b);
        System.out.println("The greater no is: "+ result);
    }
}
