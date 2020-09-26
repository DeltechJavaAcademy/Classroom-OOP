package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDelTech {

    DelTech deltech;

    @Before
    public void setup(){
        deltech = new DelTech();
        deltech.fireStaff();
    }

    @Test
    public void testFireStaff(){
        Assert.assertTrue(deltech.getInstructors().isEmpty());
    }

    @Test
    public void testHireStaff(){
        Instructor instructor = new Instructor("Zan");
        deltech.hire(instructor);
        Assert.assertTrue(deltech.getInstructors().contains(instructor));
    }
}
