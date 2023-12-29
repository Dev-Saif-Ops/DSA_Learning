package saif;

import java.util.Scanner;

public class TwentyFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (enter 0 to stop): ");
        int num = in.nextInt();

        while (num != 0) {
            sum += num;
            System.out.println("Enter the number (enter 0 to stop): ");
            num = in.nextInt();
        }

        System.out.println("Sum of entered numbers: " + sum);
    }
}
