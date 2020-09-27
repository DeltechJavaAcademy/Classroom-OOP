package com.dtcc.projects;

import java.util.ArrayList;

public class JavaAcademy {
    private static ArrayList<Student> studentList = new ArrayList<Student>();
    static { // static initializer
        String[] studentNames = { "Jessica", "Emad", "Cedric", "Lolu", "Apoorva", "Vara", "Craig", "Robert",
                "Stephen", "Ferdinand", "Charu" };
        for (String studentName : studentNames) {
            Student student = new Student(studentName);
            studentList.add(student);
        }
    }

    public static void recruitStudent(Student student){
        studentList.add(student);

    }
    public static ArrayList getStudents(){
        return studentList;
    }
    public static void removeStudents(ArrayList students){
        studentList.clear();
    }

}
