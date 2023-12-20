package com.saif;

import java.util.Scanner;

public class QuestionTenBonusTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur no n: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci series of " + n + " terms: ");

        System.out.print(a + " " + b + " ");

        int count = 2;

        while (count < n){
            int temp = b;
            b = b+a;
            a = temp;
            System.out.print(b + " ");
            count++;
        }
    }
}
