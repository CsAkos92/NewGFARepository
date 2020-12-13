package com.company;

import javax.naming.CannotProceedException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            System.out.println(devide());
        } catch (ArithmeticException e) {
            System.out.println("'Hiba történt, 0-val való osztást próbáltál meg!");
            e.printStackTrace();
        }

    }

    public static int devide () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Add a number!");
        int number = scan.nextInt();
        return 10 / number;

    }
}

