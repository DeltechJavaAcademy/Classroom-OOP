package com.dtcc.projects;

import jdk.internal.net.http.common.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestClassRoom {

    @Test
    public void rosterTest(){

        //Teachers: {"Brian", "Kaleb", "Zan"}
        //Students: { "Jessica", "Emad", "Cedric",
        //             "Lolu", "Apoorva", "Vara",
        //             "Craig", "Robert", "Stephen",
        //              "Ferdinand", "Charu" }
        Map<String,String> temp_map = Classroom.getRoster();

    }
}
