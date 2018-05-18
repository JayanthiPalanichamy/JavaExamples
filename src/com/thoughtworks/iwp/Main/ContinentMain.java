package com.thoughtworks.iwp.Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class ContinentMain {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("India", "Asia");
        hashMap.put("China","Asia");
        hashMap.put("France","Europe");
        hashMap.put("Italy","Europe");
        hashMap.put("Egypt","Africa");
        hashMap.put("Wakanda","Africa");

        System.out.println("Countries in Asia");
        for (String key: hashMap.keySet()) {
            if(hashMap.get(key).equals("Asia")) {
                System.out.println(key);
            }
        }
        System.out.println("All the countries" + hashMap.keySet());

        HashSet<String> continents = new HashSet<>();
        continents.addAll(hashMap.values());
        System.out.println("Continents"+ continents );

        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(hashMap.keySet());
        countries.sort(Comparator.naturalOrder());
        System.out.println(countries);
    }
}
