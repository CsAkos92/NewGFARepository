package com.company;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines of stars would you like to see?");
        int number = scan.nextInt();
        number /=2;
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m = 0; m <= number; m++) {
            for (int n = 0; n <= m; n++) {
                System.out.print(" ");
            }
            for (int o = number; o > m; o--) {
                System.out.print("*");
            }
            for (int p = number; p > m; p--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
