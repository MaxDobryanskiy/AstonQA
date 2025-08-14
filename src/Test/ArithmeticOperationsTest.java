package Test;

import HW7.ArithmeticOperations;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticOperationsTest {

    @Test
    public void testAdd() {
        assertEquals(ArithmeticOperations.add(2,3),5);
        assertEquals(ArithmeticOperations.add(-2,1),-1);
    }

    @Test
    public void testSubtract() {
        assertEquals(ArithmeticOperations.subtract(2,3),-1);
        assertEquals(ArithmeticOperations.subtract(-2,-3),1);
    }

    @Test
    public void testMultiply() {
        assertEquals(ArithmeticOperations.multiply(4,-3), -12);
        assertEquals(ArithmeticOperations.multiply(-2,-3),6);
    }

    @Test
    public void testDivide() {
        assertEquals((double)ArithmeticOperations.divide(4,2),2.0);
        assertEquals((double)ArithmeticOperations.divide(-4,-2),2.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        ArithmeticOperations.divide(4,0);
    }
}
