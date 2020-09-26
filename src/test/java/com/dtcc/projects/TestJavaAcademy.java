package com.dtcc.projects;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestJavaAcademy {
    @Before
    @Test
    public void setup(){
//        ArrayList<String> removeStudentList = new ArrayList<String>();
//        removeStudentList.add("Tom");
        JavaAcademy.removeStudents(JavaAcademy.getStudents());

    }
@Test
    public void testRemoveStudents(){
        assertTrue(JavaAcademy.getStudents().isEmpty());

    }

    @Test
    public void testRecruitStudent(){
        Student Tom = new Student("Tom");
        JavaAcademy.recruitStudent(Tom);
        assertTrue(JavaAcademy.getStudents().contains(Tom));

    }


}
