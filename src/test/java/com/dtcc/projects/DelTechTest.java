package com.dtcc.projects;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;

public class DelTechTest extends TestCase {
        DelTech delTech;
        ArrayList<Instructor> instruct;
    public void setUp() throws Exception {
        delTech = new DelTech();
        DelTech.fireStaff();
    }

    public void testHire() {
        String actual = "Vara";
        DelTech.hire(new Instructor(actual));
        instruct = DelTech.getInstructors();
        Assert.assertEquals("Vara",instruct.get(0).getInstructorName());
    }

    public void testFireStaff() {
        Assert.assertEquals(0,DelTech.getInstructors().size());
    }
}