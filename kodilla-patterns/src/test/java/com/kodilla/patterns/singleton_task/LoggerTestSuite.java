package com.kodilla.patterns.singleton_task;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {


    @BeforeClass
    public static void logged() {
        Logger.getInstance().log("login attempt, user: jarekb");

    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        Assert.assertEquals("login attempt, user: jarekb", lastLog);
    }
}
