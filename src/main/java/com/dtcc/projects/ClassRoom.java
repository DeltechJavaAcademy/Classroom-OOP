package com.dtcc.projects;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
    private static ArrayList<Student> students = JavaAcademy.getStudents();
    private static ArrayList<Instructor> instructors = DelTech.getInstructors();

    HashMap<String, Person> hash = new HashMap<>();

    HashMap<String, Person> getRoster(){
        for(int i = 0; i < students.size(); i++){
            hash.put(students.get(i).getStudentName(),new Person(students.get(i).getStudentName()));
        }
        for(int j = 0; j < instructors.size(); j++){
            hash.put(students.get(j).getStudentName(),new Person(students.get(j).getStudentName()));
        }
        return hash;
    }

}
