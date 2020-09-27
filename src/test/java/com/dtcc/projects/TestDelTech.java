package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestDelTech {
    DelTech deltech;
    ArrayList<Instructor> list;
    @Before
    public void setup(){
        deltech=new DelTech();
        deltech.fireStaff();
    }

    @Test
    public void testFireStaff(){
        Assert.assertEquals(0,DelTech.getInstructors().size());
    }

    @Test   //Check later
    public void testHireStaff(){
            String actual="Jennifer";
            deltech.hire(new Instructor(actual));
            list=DelTech.getInstructors();
            Assert.assertEquals("Jennifer",list.get(0).getInstructorName());
    }
}
