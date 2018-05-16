package com.thoughtworks.iwp.math;

public class CentiMeterLength extends Length {
    public CentiMeterLength(double centiValue) {
        this.lengthValue=centiValue;
    }

    public double convertToInchs() {
        return lengthValue * 2 / 5;
    }
}
