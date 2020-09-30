package com.dtcc.projects;

import java.util.ArrayList;
import java.util.HashMap;


public class Classroom {

    private static ArrayList<Student> students = JavaAcademy.getStudents();
    private static ArrayList<Instructor> instructors = DelTech.getInstructors();

    public static HashMap<String, Person> getRoster(){
        //Adds instructors to class
        HashMap<String, Person> roster = new HashMap<>();
        for(Instructor instructor : instructors){
            roster.put(instructor.getName(), instructor);
        }

        for(Student student : students){
            roster.put(student.getName(), student);
        }

        return roster;
    }
}
