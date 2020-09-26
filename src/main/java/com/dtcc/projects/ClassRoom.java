package com.dtcc.projects;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {

    private ArrayList<Student> students = new ArrayList<Student>(); //JavaAcademy.getStudents();
    private ArrayList<Instructor> instructors = new ArrayList<Instructor>(); // DelTech.getInstructors();
    private HashMap<String, Person> rosters= new HashMap<String, Person>();


    public HashMap getRoster(){
        for(Person p : students){
            rosters.put(p.getName(), p);
        }
        for(Person p : instructors){
            rosters.put(p.getName(), p);
        }

        return rosters;
}

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }
}
