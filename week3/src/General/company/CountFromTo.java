package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your first number is:");
        int number1 = scan.nextInt();
        System.out.println("Your second number is:");
        int number2 = scan.nextInt();
        if (number1 >= number2) {
            System.out.println("The second number has to be bigger.");
        }
        else {
            for (int i = number1; i <= number2; i++) {
                System.out.println(i);
            }
        }
    }
}
