package com.company;

public class Main {

    public static void main(String[] args) {
        Student Joe = new Student("Joe");

        Teacher Ron = new Teacher("Ron");

        Ron.teach(Joe);
        Joe.question(Ron);

    }
}
