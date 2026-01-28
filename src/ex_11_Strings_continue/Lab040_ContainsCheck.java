package ex_11_Strings_continue;

import java.util.Scanner;

public class Lab040_ContainsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        if (msg.contains("login") && msg.contains("successfully") && msg.contains("done")){
            System.out.println("yup");
        }
        else System.out.println("no");

        sc.close();
    }

}