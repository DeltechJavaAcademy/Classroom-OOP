package com.dtcc.projects;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {

    private static ArrayList<Student> students = JavaAcademy.getStudents();

    private static ArrayList<Instructor> instructors = DelTech.getInstructors();

    public static HashMap<String, Person> getRoster(){
        HashMap<String, Person> roster = new HashMap<>();
        for(Student student : students){
            roster.put(student.getName(), student);
        }
        for(Instructor instructor : instructors){
            roster.put(instructor.getName(), instructor);
        }
        return roster;
    }


}
