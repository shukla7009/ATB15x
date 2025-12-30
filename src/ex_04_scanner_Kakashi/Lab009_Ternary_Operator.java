package ex_04_scanner_Kakashi;

import java.util.Scanner;

public class Lab009_Ternary_Operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age");
        int age = sc.nextInt();

        String canAmolGotoGoa = age >= 18 ? "Yes" : "No";
        System.out.println("Can Amol go to Goa? " + canAmolGotoGoa);

        sc.close();

    }
}
