package main.java.iwp.math;

public class Feet extends Length {

    public static final int CONVERSION_FACTOR = 12;

    public Feet(double feetValue) throws IllegalArgumentException {
        if (feetValue < 0) {
            throw new IllegalArgumentException();
        }
        lengthValue = feetValue;
    }

    public double convertToInchs() {
        return lengthValue * CONVERSION_FACTOR;

    }


}
