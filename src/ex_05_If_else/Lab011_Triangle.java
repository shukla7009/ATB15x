package ex_05_If_else;

import java.util.Scanner;

public class Lab011_Triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of First side of a triangle");
        int side1 = sc.nextInt();

        System.out.println("Enter Length of Second side of a triangle");
        int side2 = sc.nextInt();

        System.out.println("Enter Length of Third side of a triangle");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("It is an Equilateral triangle");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Isosceles Triangle");

        } else {
            System.out.println("Scalene triangle");
        }


        sc.close();
    }
}
