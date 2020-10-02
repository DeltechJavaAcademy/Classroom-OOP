package com.dtcc.projects;

import junit.framework.TestCase;
import org.junit.Assert;

public class InstructorTest extends TestCase {

    private Instructor instructor;

    public void setUp()  {
        instructor = new Instructor();
    }

    public void testImplementation() {
        Assert.assertTrue(instructor instanceof Teacher);
    }

    public void testInheritance() {
        Assert.assertTrue(instructor instanceof Person);
    }

    public void testTeach() {
        Student student = new Student("Lolu");
        instructor.teach(student, 8);
        double expected = student.getTotalStudyTime();
        Assert.assertEquals(8,expected,1);
    }

    public void testLecture() {
        Student[] students = {new Student("Lolu")};
        instructor.lecture(students, 8);
        double expected = instructor.getNumberOfHoursPerStudent();
        Assert.assertEquals(8,expected,1);
    }
}