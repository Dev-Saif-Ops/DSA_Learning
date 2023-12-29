package saif;

import java.util.Scanner;

public class TwwntyTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        // Calculate the product and sum of digits
        int product = calculateProductOfDigits(number);
        int sum = calculateSumOfDigits(number);

        // Calculate the result by subtracting the product from the sum
        int result = sum - product;

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner
        in.close();
    }

    // Function to calculate the product of digits of a number
    private static int calculateProductOfDigits(int num) {
        int product = 1;
        while (num != 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }

    // Function to calculate the sum of digits of a number
    private static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
