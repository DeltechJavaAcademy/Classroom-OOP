package com.dtcc.projects;

public class Student extends Person implements Learner{
    private double totalStudyTime  = 0.0;

    public Student(String studentName) {
    }

    public Student() {

    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }
    public double getTotalStudyTime(){
        return this.totalStudyTime;
    }
    public void setTotalStudyTime(double numberOfHours){
        this.totalStudyTime = numberOfHours;

    }
}
