package com.thoughtworks.iwp.math;

public class MathStudent {
    public int compareLengths(Length length1, Length length2) {

        double calculatedLength1 = length1.convertToInchs();
        double calculatedLength2 = length2.convertToInchs();
        return compare(calculatedLength1, calculatedLength2);
    }

    private int compare(double length1, double length2) {
        if(length1 == length2) {
            System.out.println("Equal");
            return 0;
        }
        else if(length1 <length2) {
            System.out.println("First length is less than second length");
            return -1;
        }
        else {
            System.out.println("First length is more than second length");
            return 1;
        }
    }

    public double addInInchs(Length length1, Length length2) {
        return length1.convertToInchs() + length2.convertToInchs();
    }




}
