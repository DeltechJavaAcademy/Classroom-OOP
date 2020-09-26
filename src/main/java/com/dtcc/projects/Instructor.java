package com.dtcc.projects;

public class Instructor extends Person implements Teacher {

    public Instructor(String name){

    }

    public void teach(Student student, double noOfHours) {
        student.learn(noOfHours);
    }

    public void lecture(Student[] student, double numberOfHours) {
        Student[] students = new Student[10];
        double numberOfHoursPerStudent = numberOfHours / students.length;

    }
}
