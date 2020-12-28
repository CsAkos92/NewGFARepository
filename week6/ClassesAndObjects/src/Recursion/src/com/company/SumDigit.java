package com.company;

public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumDigit(123));

    }
    static int sumDigit(int number) {
        if(number > 0) {
            return number % 10 + sumDigit(number / 10);
        } else {
            return 0;
        }
    }
}
