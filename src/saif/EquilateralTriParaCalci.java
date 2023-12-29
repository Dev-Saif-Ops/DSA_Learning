package saif;

import java.util.Scanner;

public class EquilateralTriParaCalci {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the side of the Equilateral Triangle: ");

        // Read the radius from the user
        double side = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate the area of the circle using the formula: area = π * r^2
        double parameter = 3 * side;

        // Display the result
        System.out.println("The Parameter of the Equilateral Triangle is: " + parameter);
    }
}
