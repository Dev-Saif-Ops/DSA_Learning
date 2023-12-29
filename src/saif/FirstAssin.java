package saif;

import java.util.Scanner;

public class FirstAssin {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // Read the radius from the user
        double radius = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the area of the circle using the formula: area = π * r^2
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
