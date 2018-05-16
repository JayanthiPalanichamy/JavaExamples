package com.thoughtworks.iwp.math;

public class FeetLength extends Length  {

    public FeetLength(double feetValue) {
        this.lengthValue = feetValue;
    }

    public double convertToInchs() {
        return lengthValue*12;

    }



}
