package main.java.iwp.Student;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    @Before
    public void setUp() {
        Student student = new Student(1234,"Sara","Willert", 6,new Mark(60,54,32));
    }
    
}
