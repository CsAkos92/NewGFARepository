package com.company;

public class Main {

    public static void main(String[] args) {

        ElectricGuitar electricGuitar = new ElectricGuitar("Electric Guitar", 6);
        electricGuitar.play();

        BassGuitar bassGuitar = new BassGuitar("Bass Guitar", 4);
        bassGuitar.play();

        Violin violin = new Violin("Violin", 4);
        violin.play();


    }
}
