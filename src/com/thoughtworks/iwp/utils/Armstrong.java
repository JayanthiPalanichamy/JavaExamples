


package com.thoughtworks.iwp.utils;

import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    static final int BASE_10 = 10;

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        Armstrong armstrong = new Armstrong();
        armstrong.check(input);
    }

    private int countDigits(int number) {
        int count = 0;
        while(number != 0) {
            count++;
            number = number / BASE_10;
        }
        return count;
    }

    private void check(int input) {
        int lengthOfNumber = countDigits(input);
        int inputCopy = input;
        int calculatedValue = 0;
        while(inputCopy != 0) {
            int digit = inputCopy % BASE_10;
            calculatedValue += Math.pow(digit, lengthOfNumber);
            inputCopy = inputCopy / BASE_10;
        }
        if(calculatedValue == input) {
            System.out.println("Yes\n");
        }
        else {
            System.out.println("No\n");
        }
    }
}