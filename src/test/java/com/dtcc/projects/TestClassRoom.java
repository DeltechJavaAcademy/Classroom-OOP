package com.dtcc.projects;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class TestClassRoom {


    ClassRoom cr = new ClassRoom();


    @Test
    public void hashMappingTest(){
        Set<Person> s = new HashSet<Person>(cr.getRoster().values());


        Iterator<Person> it = s.iterator();
        while(it.hasNext()){
            Person p = it.next();
            if(it.next() instanceof Student){
                if(!cr.getStudents().contains(p)){
                    fail();
                }
            }
            if(it.next() instanceof Instructor){

                if(!cr.getInstructors().contains(p)){
                    fail();

                }

            }

        }


    }


}
