package com.company;

public class Sponsor extends Person {
    int hiredStudents;
    String company;


    public Sponsor() {
        super();
        company = "Google";
        hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    void hireStudents() {
        hiredStudents += 1;
    }

    @Override
    void introduce() {
        System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }






}
