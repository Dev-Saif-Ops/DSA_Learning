package saif;

import java.util.Scanner;

public class RhombusAreaCalci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the DiagonalP of Rhombus: ");
        double DiagonalP = in.nextDouble();

        System.out.println("Enter the Diagonalq of Rhombus: ");
        double Diagonalq = in.nextDouble();

        in.close();

        double area = 0.5 * DiagonalP * Diagonalq;

        System.out.println("The area of Rhombus is: " + area);


    }
}




