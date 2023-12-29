package saif;

import java.util.Scanner;

public class RectangleAreaCalci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Lentgh of Rectangle: ");
        double lentgh = in.nextDouble();

        System.out.println("Enter the Width: ");
        double Width = in.nextDouble();

        in.close();

        double area = lentgh * Width;

        System.out.println("The area of Rectangle is: " + area);


    }
}
