package com.company;

public abstract class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    abstract void play();
}
