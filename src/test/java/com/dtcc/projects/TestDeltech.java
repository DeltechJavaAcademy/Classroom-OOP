package com.dtcc.projects;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestDeltech extends DelTech {

    @Before
    public void setup(){
        //Fires everyone, blank list for every test
        fireStaff();
    }

    @Test
    public void testFireStaff(){
        ArrayList<Instructor> temp_list = new ArrayList<Instructor>();
        temp_list = getInstructors();
        Assert.assertEquals(true, temp_list.isEmpty());
    }

    @Test
    public void testHireStaff(){
        //All people were fired, hires new overlord Cedric
        Instructor cs = new Instructor("Cedric");
        Instructor zn = new Instructor("Zan");

        //Officially hires him and adds to Instructor roster
        hire(cs);
        hire(zn);

        //Creates temp test arrayList
        ArrayList<Instructor> temp_list = new ArrayList<Instructor>();

        //Copy
        temp_list = getInstructors();

        String temp_string1 = temp_list.get(0).getName();
        String temp_string2 = temp_list.get(1).getName();

        Assert.assertEquals("Cedric", temp_string1);
        Assert.assertEquals("Zan", temp_string2);
    }
}
