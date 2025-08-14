package Test;

import HW7.TriangleAreaCalculator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaCalculatorTest {

    @Test
    public void testCalculateArea() {
        assertEquals(TriangleAreaCalculator.calculateArea(6,4),12.0);

        try {
            TriangleAreaCalculator.calculateArea(-5,10);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {}

        try {
            TriangleAreaCalculator.calculateArea(10,-5);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {}

        assertEquals(TriangleAreaCalculator.calculateArea(8.0,3.0),12.0);

    }
}
