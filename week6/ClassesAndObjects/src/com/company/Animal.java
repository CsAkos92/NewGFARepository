package com.company;

public class Animal {
//    Készíts egy Animal (állat) osztályt
//    Minden állatnak van hunger (éhség) értéke, ami egy egész szám
//    Minden állatnak van thirst (szomjúság) értéke, ami egy egész szám
//    Amikor egy állatot példányosítunk, ez a két érték a következő alapértéket kapja: 50
//    Minden állat képes enni eat(), ami eggyel csökkenti az éhségét
//    Minden állat képes inni drink(), ami eggyel csökkenti a szomjúságát
//    Minden állat képes játszani play(), ami eggyel növeli mindkét értéket

    int hunger;
    int thirst;

    public void eat() {
        hunger -= 1;
    }

    public void drink() {
        thirst -= 1;
    }

    public void play() {
        hunger += 1;
        thirst += 1;
    }
}
