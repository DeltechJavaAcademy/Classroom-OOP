package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class TestClassRoom {

    @Test
    public void testRoster(){
        HashMap<String, Person> roster = ClassRoom.getRoster();
        for(Student student: JavaAcademy.getStudents()){
            Assert.assertTrue(roster.containsKey(student.getName()));
            Assert.assertEquals(student, roster.get(student.getName()));
        }
        for(Instructor instructor: DelTech.getInstructors()){
            Assert.assertTrue(roster.containsKey(instructor.getName()));
            Assert.assertEquals(instructor, roster.get(instructor.getName()));
        }
    }

}
