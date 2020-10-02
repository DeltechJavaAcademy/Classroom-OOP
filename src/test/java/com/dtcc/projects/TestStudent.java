package com.dtcc.projects;

import junit.framework.TestCase;
import org.junit.Assert;

public class TestStudent extends TestCase {
    Student student;
    public void setUp() throws Exception {
       student = new Student();
    }

    public void testImplementation() {
        Assert.assertTrue(student instanceof Learner);
    }

    public void testLearn() {
        student.learn(5.00);
        double actual = 5.00;
        double expected = student.getTotalStudyTime();
        Assert.assertEquals(actual,expected,1);
    }

    public void testInheritance() {
        Assert.assertTrue(student instanceof Person);
    }
}