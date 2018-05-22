package main.java.iwp.math;

public class CentiMeterLength extends Length {
    public CentiMeterLength(double centiValue) throws IllegalArgumentException {
        if(centiValue < 0) {
            throw new IllegalArgumentException();
        }
        this.lengthValue=centiValue;
    }

    public double convertToInchs() {
        return lengthValue * 2 / 5;
    }
}
