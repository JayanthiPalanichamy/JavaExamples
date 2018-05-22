package main.java.iwp.Student;

import java.util.Objects;

public class Student implements Comparable {
    private int roll_id;
    private String firstName;
    private String lastName;
    private int standard;
    private Mark marks;

    public Student(int roll_id, String firstName, String lastName, int standard, Mark marks) {
        this.roll_id = roll_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.standard = standard;
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStandard() {
        return standard;
    }

    public Mark getMarks() {
        return marks;
    }

    public int getRoll_id() {
        return roll_id;
    }
    public int getPaintingMark() {
        return marks.getPainting();
    }

    public int getTotal() {
        return marks.getChemistry()+marks.getPainting()+marks.getPhysics();
    }
    public void setRoll_id(int roll_id) {
        this.roll_id = roll_id;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return Integer.compare(this.roll_id,student.roll_id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_id=" + roll_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", standard=" + standard +
                ", Physics marks=" + marks.getPhysics() +
                ", Chemistry marks=" + marks.getChemistry() +
                ", Painting marks=" + marks.getPainting() +
                '}';
    }


}
