package com.kodilla.testing.collection;

import org.junit.*;

import java.util.*;

public class CollectionTestSuite {


    @Before

    public void before() {

        System.out.println("Test Case: begin");

    }

    @After

    public void after() {

        System.out.println("Test Case: end");

    }

    @BeforeClass

    public static void beforeClass() {

        System.out.println("Test Suite: begin");

    }

    @AfterClass

    public static void afterClass() {

        System.out.println("Test Suite: end");

    }


    @Test

    public void testOddNumbersExterminatorEmptyList() {

        //Given

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> testList = new ArrayList<>();


        //When

        ArrayList<Integer> result = exterminator.exterminate(testList);


        System.out.println("Test list size = " + result);


        //Then

        Assert.assertEquals(testList, result);


        System.out.println("The test list is empty");


    }


    @Test

    public void testOddNumbersExterminatorNormalList() {

        //Given

        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        ArrayList<Integer> testList = new ArrayList<>();

        testList.add(1);

        testList.add(2);

        testList.add(3);

        testList.add(4);

        testList.add(5);

        testList.add(6);

        testList.add(7);

        testList.add(8);

        testList.add(9);

        //When

        ArrayList<Integer> result = exterminator.exterminate(testList);

        //Then

        ArrayList<Integer> proper = new ArrayList<>();

        proper.add(2);

        proper.add(4);

        proper.add(6);

        proper.add(8);

        Assert.assertEquals(proper, result);

        System.out.println("Exterminate method is OK");

    }


}
