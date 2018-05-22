package main.java.iwp.geometry;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PointTest {
    Point point;

   @Before
    public void setUp() {
       point = new Point(0,0);
   }

   @Test
    public void distanceBetweenOriginAndPointWithX1AndY0() {
       Point newPoint = new Point(1,0);
       assertEquals(1.0, point.distanceBetweenPoints(newPoint));
   }

   @Test
    public void distanceBetweenOriginAndPointX4AndY0() {
       Point newPoint = new Point(4,0);
       assertEquals(4.0, point.distanceBetweenPoints(newPoint));
   }
}
