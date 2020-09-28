package com.dtcc.projects;

public class Instructor extends Person implements Teacher {

    public Instructor(){}

    public Instructor(String name){
        this.name = name;
    }

    @Override
    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    @Override
    public void lecture(Student[] student, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours / student.length;
        for(int i = 0; i < student.length; i++){
            Student temp_student = student[i];
            temp_student.learn(numberOfHoursPerStudent);
            student[i] = temp_student;
        }
    }
}
