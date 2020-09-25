package com.dtcc.projects;

import junit.framework.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //Create new teach
        Instructor zc = new Instructor();
        zc.setName("Zan");

        //Create New Student
        Student cs = new Student();
        cs.setName("Cedric");

        //Havn't studied yet should be 0
        double bookMark1 = cs.getTotalStudyTime();

        //Zan teaches student, have to call teacher interface
        zc.teach(cs, 2);

        //Get students study time
        double bookMark2 = cs.getTotalStudyTime();

        Assert.assertEquals(0.0, bookMark1);
        Assert.assertEquals(2.0, bookMark2);

    }

    @Test
    public void testInheritance(){
        //Creates an instructor
        Instructor kb = new Instructor();
        //Set name only exists in Person
        kb.setName("Kaleb");
        String temp_val = kb.getName();
        Assert.assertEquals("Kaleb", temp_val );
    }

    @Test
    public void testTeach(){
        //Create new teach
        Instructor zc = new Instructor();
        zc.setName("Zan");

        //Create New Student
        Student cs = new Student();
        cs.setName("Cedric");

        //Havn't studied yet should be 0
        double bookMark1 = cs.getTotalStudyTime();

        //Zan teaches student, have to call teacher interface
        zc.teach(cs, 2);

        //Due to last statment we should hope this is true
        double bookMark2 = cs.getTotalStudyTime();

        Assert.assertEquals(0.0, bookMark1);
        Assert.assertEquals(false, (cs.getTotalStudyTime() == 1));
        Assert.assertEquals(2.0, bookMark2);
    }

    @Test
    public void testLecture(){

        //Create new teach
        Instructor zc = new Instructor();
        zc.setName("Zan");

        //Create New Student
        Student cs = new Student();
        cs.setName("Cedric");

        //Creates second student
        Student ez = new Student();
        ez.setName("Emad");

        //Created a roster of students
        Student[] roster = new Student[2];
        roster[0] = cs;
        roster[1] = ez;

        //Teach the whole class 2 hours each
        zc.lecture(roster, 4);

        //Cedric Gets a special tutor session, so should have 4 total
        zc.teach(cs, 2);

        //Checking Roster
        Assert.assertEquals(2.0, roster[1].getTotalStudyTime());
        Assert.assertEquals(4.0, roster[0].getTotalStudyTime());

        //Checking each student manually
        Assert.assertEquals(2.0, ez.getTotalStudyTime());
        Assert.assertEquals(4.0, cs.getTotalStudyTime());
    }
}
