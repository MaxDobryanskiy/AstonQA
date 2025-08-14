package Test;

import HW7.NumberComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    @Test
    void testCompareGreater() {
        assertEquals("a > b", NumberComparator.compare(5, 3));
    }

    @Test
    void testCompareLess() {
        assertEquals("a < b", NumberComparator.compare(3, 5));
    }

    @Test
    void testCompareEqual() {
        assertEquals("a == b", NumberComparator.compare(4, 4));
    }
}