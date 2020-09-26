package com.dtcc.projects;

public class Instructor extends Person implements Teacher{

    public Instructor(){};

    public Instructor(String instructorName){
        super(instructorName);
    }

    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    public void lecture(Student[] student, double numberOfHours) {
        for(int i = 0; i < student.length; i++){
            student[i].learn(numberOfHours);
        }
    }
}
