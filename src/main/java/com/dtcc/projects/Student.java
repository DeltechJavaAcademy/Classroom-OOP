package com.dtcc.projects;

public class Student extends Person implements Learner{
    private double totalStudyTime;
    private String studentName;

    public Student(){

    }

    public Student(String studentName){
        this.studentName = studentName;
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime = this.totalStudyTime + numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public String getStudentName() {
        return studentName;
    }
}
