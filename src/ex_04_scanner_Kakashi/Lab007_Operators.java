package ex_04_scanner_Kakashi;
import java.util.Scanner;


public class Lab007_Operators
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a ");
        Integer a = sc.nextInt();

        System.out.println("Enter number b ");
        Integer b = sc.nextInt();

        int add = a + b;
        int diff = a - b;
        int product = a * b;
        double div = a / b;
        int Rem = a % b;

        System.out.println("Addition " + add);
        System.out.println("Difference " + diff);
        System.out.println("Multiplication " + product);
        System.out.println("Division " + div);
        System.out.println("Remainder " + Rem);

    }
}
