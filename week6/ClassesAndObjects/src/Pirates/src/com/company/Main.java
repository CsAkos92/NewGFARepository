package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Pirates jack = new Pirates("Jack Sparrow", false);
        Pirates james = new Pirates("James Balboa", false);
        Pirates cook = new Pirates("Captain Cook", true);
        Pirates nick = new Pirates("Captain Nick", true);
        Pirates tim = new Pirates("Tim Norton", false);
        Pirates tom = new Pirates("Tom Edwards", false);
        Pirates franky = new Pirates("Frank Neville", false);
        Pirates paul = new Pirates("Paul Mount", false);
        Pirates rick = new Pirates("Rick Essman", false);
        Pirates ricky = new Pirates("Ricky Rick", false);

        ArrayList<Pirates> crew = new ArrayList<>(Arrays.asList(jack, james, cook, nick, tim, tom, franky, paul, rick, ricky));


        jack.howsItGoingMate();
        System.out.println("/////////////////////////////");
        jack.drinkSomeRum();
        jack.howsItGoingMate();
        System.out.println("/////////////////////////////");
        jack.die();
        jack.howsItGoingMate();
        System.out.println("/////////////////////////////");
        james.brawl(cook);
        System.out.println(james.isAlive);
        System.out.println(cook.isAlive);
        System.out.println("/////////////////////////////");
        Ship blackPearl = new Ship();




    }
}
