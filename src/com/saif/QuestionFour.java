package com.saif;

import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle.

public class QuestionFour {
    public static double circumferenceOfCircle(int r){
        double Circumference = 2 * Math.PI * r;
        return Circumference;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        int r = in.nextInt();

        double result = circumferenceOfCircle(r);
        System.out.println("The Circumference is: "+ result);
    }
}
