package saif;

import java.util.Scanner;

public class FactorsCalci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = in.nextInt();

        System.out.println("Factors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
