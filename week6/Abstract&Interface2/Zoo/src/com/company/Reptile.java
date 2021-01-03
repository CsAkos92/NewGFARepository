package com.company;

public class Reptile extends Animal {

    public Reptile(String name) {
        this.name = name;
    }

    @Override
    public void breed() {
        System.out.println("A " + name + " breeds by laying eggs.");
    }
}
