package com.company;

public class Bunnies2 {
    public static void main(String[] args) {
        System.out.println(bunnieEars(5));

    }
    public static int bunnieEars(int bunnies) {
        if(bunnies == 1) {
            return 2;
        } else if(bunnies % 2 == 1) {
            return 2 + bunnieEars(bunnies - 1);
        } else {
            return 3 + bunnieEars(bunnies - 1);
        }
    }
}
