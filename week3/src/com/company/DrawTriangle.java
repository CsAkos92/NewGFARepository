package com.company;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many lines of stars would you like to see?");
        int lineCount = scan.nextInt();

        for (int i = 1; i <= lineCount; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
