package saif;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // The commented-out part is incomplete, so I'll comment it out for now.
//        for (int num=1; num <= 5; num += 2){
//            System.out.println(num);
//        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

////        for (int num = 1; num <= n; num++) {
////            System.out.println("Allahu_Akbar");
//        }
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;

        }

    }
}
