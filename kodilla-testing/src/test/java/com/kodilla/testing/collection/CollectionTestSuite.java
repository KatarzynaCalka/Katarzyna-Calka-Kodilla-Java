package com.kodilla.testing.collection;
import org.junit.Assert;
import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
        ArrayList<Integer> testResult = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testResult);
        //then
        Assert.assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        ArrayList<Integer> testResult = new ArrayList<>();
        testResult.add(2);
        testResult.add(4);
        testResult.add(1);
        testResult.add(3);
        testResult.add(7);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(testResult);
        //then
        Assert.assertEquals(2, result.size());
    }
}
