package saif;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur first no");
        int num1 = input.nextInt();
        System.out.println("Enter ur Second no");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}
