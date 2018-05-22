package main.java.iwp.geometry;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LineTest {
    Line line;
    @Before
    public void setUp() {
        line = new Line(0,0,1,1);
    }
    @Test
    public void returnsEqualIfDistanceBetweenTwoLinesIsSame() {
        Line newLine = new Line(3,3, 4,4);

        assertTrue(line.equals(newLine));
    }
    @Test
    public void returnsFalseIfDistanceBetweenTwoLinesIsNotSame() {
        Line newLine = new Line(3,3, 5,4);

        assertFalse(line.equals(newLine));
    }

}
