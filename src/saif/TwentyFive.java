package saif;

import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers (enter 0 to stop): ");

        int num = in.nextInt();
        int largest = num;

        while (num != 0) {
            if (num > largest) {
                largest = num;
            }

            System.out.println("Enter the number (enter 0 to stop): ");
            num = in.nextInt();
        }

        System.out.println("Largest number entered: " + largest);
    }
}