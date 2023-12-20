package saif;

import java.util.Scanner;

public class ApnaCollegeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur 1st no: ");
        int a = sc.nextInt();
        System.out.println("Enter ur 2nd no: ");
        int b = sc.nextInt();

        if (a == b){
            System.out.println("Both r equal");
        } else if (a > b) {
            System.out.println("a is greater");

        } else {
            System.out.println("a is lesser");

        }
    }
}
