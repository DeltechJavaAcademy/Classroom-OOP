package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor();
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor();
        Student student = new Student();
        instructor.teach(student, 3);
        Assert.assertEquals(3,student.getTotalStudyTime(), .0001);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor();
        Student student = new Student();
        instructor.teach(student, 3);
        Assert.assertEquals(3,student.getTotalStudyTime(), .0001);
    }


}
