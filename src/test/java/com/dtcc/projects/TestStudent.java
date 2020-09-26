package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student();
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student();
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testLearn(){
        Student student = new Student();
        student.learn(4);
        Assert.assertEquals(4, student.getTotalStudyTime(), .0001);
    }
}
