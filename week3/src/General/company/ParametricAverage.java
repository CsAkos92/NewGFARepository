package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to give?");
        int number = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            System.out.println("The " + i + "th number:");
            int tmp = scan.nextInt();
            list.add(tmp);
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The mean is: " + sum / list.size());


    }
}
