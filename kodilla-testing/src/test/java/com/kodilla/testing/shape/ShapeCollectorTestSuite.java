package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {

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
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle shape1 = new Circle(2.0);
        Triangle shape2 = new Triangle(4.0, 1.5);
        Square shape3 = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        //Then
        Assert.assertEquals(3, shapeCollector.getShapeQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Circle shape1 = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean result = shapeCollector.removeFigure(shape1);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Circle shape1 = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape1);
        //When
        boolean result = shapeCollector.removeFigure(shape1);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapeQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Circle shape1 = new Circle(2.0);
        Triangle shape2 = new Triangle(4.0, 1.5);
        Square shape3 = new Square(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        Shape testFigure = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals("square", testFigure.getShapeName());
    }
}
