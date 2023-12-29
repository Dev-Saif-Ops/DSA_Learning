package saif;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your First number: ");
        int num1 = in.nextInt();

        System.out.println("Enter your Second number: ");
        int num2 = in.nextInt();

        // Perform addition
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
