package com.dtcc.projects;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class JavaAcademyTest extends TestCase {
    JavaAcademy javaAcademy;

    public void setUp() throws Exception {
        javaAcademy = new JavaAcademy();
        JavaAcademy.removeStudents();
    }
    public void testRecruitStudent() {
       Student student = new Student("Zoe");
        String actual = "Zoe";
        JavaAcademy.recruitStudent(student);
        Assert.assertEquals("Zoe",JavaAcademy.getStudents().get(0).getStudentName());
    }

    public void testRemoveStudents() {
        Assert.assertTrue(JavaAcademy.getStudents().isEmpty());
    }
}