package com.company;

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many line of symbols would you like to see?");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            if(i % 2 == 1) {
                for (int j = 1; j <= number; j++) {
                    if (j % 2 == 1) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 1; j <= number; j++) {
                    if (j % 2 == 0) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
