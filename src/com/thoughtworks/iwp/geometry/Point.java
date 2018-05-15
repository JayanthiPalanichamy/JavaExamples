package com.thoughtworks.iwp.geometry;
class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double distanceBetweenPoints(Point p)
    {
        int xDist = this.x-p.x;
        int yDist = this.y-p.y;
        int xSquare = xDist*xDist;
        int ySquare = yDist*yDist;
        double distance =  Math.sqrt(xSquare+ySquare);
        return distance;
    }
}
