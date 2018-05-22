package main.java.iwp.Main;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(5,1);
        for (int i=0;i<arrayList.size();i++) {
            arrayList.set(i,arrayList.get(i)+2);
        }
      arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        linkedList.add(12);
        linkedList.add(23);
        linkedList.addLast(40);
        linkedList.add(1,20);
        System.out.println(linkedList.peekLast());
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
        System.out.println(hashSet);

    }

}
