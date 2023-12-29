package saif;

import java.util.Scanner;

public class IsoscelestriAreaCalci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height from the user
        System.out.print("Enter the base of the Iso-triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the Iso-triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
