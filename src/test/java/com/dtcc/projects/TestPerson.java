package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testSetName(){
        String expected = "Lolu";
        Person person = new Person(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor(){
        String expected = "Lolu";
        Person person = new Person(expected);
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
}
