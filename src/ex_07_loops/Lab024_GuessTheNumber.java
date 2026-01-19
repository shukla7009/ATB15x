package ex_07_loops;

import java.util.Random;
import java.util.Scanner;
public class Lab024_GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numToGuess = rd.nextInt(100);
        int guess;
        int attempt = 0;
        System.out.println("Enter number between 1 to 100");
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("invalid Input");
                sc.next();
                continue;
            }
            guess = sc.nextInt();
            attempt ++;

            if (guess < numToGuess) {
                System.out.println("Number is Too Low");
                System.out.println("Attempts - " +attempt);
            } else if (guess > numToGuess) {
                System.out.println("Number is too High");
                System.out.println("Attempts - " +attempt);
            } else {
                System.out.println("correct Answer");
                System.out.println("Attempts - " +attempt);
                break;
            }
        }
    }
 }

