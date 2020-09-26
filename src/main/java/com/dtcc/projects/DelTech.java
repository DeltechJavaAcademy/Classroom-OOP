package com.dtcc.projects;

import java.util.ArrayList;

public class DelTech {
    private static ArrayList<Instructor> instructorList = new ArrayList<>();

    static{
        String[] instructorNames = {"Brian", "Kaleb", "Zan"};
        for(String instructorName : instructorNames){
            Instructor instructor = new Instructor(instructorName);
            hire(instructor);
        }
    }

    public static void hire(Instructor instructor){
        instructorList.add(instructor);
    }

    public static ArrayList<Instructor> getInstructors(){
        return instructorList;
    }

    public static void fireStaff(){
        instructorList.clear();
    }
}
