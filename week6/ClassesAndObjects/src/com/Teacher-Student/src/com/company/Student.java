package com.company;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;


    }

    public void learn() {
        System.out.println(name + " is learning.");
    }

    public void question(Teacher name) {
        name.answer();

    }
}
