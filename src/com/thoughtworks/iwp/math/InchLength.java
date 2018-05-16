package com.thoughtworks.iwp.math;

public class InchLength extends Length {

    public InchLength(double inchValue) {
        this.lengthValue = inchValue;
    }

    public double convertToInchs() {
        return lengthValue;
    }

}
