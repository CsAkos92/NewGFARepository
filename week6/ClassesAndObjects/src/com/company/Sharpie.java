package com.company;

public class Sharpie {

    float inkAmount = 100;
    String color;
    float width;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmount -= 1;
    }
}
