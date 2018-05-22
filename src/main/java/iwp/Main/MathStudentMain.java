package main.java.iwp.Main;

import main.java.iwp.math.*;

public class MathStudentMain {
    public static void main(String args[]) {
        Length feetLength1 = new FeetLength(1);
        Length inchLength1 = new InchLength(2);
        Length inchLength2 = new InchLength(24);
        Length centiMeterLength = new CentiMeterLength(2.5);
        MathStudent student1 = new MathStudent();
        student1.compareLengths(inchLength1, centiMeterLength);
        System.out.println("Sum of lengths in inchs " + student1.addInInchs(inchLength1, centiMeterLength));
    }
}
