package saif;

import java.util.Scanner;

public class ParallelogramAreaCalci {   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the Base of Parallelogram: ");
    double Base = in.nextDouble();

    System.out.println("Enter Height of Parallelogram: ");
    double Height = in.nextDouble();

    in.close();

    double area = Base * Height;

    System.out.println("The area of Parallelogram is: " + area);


}
}



