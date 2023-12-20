package saif;

import java.util.Scanner;

public class ApnaCollegeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur no: ");
        int no = sc.nextInt();

        if (no % 2 == 0){
            System.out.println("Even No");
        }else {
            System.out.println("Odd no");
        }
    }
}
