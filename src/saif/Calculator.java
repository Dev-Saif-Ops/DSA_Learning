package saif;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the Operator (X to exit): ");
            char op = in.next().trim().charAt(0);


            if (op == 'x' || op == 'X') {
                break;
            }

            // Input two numbers
            System.out.println("Enter two Numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            switch (op) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;  // Skip the rest of the loop and start a new iteration
                    }
                    break;
                case '%':
                    ans = num1 % num2;
                    break;
                default:
                    System.out.println("Invalid Operation!!");
                    continue;  // Skip the rest of the loop and start a new iteration
            }

            System.out.println("Result: " + ans);
        }
    }
}
