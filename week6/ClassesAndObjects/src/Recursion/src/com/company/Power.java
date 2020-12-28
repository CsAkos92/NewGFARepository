package com.company;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(3, 3));

    }
    static int power (int base, int n) {
        if (n > 1) {
            return base * power(base, n - 1);
        } else {
            return base;
        }

    }
}
