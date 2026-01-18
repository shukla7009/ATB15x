package ex_06_statement_and_conditions;

import java.util.Scanner;

public class Lab016_selectBrowser {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to browser testing");
        System.out.println("Name your Browser");

        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){
            case "chrome" :
                System.out.println("Chrome test cases will be executed");
                break;
            case "firefox" :
                System.out.println("Firefox Test cases will be executed");
                break;
            case "edge" :
                System.out.println("Edge test cases will be executed");
                break;
            default:
                System.out.println("Enter Valid browser");

        }

    }
}
