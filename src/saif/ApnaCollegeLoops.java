package saif;

import java.util.Scanner;

public class ApnaCollegeLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur no: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(n*i);
        }
    }
}
