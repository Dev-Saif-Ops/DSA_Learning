package saif;

import java.util.Scanner;

public class RectanglePeriCalci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height from the user
        System.out.print("Enter the length of the Rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the Rectangle ");
        double width = scanner.nextDouble();

        // Calculate the area of the triangle
        double Perimeter = 2 * (length + width);

        // Display the result
        System.out.println("The area of the triangle is: " + Perimeter);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
