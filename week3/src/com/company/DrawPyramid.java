package com.company;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines of stars would you like to see?");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i  ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
