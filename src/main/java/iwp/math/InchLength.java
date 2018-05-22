package main.java.iwp.math;

public class InchLength extends Length {

    public InchLength(double inchValue) throws IllegalArgumentException {
        if(inchValue < 0 ) {
            throw new IllegalArgumentException();
        }
        this.lengthValue = inchValue;
    }

    public double convertToInchs() {
        return lengthValue;
    }

}
