package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertEquals("Buy: ski, quantity: 2.0", shopping.executeTask());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertEquals("Paint: room, color: white", painting.executeTask());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertEquals("Where: Alpy, use: car", driving.executeTask());
        Assert.assertEquals(false, driving.isTaskExecuted());
    }
}
