package ex_05_If_else;

import java.util.Scanner;

public class Lab014_leapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year");
        int Year = sc.nextInt();

        if (Year % 400 == 0 || Year % 4 == 0 && Year % 100 != 0) {
            System.out.println("It is a Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}

