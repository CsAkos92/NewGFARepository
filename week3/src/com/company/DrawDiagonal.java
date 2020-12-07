package com.company;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines of symbols would you like to see?");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print("%");
        }
        System.out.println();

        for (int j = 1; j < number - 1; j++) {
            for (int k = 0; k < number; k++) {
                if (k == 0 || k == j || k == number - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= number; i++) {
            System.out.print("%");
        }


    }
}
