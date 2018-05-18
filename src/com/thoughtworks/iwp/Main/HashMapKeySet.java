package com.thoughtworks.iwp.Main;

import java.util.HashMap;

public class HashMapKeySet {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.putIfAbsent("Harry Potter",3);
        hashMap.put("Water Mark",2);
        if(hashMap.get("Java")==null) {
            hashMap.put("Java",2);
        }
        for (String s: hashMap.keySet()
                ) {
            System.out.println(s);
        }
        System.out.println(hashMap.values());
    }
}
