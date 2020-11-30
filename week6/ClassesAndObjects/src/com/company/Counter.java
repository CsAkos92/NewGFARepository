package com.company;

public class Counter {

    int counter = 0;
    int reset = counter;

    public Counter() {

    }

    public Counter(int counter) {
        this.counter = counter;
    }


    public int add(int number) {
        counter += number;
        return counter;
    }

    public int add() {
        counter += 1;
        return counter;
    }

    public void get() {
        System.out.println(counter);
    }

    public void reset() {
        counter = reset;
    }
}
