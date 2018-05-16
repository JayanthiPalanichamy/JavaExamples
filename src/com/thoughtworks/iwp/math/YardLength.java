package com.thoughtworks.iwp.math;

public class YardLength extends  Length{
    public YardLength(double yardValue) {
        this.lengthValue = yardValue;
    }

    public double convertToInchs() {
        return lengthValue * 36;
    }
}
