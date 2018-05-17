package com.thoughtworks.iwp.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

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

        integerArrayList.sort(Comparator.naturalOrder());
        System.out.println(integerArrayList);
        integerArrayList.sort(Comparator.reverseOrder());
        System.out.println(integerArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Alice");
        stringArrayList.add("Beca");
        stringArrayList.add("Gadot");
        stringArrayList.add("Angelina");

        stringArrayList.sort(Comparator.naturalOrder());
        stringArrayList.sort(Comparator.naturalOrder());
        System.out.println(stringArrayList);
        stringArrayList.sort(Comparator.reverseOrder());
        System.out.println(stringArrayList);

        ArrayList<InchLength> inchLengthArrayList = new ArrayList<>();
        inchLengthArrayList.add(new InchLength(12));
        inchLengthArrayList.add(new InchLength(16));
        inchLengthArrayList.add(new InchLength(8));
        inchLengthArrayList.sort(Comparator.naturalOrder());
        System.out.println("Ascending order");
        for (InchLength o: inchLengthArrayList
             ) {
            System.out.println(o.convertToInchs());
        }

        inchLengthArrayList.sort(Comparator.reverseOrder());
        System.out.println("Descending order");
        for (InchLength o: inchLengthArrayList
                ) {
            System.out.println(o.convertToInchs());
        }
    }
}
