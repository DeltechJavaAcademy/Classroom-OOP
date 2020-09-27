package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    Person person;
    //Create a testSetName method which ensures that a Person object's
    // name variable is being set by invoking the .setName method.
    @Test
    public void testSetName(){
        person=new Person();
        String actual="Charu";
        person.setName(actual);
        String expected=person.getName();
        Assert.assertEquals(actual,expected);
    }

    //Create a testConstructor method which ensures that a Person object's
    // ame variable is being set by invoking the Person constructor.
    @Test
    public void testConstructor(){
        person=new Person("Ellie");
        String actual="Ellie";
        String expected=person.getName();
        Assert.assertEquals(actual,expected);
    }
}

