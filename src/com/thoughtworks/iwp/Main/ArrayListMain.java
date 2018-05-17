package com.thoughtworks.iwp.Main;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList <Integer> arrayList2 = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++) {
            arrayList1.add(i);
            arrayList2.add(i);
        }
        System.out.println(arrayList1.equals(arrayList2));
        compare(arrayList1, arrayList2);
    }

    private static void compare(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        int flag = 0;
        for(int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i)+" "+arrayList2.get(i));
            if(arrayList1.get(i) != arrayList2.get(i)) {
                flag = 1;
            }
        }
        if(flag == 0) {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
