package com.dtcc.projects;

public class Instructor extends Person implements Teacher {
    private String instructorName;
    private double numberOfHoursPerStudent;

    public Instructor(){

    }
    public Instructor(String instructorName){
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public double getNumberOfHoursPerStudent() {
        return numberOfHoursPerStudent;
    }

    @Override
    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    @Override
    public void lecture(Student[] student, double numberOfHours) {
        for (int i = 0; i < student.length; i++){
            student[i].learn(numberOfHours);
        }
            this.numberOfHoursPerStudent = numberOfHours / student.length;
    }
}
