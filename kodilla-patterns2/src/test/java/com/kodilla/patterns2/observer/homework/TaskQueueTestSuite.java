package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Mentor mentor1 = new Mentor("1");
        Task task1 = new Task(1);
        Task task2 = new Task(2);
        Task task3 = new Task(3);
        TaskQueue taskQueue = new TaskQueue("5");
        taskQueue.registerObserver(mentor1);

       //When
        taskQueue.addTask(task1);
        taskQueue.addTask(task2);
        taskQueue.addTask(task3);

        //When
        assertEquals(3, mentor1.getUpdateCount());
    }
}
