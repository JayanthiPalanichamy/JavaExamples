package com.thoughtworks.iwp.geometry;

public class Line {
     private Point start;
     private Point end;

     public Line(int x1, int y1, int x2, int y2)
     {
         this.start = new Point(x1, y1);
         this.end = new Point(x2, y2);
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return start.distanceBetweenPoints(end) == line.start.distanceBetweenPoints(end);
    }
    
}
