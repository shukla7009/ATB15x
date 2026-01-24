package ex_10_Strings_2D;

import java.util.Scanner;

public class Lab034_right_triangle_star {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of rows you want!");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            for (int j =0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
