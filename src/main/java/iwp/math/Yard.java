package main.java.iwp.math;

public class Yard extends  Length{
    public static final int CONVERSION_FACTOR = 36;

    public Yard(double yardValue) throws IllegalArgumentException {
        if(yardValue < 0) {
            throw new IllegalArgumentException();
        }
        this.lengthValue = yardValue;
    }

    public double convertToInchs() {
        return lengthValue * CONVERSION_FACTOR;


    }
}
