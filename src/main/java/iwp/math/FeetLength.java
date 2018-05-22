package main.java.iwp.math;

public class FeetLength extends Length  {

    public FeetLength(double feetValue) throws IllegalArgumentException{
        if(feetValue < 0) {
            throw new IllegalArgumentException();
        }
        this.lengthValue = feetValue;
    }

    public double convertToInchs() {
        return lengthValue*12;

    }



}
