package saif;

import java.util.Scanner;

public class SquarePeriCalci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height from the user
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

        double Perimeter = 4 * (side);

        // Display the result
        System.out.println("The area of the triangle is: " + Perimeter);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
