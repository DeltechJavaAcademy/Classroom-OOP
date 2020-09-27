package com.dtcc.projects;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestInstructor {

    Instructor instructor = new Instructor("Brian");
    @Test
    public void testImplementation(){
        assertThat(instructor, new IsInstanceOf(Teacher.class));

    }
    @Test
    public void testInheritance(){
        assertThat(instructor, new IsInstanceOf(Person.class));
    }
    @Test
    public void testTeach(){
        Student s1 = new Student();
        instructor.teach(s1, 20);
        assertEquals(20, s1.getTotalStudyTime(),0.001);
    }
    @Test
    public void testLecture(){
        Student s2 = new Student();
        instructor.teach(s2, 20);
        assertEquals(20, s2.getTotalStudyTime(),0.001);

    }
}
