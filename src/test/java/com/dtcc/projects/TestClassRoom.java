package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;


public class TestClassRoom {

    @Test
    public void testRoster(){
        //gets roster
        HashMap<String, Person> clazz = Classroom.getRoster();

        for(Instructor instructor: DelTech.getInstructors()){
            //Ensures instructor exists in class
            Assert.assertTrue(clazz.containsKey(instructor.getName()));
            //Ensure names match
            Assert.assertEquals(instructor, clazz.get(instructor.getName()));
        }
        for(Student student: JavaAcademy.getStudents()){
            Assert.assertTrue(clazz.containsKey(student.getName()));
            Assert.assertEquals(student, clazz.get(student.getName()));
        }

    }
}
