package com.saif;

import java.util.Scanner;

//Write an infinite loop using do while condition.

public class QuestionSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("This is a infinite loop. press'q' to quit.");
            System.out.print("Enter ur Cahracter: ");
            char input = in.next().charAt(0);

            if (input == 'q'){
                break;//break the loop when 'q' is entered.
            }
        }while (true);

        System.out.println("End of the program.");
    }

}
