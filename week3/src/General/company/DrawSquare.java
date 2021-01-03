package com.company;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines of symbols would you like to see?");
        int number = scan.nextInt();
        for (int j = 1; j <= number; j++) {
            System.out.print("%");
        }
        System.out.println();
        for (int k = 0; k < number - 2; k++) {
            for (int i = 0; i < number; i++) {
                if (i == 0 || i == number - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
        }
            System.out.println("");
        }

        for (int j = 1; j <= number; j++) {
            System.out.print("%");
        }

    }
}
