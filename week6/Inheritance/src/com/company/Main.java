package com.company;

public class Main {

    public static void main(String[] args) {
        Student nic = new Student("Nicholas Flamel", 349, "male", "Association For The Philosopher's Stone");
        nic.introduce();
        nic.getGoal();
        Mentor oli = new Mentor("Ollivander", 84, "male", "advanced");
        oli.introduce();
        oli.getGoal();
        Sponsor fudge = new Sponsor("Cornelius Fudge", 63, "male", "Ministry Of Magic");
        fudge.hireStudents();
        fudge.introduce();
        fudge.getGoal();


    }
}
