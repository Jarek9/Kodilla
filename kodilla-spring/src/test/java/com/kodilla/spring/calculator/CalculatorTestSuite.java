package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations()
    {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = (Calculator)context.getBean("calculator");
        //When
        double add = calculator.add(2.5, 2.5);
        double sub = calculator.sub(10.0, 20);
        double mul = calculator.mul(20.0, 10.0);
        double div = calculator.div(100.0, 10.0);

        //Then
        Assert.assertEquals(5.0, add, 0.0);
        Assert.assertEquals(-10.0, sub, 0.0);
        Assert.assertEquals(200.0, mul, 0.0);
        Assert.assertEquals(10.0, div, 0.0);

    }
}
