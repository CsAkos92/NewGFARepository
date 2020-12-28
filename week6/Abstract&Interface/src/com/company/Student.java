package com.company;

public class Student extends Person {
    String previousOrganization;
    int skippedDays;


    public Student() {
        super();
        this.previousOrganization = "School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }


    @Override
    void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    void introduce() {
        System.out.println("Hi, I am " + name + ", a " + age + " years old " + gender + ", who skipped " + skippedDays + " days from the course already.");
    }

    void skipDays(int numberOfDays) {

        skippedDays += numberOfDays;
    }

    @Override
    public Student clone() {
        Student clonedStudent = new Student();
        clonedStudent.name = this.name;
        clonedStudent.age = this.age;
        clonedStudent.gender = this.gender;
        clonedStudent.previousOrganization = this.previousOrganization;
        clonedStudent.skippedDays = this.skippedDays;
        return clonedStudent;
    }
}

