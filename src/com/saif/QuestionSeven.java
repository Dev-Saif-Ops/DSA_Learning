package com.saif;

import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char userChoice;

        while (true) {
            System.out.println("Enter a number: ");
            int number = in.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.println("Do you want to enter another number? (y/n): ");
            userChoice = in.next().charAt(0);

            if (userChoice == 'n' || userChoice == 'N') {
                break;
            } else if (userChoice == 'y' || userChoice == 'Y') {
                continue;
            }
        }

        // Display the counts
        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zero numbers: " + zeroCount);
    }
}


