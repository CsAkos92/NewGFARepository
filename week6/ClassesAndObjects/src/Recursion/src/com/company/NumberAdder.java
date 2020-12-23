package com.company;

public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(numberAdder(4));
    }

    static int numberAdder(int number) {
        if(number == 1) {
            return number;
        } else {
            return number + numberAdder(number - 1);
        }
    }
}
