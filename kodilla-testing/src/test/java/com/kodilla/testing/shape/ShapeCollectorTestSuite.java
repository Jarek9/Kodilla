package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter;

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
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void after(){
        System.out.println("Test no " + testCounter + " finished");
    }

    @Test
    public void testAddFigure(){
        //GIVEN
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        //WHEN
        shapeCollector.addFigure(square);
        //THEN
        Assert.assertTrue(shapeCollector.getShape().contains(square));
    }
    @Test
    public void testRemoveFigure(){
        //GIVEN
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        shapeCollector.getShape().add(triangle);
        //WHEN
        shapeCollector.removeFigure(triangle);
        //THEN
        Assert.assertFalse(shapeCollector.getShape().contains(triangle));
    }
    @Test
    public void testGetFigure(){
        //GIVEN
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.getShape().add(circle);
        //WHEN
        Shape result = shapeCollector.getFigure(0);
        //THEN
        Assert.assertEquals(circle, result);

    }
    @Test
    public void testShowFigures(){
        //GIVEN
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        shapeCollector.getShape().add(triangle);
        //WHEN
        String result = shapeCollector.showFigures();
        //THEN
        Assert.assertEquals("triangle", result);
    }
}
