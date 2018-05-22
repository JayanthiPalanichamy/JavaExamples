package main.java.iwp.Student;

import java.util.Comparator;

public class IdComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        return ((Integer) student1.getRoll_id()).compareTo(student2.getRoll_id());
    }


}
