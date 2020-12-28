package com.company;

public class Violin extends StringedInstrument{

    public Violin(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    @Override
    String sound() {
        return "Screech";
    }
}
