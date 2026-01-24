package ex_08_Strings;

import java.util.Scanner;

public class Lab025_stringsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        String user_input = sc.next();

        String reverse_string = "";

        for (int i = user_input.length() - 1 ; i >=0 ; i --){
            reverse_string = reverse_string + user_input.charAt(i);
        }

        if (reverse_string.equalsIgnoreCase(user_input)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();



    }
}
