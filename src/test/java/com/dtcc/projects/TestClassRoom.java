package com.dtcc.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestClassRoom {
    ClassRoom classroom;
    HashMap<String,Person> hs=new HashMap<>();;
    @Before
    public void setup(){
        classroom=new ClassRoom();
        hs=classroom.getRoster();
    }

    @Test
    public void testGetRosterValues(){

        for(Map.Entry<String,Person> entry:hs.entrySet()){
            String key = entry.getKey();
            Person p=entry.getValue();
            Assert.assertEquals(key,p.getName());
        }
    }

    @Test
    public void testGetRosterKeys(){
        Assert.assertEquals(14,hs.size());
        Assert.assertTrue(hs.containsKey("Charu"));
        Assert.assertTrue(hs.containsKey("Zan"));
        Assert.assertFalse(hs.containsKey("Roy"));
    }
}
