package com.company;

public class Person {
    String name;
    int age;
    String gender;

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";

    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    void introduce() {
        System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender);
    }

    void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

}
