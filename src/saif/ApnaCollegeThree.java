package saif;

import java.util.Scanner;

public class ApnaCollegeThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your no: ");
        int no = sc.nextInt();

//        if (no == 1){
//            System.out.println("Hello");
//        } else if (no == 2) {
//            System.out.println("Salaam");
//        } else if (no == 3){
//            System.out.println("Bonjour");
//        } else{
//            System.out.println("Invalid !!");
//        }
        switch (no){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Salam");
                break;
            case 3 :
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid !!");
        }

    }
}
