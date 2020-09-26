package com.dtcc.projects;

public class Student extends Person implements Learner{

    private double totalStudyTime = 0;

    public Student(){};

    public Student(String studentName){
        super(studentName);
    }

    public void learn(double numberOfHours){
        totalStudyTime+=numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
