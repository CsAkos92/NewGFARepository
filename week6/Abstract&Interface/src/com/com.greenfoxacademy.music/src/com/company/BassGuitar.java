package com.company;

public class BassGuitar extends StringedInstrument {


    public BassGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    @Override
    String sound() {
        return "Duum-duum-duum";
    }
}
