package ex_04_scanner_Kakashi;

import java.util.Scanner;

public class Lab010_Ternary_Operator_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you Nationality");
        String Nationality = sc.nextLine();

        System.out.println("Enter Your Age");
        int age = sc.nextInt();


        System.out.println("Enter your Salary");
        int salary = sc.nextInt();

        sc.nextLine();

        System.out.println("State name");
        String state = sc.nextLine();


        String youCanVote = Nationality.equals("Indian") && age >= 18 && salary > 15000 && state.equals("UP") ? "yes" : "No";
        System.out.println("Voting Status : "  + youCanVote );

        sc.close();

    }
}
