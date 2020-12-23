package com.company;

import java.util.Random;

public class Pirates {
    String name;
    boolean drunk = false;

    public Pirates(String name) {
        this.name = name;
    }

    public void drinkSomeRum() {
        this.drunk = true;
    }

    public void howsItGoingMate() {
        if (drunk = true) {
            Random rand = new Random();
            for (int i = 1; i < rand.nextInt(4) + 1; i++) {
                System.out.println("Tőccsé mán egy másikot tee!");

            }
        }
    }
}
