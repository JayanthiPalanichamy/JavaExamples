package main.java.iwp.utils;
import java.lang.Math;

public class Armstrong {
    private static final int BASE_10 = 10;


    private int countDigits(int number) {
        int count = 0;
        while(number != 0) {
            count++;
            number = number / BASE_10;
        }
        return count;
    }

    public boolean check(int input) {
        int lengthOfNumber = countDigits(input);
        int inputCopy = input;
        int calculatedValue = 0;
        while(inputCopy != 0) {
            int digit = inputCopy % BASE_10;
            calculatedValue += Math.pow(digit, lengthOfNumber);
            inputCopy = inputCopy / BASE_10;
        }
        if(calculatedValue == input) {
            return true;
        }
        else {
            return false;
        }
    }
}