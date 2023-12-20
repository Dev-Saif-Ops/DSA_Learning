package saif;

import java.util.Scanner;

public class CalciApnaCollege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER UR 1ST NO: ");
        int a = sc.nextInt();
        System.out.println("ENTER UR 2ND NO: ");
        int b = sc.nextInt();
        int operator = sc.nextInt();

        switch (operator){
            case 1: System.out.println(a + b);
            break;
            case 2: System.out.println(a - b);
            break;
            case 3: System.out.println(a * b);
            break;
            case 4: if (b == 0){
                System.out.println("Invalid division");
            }else{
                System.out.println(a / b);
            }
            case 5: if (b == 0){
                System.out.println("Invalid division");
            }else{
                System.out.println(a % b);
            }
            default:
                System.out.println("Invalid Operator");
        }
    }
}
