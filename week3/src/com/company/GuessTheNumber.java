package com.company;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number");
        int guess = scan.nextInt();
        int number = 22;

        while (guess != number) {

            if(guess < number) {
                System.out.println("A tárolt szám nagyobb");
                guess = scan.nextInt();
            } else if ( guess > number) {
                System.out.println("A tárolt szám kisebb");
                guess = scan.nextInt();
            }
        }
        System.out.println("Eltaláltad a számot");




    }
}
