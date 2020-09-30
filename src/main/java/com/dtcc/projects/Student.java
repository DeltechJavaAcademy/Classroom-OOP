package com.dtcc.projects;

public class Student extends Person implements Learner {

   private double totalStudyTime;

    public Student(){}

    public Student(String name){this.name = name;}

    @Override
    public void learn(double numberOfHours) {
        //Increment total study time by val
        totalStudyTime += numberOfHours;
    }

    //returns total  study time, future calcs
    public double getTotalStudyTime(){return this.totalStudyTime;}
}
