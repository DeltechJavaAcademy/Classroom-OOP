package com.dtcc.projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClassRoom {
    private static ArrayList<Student> students =JavaAcademy.getStudents();
    private static ArrayList<Instructor> instructors=DelTech.getInstructors();

    private HashMap<String,Person> hashmap=new HashMap<>();

    public HashMap<String, Person> getRoster(){
        for(int i=0;i<students.size();i++){
            this.hashmap.put(students.get(i).getStudentName(),new Person(students.get(i).getStudentName()));
        }

        for(int j=0;j<instructors.size();j++){
            this.hashmap.put(instructors.get(j).getInstructorName(),new Person(instructors.get(j).getInstructorName()));
        }
        return this.hashmap;
    }

    public HashMap<String, Person> getHashmap() {
        return hashmap;
    }
    //hs.forEach((k, v) -> {System.out.println("Key: " + k + ", Value: " + v);});
}
