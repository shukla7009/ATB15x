package ex_05_If_else;

import java.util.Scanner;

public class Lab012_Number_Classification {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int A = sc.nextInt();

        if (A > 0) {
            System.out.println("Positive Number");
        }
        else if ( A < 0) {
            System.out.println("Negative Number");
        }
        else System.out.println("Number is zero");
    }
}
