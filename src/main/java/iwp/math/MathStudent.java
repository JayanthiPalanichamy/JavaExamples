package main.java.iwp.math;

public class MathStudent {

    public int compareLengths(Length length1, Length length2) {
        return length1.compareTo(length2);
    }

    public double addInInchs(Length length1, Length length2) {
        return length1.convertToInchs() + length2.convertToInchs();
    }
}
