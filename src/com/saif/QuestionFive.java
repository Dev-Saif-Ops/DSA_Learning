package com.saif;

import java.util.Scanner;

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public class QuestionFive {
    public static int votingAge(int age){
        int eligableAge = 18;
        if (age >= eligableAge){
            System.out.println("Congrats u r Eligable!!!");
        }else {
            System.out.println("No u r NOT!!!");
        }
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur age: ");
        int age = sc.nextInt();

        votingAge(age);
    }
}
