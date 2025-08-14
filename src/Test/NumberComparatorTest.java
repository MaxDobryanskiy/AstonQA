package Test;

import HW7.NumberComparator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTest {

    @Test
    public void testCompareGreater() {
        String result = NumberComparator.compare(10 ,5 );
        assertEquals(result,"a > b");
    }

    @Test
    public void testCompareLess() {
        String result = NumberComparator.compare (3 ,8 );
        assertEquals(result,"a < b");
    }

    @Test
    public void testCompareEqual() {
        String result = NumberComparator.compare (7 ,7 );
        assertEquals(result,"a == b");
    }
}
