package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void log(){
        Logger.getInstance().log("kodilla");
    }

    @Test
    public void testLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println(lastLog);
        //Then
        Assert.assertEquals("kodilla", lastLog);
    }
}
