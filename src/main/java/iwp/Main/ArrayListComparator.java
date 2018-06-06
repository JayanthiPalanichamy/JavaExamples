package main.java.iwp.Main;

import java.util.ArrayList;
import java.util.Comparator;

import main.java.iwp.math.*;
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

        ArrayList<Inch> inchArrayList = new ArrayList<>();
        inchArrayList.add(new Inch(12));
        inchArrayList.add(new Inch(16));
        inchArrayList.add(new Inch(8));
        inchArrayList.sort(Comparator.naturalOrder());
        System.out.println("Ascending order");
        for (Inch o: inchArrayList
             ) {
            System.out.println(o.convertToInchs());
        }

        inchArrayList.sort(Comparator.reverseOrder());
        System.out.println("Descending order");
        for (Inch o: inchArrayList
                ) {
            System.out.println(o.convertToInchs());
        }
    }
}
