package main.java.iwp.geometry;

public class Line {
     private Point startPoint;
     private Point endPoint;

     public Line(int startX, int startY, int endX, int endY)
     {
         startPoint = new Point(startX, startY);
         endPoint = new Point(endX, endY);
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return startPoint.distanceBetweenPoints(endPoint) == line.startPoint.distanceBetweenPoints(line.endPoint);
    }
}
