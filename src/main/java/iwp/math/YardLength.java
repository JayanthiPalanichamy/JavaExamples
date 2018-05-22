package main.java.iwp.math;

public class YardLength extends  Length{
    public YardLength(double yardValue) throws IllegalArgumentException {
        if(yardValue < 0) {
            throw new IllegalArgumentException();
        }
        this.lengthValue = yardValue;
    }

    public double convertToInchs() {
        return lengthValue * 36;
    }
}
