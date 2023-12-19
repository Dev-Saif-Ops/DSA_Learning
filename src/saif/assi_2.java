package saif;

import java.util.Scanner;

public class assi_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");

        // Use the next method to get the input from the user
        String name = scanner.next();

        System.out.println("Welcome " + name);
    }
}