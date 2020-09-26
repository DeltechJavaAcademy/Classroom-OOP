package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPerson {



    @Test
    public void testsetname(){
        Person person = new Person();
        String expected = "Mongo";
        person.setName("Mongo");

        Assert.assertEquals(expected, person.getName());


    }
    @Test
    public void testConstructor(){
        String expected = "Mongo";
        Person person1 = new Person("Mongo");
        Assert.assertEquals(expected, person1.getName());
    }

}
