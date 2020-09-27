package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {
    Student student;
    @Before
    public void setUp(){
        student=new Student();
    }
    @Test
    public void testImplementation(){
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        student.learn(2.00);
        double actual=2.0;
        double expected=student.getTotalStudyTime();
        Assert.assertEquals(actual,expected,0);
    }
}
