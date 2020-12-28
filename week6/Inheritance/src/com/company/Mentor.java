package com.company;

public class Mentor extends Person{
    String level;

    public Mentor() {
        super();
        this.level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }


    @Override
    void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    void introduce() {
        System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender + ", "+ level + " level mentor.");
    }
}
