package com.gla;

public class Student extends User {
    public Student(String name) {
        super(name);
    }

    public void showRole() {
        System.out.println(this.name + " is a Student.");
    }
}

