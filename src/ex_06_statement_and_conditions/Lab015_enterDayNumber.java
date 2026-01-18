package ex_06_statement_and_conditions;

import java.util.Scanner;

public class Lab015_enterDayNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day number from 1 to 7");


        if (sc.hasNextInt()) {
            int day = sc.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tues");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter number between 1 to 7");
            }
        }
        else {
            System.out.println("Enter Valid number");
        }
        System.out.println("End of program");
        sc.close();
    }

}
