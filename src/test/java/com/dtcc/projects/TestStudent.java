package com.dtcc.projects;

import org.junit.*;
import org.junit.Test;

public class TestStudent {


    @Test
    public void testImplementation(){
        Student Jess = new Student();
        double temp = Jess.getTotalStudyTime();
        Assert.assertEquals(0, temp, 0);
    }

    @Test
    public void testInheritance(){
        Student Emad = new Student();
        Emad.setName("Emad");
        Assert.assertEquals("Emad", Emad.getName());
    }

    @Test
    public void testLearn(){

        //Creates Student
        Student cedric = new Student();

        //Cedric learns for 2 hours
        cedric.learn(2);

        //Checking get study time, ensuring returning total;
        double bookMark1 = cedric.getTotalStudyTime();

        //Adding two more hours to total study, ensuring saving increments
        cedric.learn(2);
        double bookMark2 = cedric.getTotalStudyTime();

        Assert.assertEquals(2, bookMark1 , 0);
        Assert.assertEquals(4, bookMark2, 0);
    }
}
