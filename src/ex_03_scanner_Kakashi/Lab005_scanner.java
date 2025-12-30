package ex_03_scanner_Kakashi;
import java.util.Scanner;

public class Lab005_scanner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your height");
        double height = sc.nextDouble();

        System.out.println("Hello " + name );
        System.out.println("your age is " + age);
        System.out.println("Height is " +height);

        sc.close();
    }

}
