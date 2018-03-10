package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    public void testTaskAdd(){
        //Given
        //When
        board.getToDoList().addTheTask("Add task to do");
        board.getInProgressList().addTheTask("Add task in progress");
        board.getDoneList().addTheTask("Add task done");
        //Then
        Assert.assertEquals("Add task to do", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Add task in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Add task done", board.getDoneList().getTasks().get(0));
    }
}
