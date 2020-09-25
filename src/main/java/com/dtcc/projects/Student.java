package com.dtcc.projects;

public class Student extends Person implements Learner {

   private double totalStudyTime;

    @Override
    public void learn(double numberOfHours) {
        //Increment total study time by val
        totalStudyTime += numberOfHours;
    }

    //returns total  study time, future calcs
    public double getTotalStudyTime(){return this.totalStudyTime;}
}
