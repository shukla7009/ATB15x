package ex_03_scanner_Kakashi;
import java.util.Scanner;

public class Lab006_scanner_biodata {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        Integer age = sc.nextInt();
        sc.nextLine();

        System.out.println("Your fav Food");
        String Food = sc.nextLine();

        System.out.println("What is your pet name?");
        String Pet = sc.nextLine();

        System.out.println("What is your weight?");
        Double Weight = sc.nextDouble();

        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("food " + Food);
        System.out.println("Pet " + Pet);
        System.out.println("Weight " + Weight);

        sc.close();
    }
}
