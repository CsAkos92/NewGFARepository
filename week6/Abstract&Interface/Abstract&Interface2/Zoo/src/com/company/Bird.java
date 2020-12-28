package com.company;

public class Bird extends Animal {

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void breed() {
        System.out.println("A " + name + " breeds by laying eggs.");
    }
}
