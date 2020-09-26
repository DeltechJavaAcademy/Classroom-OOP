package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testSetName(){
        Person person = new Person();
        person.setName("John");
        Assert.assertEquals("John", person.getName());
    }

    @Test
    public void testConstructor(){
        Person newPerson = new Person("Joe");
        Assert.assertEquals("Joe", newPerson.getName());
    }

}
