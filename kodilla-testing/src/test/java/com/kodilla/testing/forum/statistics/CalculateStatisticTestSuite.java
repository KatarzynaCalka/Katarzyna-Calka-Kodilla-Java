package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nPreparing to execute test #" + testCounter);
    }

    @Test
    public void testClaculateAdvStatisticPostsEqual0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            String user = "user name";
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        //When
        calculateStatistic.claculateAdvStatistic(statisticsMock);
        //Then
        calculateStatistic.showStatistics();
        Assert.assertEquals(10, calculateStatistic.getUsersQuantity(), 0);
        Assert.assertEquals(0, calculateStatistic.getPostsQuantity(), 0);
        Assert.assertEquals(0, calculateStatistic.getCommentsQuantity(), 0);
        Assert.assertEquals(0.0, calculateStatistic.getAvePostPerUser(), 0);
        Assert.assertEquals(0.0, calculateStatistic.getAveCommentsPerPost(), 0);
        Assert.assertEquals(0.0, calculateStatistic.getAveCommentsPerUser(), 0);
    }

    @Test
    public void testClaculateAdvStatisticCommentsEqual0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            String user = "user name";
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        //When
        calculateStatistic.claculateAdvStatistic(statisticsMock);
        //Then
        calculateStatistic.showStatistics();
        Assert.assertEquals(10, calculateStatistic.getUsersQuantity(), 0);
        Assert.assertEquals(100, calculateStatistic.getPostsQuantity(), 0);
        Assert.assertEquals(0, calculateStatistic.getCommentsQuantity(), 0);
        Assert.assertEquals(10.0, calculateStatistic.getAvePostPerUser(), 0);
        Assert.assertEquals(0.0, calculateStatistic.getAveCommentsPerPost(), 0);
        Assert.assertEquals(0.0, calculateStatistic.getAveCommentsPerUser(), 0);
    }

    @Test
    public void testClaculateAdvStatisticPostEqual000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            String user = "user name";
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(250);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        //When
        calculateStatistic.claculateAdvStatistic(statisticsMock);
        //Then
        calculateStatistic.showStatistics();
        Assert.assertEquals(10, calculateStatistic.getUsersQuantity(), 0);
        Assert.assertEquals(1000, calculateStatistic.getPostsQuantity(), 0);
        Assert.assertEquals(250, calculateStatistic.getCommentsQuantity(), 0);
        Assert.assertEquals(100.0, calculateStatistic.getAvePostPerUser(), 0);
        Assert.assertEquals(0.25, calculateStatistic.getAveCommentsPerPost(), 0);
        Assert.assertEquals(25.0, calculateStatistic.getAveCommentsPerUser(), 0);
    }

    @Test
    public void testClaculateAdvStatisticCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            String user = "user name";
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        //When
        calculateStatistic.claculateAdvStatistic(statisticsMock);
        //Then
        calculateStatistic.showStatistics();
        Assert.assertEquals(10, calculateStatistic.getUsersQuantity(), 0);
        Assert.assertEquals(1000, calculateStatistic.getPostsQuantity(), 0);
        Assert.assertEquals(500, calculateStatistic.getCommentsQuantity(), 0);
        Assert.assertEquals(100.0, calculateStatistic.getAvePostPerUser(), 0);
        Assert.assertEquals(0.5, calculateStatistic.getAveCommentsPerPost(), 0);
        Assert.assertEquals(50.0, calculateStatistic.getAveCommentsPerUser(), 0);
    }

    @Test
    public void testClaculateAdvStatisticCommentsMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            String user = "user name";
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        //When
        calculateStatistic.claculateAdvStatistic(statisticsMock);
        //Then
        calculateStatistic.showStatistics();
        Assert.assertEquals(10, calculateStatistic.getUsersQuantity(), 0);
        Assert.assertEquals(1000, calculateStatistic.getPostsQuantity(), 0);
        Assert.assertEquals(5000, calculateStatistic.getCommentsQuantity(), 0);
        Assert.assertEquals(100.0, calculateStatistic.getAvePostPerUser(), 0);
        Assert.assertEquals(5.0, calculateStatistic.getAveCommentsPerPost(), 0);
        Assert.assertEquals(500.0, calculateStatistic.getAveCommentsPerUser(), 0);
    }

    @Test
    public void testClaculateAdvStatisticUsersEqual0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        //When
        calculateStatistic.claculateAdvStatistic(statisticsMock);
        //Then
        calculateStatistic.showStatistics();
        Assert.assertEquals(0, calculateStatistic.getUsersQuantity(), 0);
        Assert.assertEquals(0, calculateStatistic.getPostsQuantity(), 0);
        Assert.assertEquals(0, calculateStatistic.getCommentsQuantity(), 0);
        Assert.assertEquals(0.0, calculateStatistic.getAvePostPerUser(), 0);
        Assert.assertEquals(0.0, calculateStatistic.getAveCommentsPerPost(), 0);
        Assert.assertEquals(0.0, calculateStatistic.getAveCommentsPerUser(), 0);
    }

    @Test
    public void testClaculateAdvStatisticUsersEqual100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            String user = "user name";
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        //When
        calculateStatistic.claculateAdvStatistic(statisticsMock);
        //Then
        calculateStatistic.showStatistics();
        Assert.assertEquals(100, calculateStatistic.getUsersQuantity(), 0);
        Assert.assertEquals(1000, calculateStatistic.getPostsQuantity(), 0);
        Assert.assertEquals(5000, calculateStatistic.getCommentsQuantity(), 0);
        Assert.assertEquals(10.0, calculateStatistic.getAvePostPerUser(), 0);
        Assert.assertEquals(5.0, calculateStatistic.getAveCommentsPerPost(), 0);
        Assert.assertEquals(50.0, calculateStatistic.getAveCommentsPerUser(), 0);
    }
}
