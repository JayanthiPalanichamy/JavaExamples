package com.thoughtworks.iwp.Main;

import java.util.ArrayList;
import com.thoughtworks.iwp.math.*;
public class ArrayListComparator {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(54);
        integerArrayList.add(8);
        integerArrayList.add(25);
        integerArrayList.add(9);
        integerArrayList.add(64);
        integerArrayList.add(41);
        integerArrayList.add(3);
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Alice");
        stringArrayList.add("Beca");
        stringArrayList.add("Gadot");
        stringArrayList.add("Angelina");
        ArrayList<InchLength> inchLengthArrayList = new ArrayList<>();
        inchLengthArrayList.add(new InchLength(12));
        inchLengthArrayList.add(new InchLength(16));

    }
}
