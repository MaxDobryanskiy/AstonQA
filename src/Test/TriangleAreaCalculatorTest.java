package Test;

import HW7.TriangleAreaCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaCalculatorTest {

    @Test
    void testCalculateArea() {
        assertEquals(12.0, TriangleAreaCalculator.calculateArea(6, 4), 0.0001);
        assertEquals(0.0, TriangleAreaCalculator.calculateArea(10, 0), 0.0001);
    }

    @Test
    void testCalculateAreaInvalid() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(-5, 10));
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.calculateArea(10, -5));
    }
}
