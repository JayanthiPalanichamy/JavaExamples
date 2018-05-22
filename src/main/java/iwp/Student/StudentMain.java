package main.java.iwp.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        Student sara = new Student(1234,"Sara","Willert", 6,new Mark(60,54,32));
        Student sowmya = new Student(2346,"Sowmya","Tiwari", 7,new Mark(70,64,22));
        Student vikesh = new Student(1468,"Vikesh","Gupta", 6,new Mark(30,80,60));
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(sara);
        studentArrayList.add(sowmya);
        studentArrayList.add(vikesh);
//        studentArrayList.sort(new IdComparator());
////        for (Student student:studentArrayList
////             ) {
////            System.out.println(student.toString());
////        }
////        studentArrayList.sort(new PaintComparator());
////        System.out.println(studentArrayList.get(studentArrayList.size()-1).toString());
////        studentArrayList.sort(new TotalComparator());
////        System.out.println(studentArrayList.get(studentArrayList.size()-1).toString());
        List<Student> studentList = studentArrayList.stream().map(x -> new Student(x.getRoll_id() + 2,x.getFirstName(),x.getLastName(),x.getStandard(),x.getMarks())).collect(Collectors.toList());
        for (Student student:studentList
             ) {
            System.out.println(student.toString());
        }
        List<Integer> totalMarks = studentArrayList.stream().map(x -> x.getMarks().getPainting()+x.getMarks().getChemistry()+x.getMarks().getPhysics()).collect(Collectors.toList());
        System.out.println(totalMarks.stream().min(Comparator.naturalOrder()));
    }

}
