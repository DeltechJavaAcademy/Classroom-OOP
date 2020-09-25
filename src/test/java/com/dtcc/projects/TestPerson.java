package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testSetName(){

        //Starts with null _>setName();
        Person person = new Person();
        person.setName("Billy-Bob");

        //Single arg constructor calls same logic as getName();
        Person person1 = new Person("Swag");

        Assert.assertEquals("Billy-Bob", person.getName());
        Assert.assertEquals("Swag", person1.getName());
    }
}
