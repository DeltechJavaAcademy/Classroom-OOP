package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {

    Instructor instructor;
    @Before
    public void setUp(){
        instructor=new Instructor();
    }
    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Student student=new Student("Lorrie");
        instructor.teach(student,5);
        Assert.assertEquals(5,student.getTotalStudyTime(),0);
    }

    @Test
    public void testLecture(){
        Student[] students={new Student("Albert"),new Student("Ross"), new Student("Tom")};
        instructor.lecture(students,9.00);
        Assert.assertEquals(3.00,instructor.getNumberOfHoursPerStudent(),0);

    }
}
