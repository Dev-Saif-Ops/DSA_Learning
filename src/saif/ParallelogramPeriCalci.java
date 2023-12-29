package saif;

import java.util.Scanner;

public class ParallelogramPeriCalci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height from the user
        System.out.print("Enter the base of the Parallelogram: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the side of the Parallelogram: ");
        double side = scanner.nextDouble();

        // Calculate the area of the triangle
        double Perimeter = 2 * (base + side);

        // Display the result
        System.out.println("The area of the triangle is: " + Perimeter);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
