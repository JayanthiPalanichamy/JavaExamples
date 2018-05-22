package main.java.iwp.Main;

import main.java.iwp.geometry.Line;

public class LineMain {
    public static void main(String [] args)
    {
        Line line1 = new Line(3,3,2,2);
        Line line2 = new Line(3,3, 4,4);
        if(line1.equals(line2)) {
            System.out.println("Both distances are equal");
        }
        else {
            System.out.println("Both distances are not equal");
        }


    }
}
