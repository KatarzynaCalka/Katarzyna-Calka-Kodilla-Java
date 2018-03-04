package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class CalculatorTestSuite {

    @Test
    public void testCalculatorAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(5.0, 2.5);
        //Then
        assertEquals(7.5, result, 0);
    }

    @Test
    public void testCalculatorSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(5.0, 2.5);
        //Then
        assertEquals(2.5, result, 0);
    }

    @Test
    public void testCalculatorMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(5.0, 2.5);
        //Then
        assertEquals(12.5, result, 0);
    }

    @Test
    public void testCalculatorDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(5.0, 2.5);
        //Then
        assertEquals(2.0, result, 0);
    }
}
