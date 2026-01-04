package ex_05_If_else;

import java.util.Scanner;

public class Lab013_LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Username");
        String usnm = sc.nextLine();

        System.out.println("Enter Password");
        String pwd = sc.nextLine();

        if (usnm.equals("admin") && (pwd.equals("1234"))) {
            System.out.println("Login Successful!");
        } else if (usnm.equals("admin") == false && pwd.equals("1234")) {
            System.out.println("Enter correct Username!");
        } else if (usnm.equals("admin") && pwd.equals("1234") == false) {
            System.out.println("Enter correct Password!");
        } else {
            System.out.println("Enter correct details!");

        }


    }
}



