package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJavaAcademy {
    JavaAcademy javaAcademy;

    @Before
    public void setup(){
        javaAcademy=new JavaAcademy();
        javaAcademy.removeStudents();
    }

    @Test
    public void testRemoveStudents(){
        Assert.assertTrue(JavaAcademy.getStudents().isEmpty());
    }

    @Test
    public void testRecruitStudent(){
        Student student= new Student("Nisha");
        JavaAcademy.recruitStudent(student);
        Assert.assertEquals("Nisha",JavaAcademy.getStudents().get(0).getStudentName());
    }
}

