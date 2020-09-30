package com.dtcc.projects;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestJavaAcademy extends JavaAcademy {

    @Before
    public void setup(){
        //Everbody failed! kick them out
        removeStudents();
    }

    @Test
    public void testRemoveStudents(){
        ArrayList<Student> temp_list = new ArrayList<Student>();
        temp_list = getStudents();
        Assert.assertEquals(true, temp_list.isEmpty());
    }

    @Test
    public void testRecruitStudents(){
        //All people failed, Realized Cedric was star pupil, dropped by mistake
        //Add him back to system... Kaleb was a sucky prof and needed lessons /s
        Student cs = new Student("Cedric");
        Student kb = new Student("Kaleb");

        //Officially added back to student roster
        recruitStudent(cs);
        recruitStudent(kb);

        //Creates temp test arrayList
        ArrayList<Student> temp_list = new ArrayList<Student>();

        //Copy
        temp_list = getStudents();

        //Get name or else mem location
        String temp_string1 = temp_list.get(0).getName();
        String temp_string2 = temp_list.get(1).getName();

        Assert.assertEquals("Cedric", temp_string1);
        Assert.assertEquals("Kaleb", temp_string2);
    }
}
