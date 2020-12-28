package com.company;

public class Bunnies {
    public static void main(String[] args) {
        System.out.println(bunnieEars(4));

    }

    public static int bunnieEars(int number) {
        if (number == 1) {
            return 2;

        } else {
            return 2 + bunnieEars(number - 1);
        }

    }
}
