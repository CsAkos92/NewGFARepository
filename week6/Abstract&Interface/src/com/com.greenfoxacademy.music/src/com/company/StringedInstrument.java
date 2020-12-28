package com.company;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound();

    void play() {
        System.out.println("This " + name + " makes this sound: " + sound());
    }


}

