package com.company;

public class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach(Student name) {
        name.learn();

    }

    public void answer() {
        System.out.println("The teacher answers the question.");

    }
}
