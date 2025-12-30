package ex_04_scanner_Kakashi;

import java.util.Scanner;

public class Lab008_bankLoan_Roperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        int age = sc.nextInt();

        System.out.println("Enter Salary");
        int sal = sc.nextInt();

        boolean C1 = age >= 18;
        boolean C2 = sal >= 30000;
        boolean bothTrue = C1 && C2;

        if (C1) {
            System.out.println("Eligible by Age");
        }
        if (C2) {
            System.out.println("Eligible by Salary");
        }
        if (bothTrue){
            System.out.println("Loan eligible");
        }
        sc.close();

    }
}
