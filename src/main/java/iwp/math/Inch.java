package main.java.iwp.math;

public class Inch extends Length {

    public Inch(double inchValue) throws IllegalArgumentException {
        if (inchValue < 0) {
            throw new IllegalArgumentException();
        }
        lengthValue = inchValue;
    }

    public double convertToInchs() {
        return lengthValue;
    }

}
