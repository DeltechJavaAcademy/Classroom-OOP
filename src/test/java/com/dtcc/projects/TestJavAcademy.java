package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJavAcademy {
    JavaAcademy javaAcademy;

    @Before
    public void setup(){
        javaAcademy = new JavaAcademy();
        javaAcademy.removeStudents();
    }

    @Test
    public void testRemoveStudents(){
        Assert.assertTrue(javaAcademy.getStudents().isEmpty());
    }

    @Test
    public void testRecruitStudent(){
        Student student = new Student("Jess");
        javaAcademy.recruitStudent(student);
        Assert.assertTrue(javaAcademy.getStudents().contains(student));
    }

}
