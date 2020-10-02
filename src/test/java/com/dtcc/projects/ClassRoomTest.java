package com.dtcc.projects;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class ClassRoomTest extends TestCase {
        ClassRoom classRoom;
        HashMap<String, Person> map = new HashMap<>();
    public void setUp()  {
        classRoom = new ClassRoom();
        map = classRoom.getRoster();
    }

    public void testGetRosterKeys() {
        Assert.assertEquals(11,map.size());
        Assert.assertTrue(map.containsKey("Lolu"));
    }

    public void testGetRosterValues(){
        for(Map.Entry<String, Person> enter : map.entrySet()){
            String key = enter.getKey();
            Person pers = enter.getValue();
            Assert.assertEquals(key,pers.getName());
        }
    }
}