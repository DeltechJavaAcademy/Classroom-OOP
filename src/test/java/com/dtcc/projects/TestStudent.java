package com.dtcc.projects;
import com.dtcc.projects.Learner;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.hamcrest.BaseMatcher;

import static org.junit.Assert.*;

public class TestStudent {
    Student student = new Student();

    @Test
    public void testImplementation(){
        assertThat(student, new IsInstanceOf(Learner.class));

    }
    @Test
    public void testInheritance(){
        assertThat(student, new IsInstanceOf(Person.class));
    }
    @Test
    public void testLearn(){
        student.learn(5);
        assertEquals(5, student.getTotalStudyTime(), 0.001);
    }


}
