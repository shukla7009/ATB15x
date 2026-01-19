package ex_07_loops;

import java.util.Scanner;

public class Lab023_factorial {
    public static void main(String[] args) {
        System.out.println("Factorial program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Positive Integer - ");

        int fact = 1;

        if(sc.hasNextInt()){
            int n = sc.nextInt();

            for (int i=1; i<=n; i++) {
                fact = fact*i;}
            System.out.println("Factorial is =>"+fact);
        }
        else
        {
            System.out.println("Enter valid int Value");
        }
        sc.close();
    }
}

