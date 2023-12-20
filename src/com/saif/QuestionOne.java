package com.saif;

import java.util.Scanner;

//Enter 3 numbers from the user & make a function to print their average.

public class QuestionOne {

    //Function for returning
    public static double averageOfThree(double n1, double n2, double n3 ) {
        return (n1 + n2 + n3) / 3;
    }
    //Original Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input First no
        System.out.println("Enter ur first no: ");
        int n1 = sc.nextInt();
        //Input Second no
        System.out.println("Enter ur first no: ");
        int n2 = sc.nextInt();
        //Input Third no
        System.out.println("Enter ur first no: ");
        int n3 = sc.nextInt();
        //Call the Function
        double average = averageOfThree(n1, n2, n3);
        //print average
        System.out.println("The Average is: "+ average);

    }
}
