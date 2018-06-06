package main.java.iwp.math;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathStudentTest {
    MathStudent mathStudent;
    @Before
    public void setUp() {
        mathStudent = new MathStudent();
    }

    @Test
    public void return13InchWhenOneInchAndOneFeet() {
        Inch inch = new Inch(1);
        Feet feet = new Feet(1);
        assertEquals(13.0,mathStudent.addInInchs(inch,feet),0.001);
    }
}
