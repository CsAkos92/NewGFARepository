package com.company;

public class Mammal extends Animal {

    public Mammal(String name) {
        this.name = name;
    }

    @Override
    public void breed() {
        System.out.println("A " + name + " breeds by pushing miniature versions out.");
    }
}
