package main.java.iwp.math;

public class Centimeter extends Length {

    public static final double CONVERSION_FACTOR = 0.4;

    public Centimeter(double centiValue) throws IllegalArgumentException {
        if(centiValue < 0) {
            throw new IllegalArgumentException();
        }
        this.lengthValue=centiValue;
    }

    public double convertToInchs() {
        return lengthValue * CONVERSION_FACTOR;
    }
}
