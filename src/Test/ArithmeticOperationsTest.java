package Test;

import HW7.ArithmeticOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {

    @Test
    void testAdd() {
        assertEquals(5, ArithmeticOperations.add(2, 3));
        assertEquals(-1, ArithmeticOperations.add(-2, 1));
    }

    @Test
    void testSubtract() {
        assertEquals(-1, ArithmeticOperations.subtract(2, 3));
        assertEquals(-3, ArithmeticOperations.subtract(-2, 1));
    }

    @Test
    void testMultiply() {
        assertEquals(6, ArithmeticOperations.multiply(2, 3));
        assertEquals(-2, ArithmeticOperations.multiply(-2, 1));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, ArithmeticOperations.divide(4, 2), 0.0001);
        assertEquals(-2.0, ArithmeticOperations.divide(-4, 2), 0.0001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> ArithmeticOperations.divide(4, 0));
    }
}