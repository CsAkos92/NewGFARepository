package com.company;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

    @Override
    String sound() {
        return "Twang";
    }
}
