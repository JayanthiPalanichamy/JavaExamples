package com.thoughtworks.iwp.math;

public class Length implements InchValueOfLength, Comparable {
    protected double lengthValue;

    public double convertToInchs() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        Length length = (Length) o;
        double calculatedLength1 = this.convertToInchs();
        double calculatedLength2 = length.convertToInchs();
        return compare(calculatedLength1, calculatedLength2);
    }

    private int compare(double length1, double length2) {
        if(length1 == length2) {
//            System.out.println("Equal");
            return 0;
        }
        else if(length1 < length2) {
//            System.out.println("First length is less than second length");
            return -1;
        }
        else {
//            System.out.println("First length is more than second length");
            return 1;
        }
    }
}
