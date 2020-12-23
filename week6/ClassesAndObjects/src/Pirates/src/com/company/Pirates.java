package com.company;

import java.util.Random;

public class Pirates {
    String name;


    boolean isCaptain = false;
    boolean isDrunk = false;
    boolean isAlive = true;

    public Pirates(String name, boolean isCaptain) {
        this.name = name;
    }

    public boolean getIsCaptain() {
        return isCaptain;
    }

    void drinkSomeRum() {
        this.isDrunk = true;
    }

    void sleep() {

        this.isDrunk = false;
    }

    void die() {
        isAlive = false;
    }

    void howsItGoingMate() {
        if(isAlive) {
            if (isDrunk) {
                Random rand = new Random();
                for (int i = 1; i <= rand.nextInt(4) + 1; i++) {
                    System.out.println("Tőccsé mán egy másikot tee!");
                }
            } else {
                System.out.println("Arghh, énnnegy kalóz vagyok! Mit gondossz, hogyanis lehetnák?");
                sleep();

            }
        } else {
            System.out.println("Ez már megdöglött.");
        }
    }

    void brawl(Pirates pirate) {
        if(isAlive) {
            Random rand = new Random();
            int randNum = 0;
            System.out.println(randNum = (rand.nextInt(3) + 1));
            if(randNum == 1) {
                pirate.die();
            } else if (randNum == 2) {
                die();
            } else if (randNum == 3) {
                pirate.die();
                die();
            }
        }
    }


}
