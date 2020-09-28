package com.dtcc.projects;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Classroom {

    private static ArrayList<Student> students = JavaAcademy.getStudents();
    private static ArrayList<Instructor> instructors = DelTech.getInstructors();

    public static Map<String, String> getRoster(){
        Map<String,String> temp_map = new LinkedHashMap<>();
        for(Instructor temp_instructors:instructors) {
            temp_map.put(temp_instructors.getName(), "Instructor");
        }
        for(Student temp_student:students){
            temp_map.put(temp_student.getName(), "Student");
            }
        return temp_map;
    }
}
