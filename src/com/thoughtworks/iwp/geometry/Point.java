package com.thoughtworks.iwp.geometry;
class Point {
    private int xValue;
    private int yValue;

    Point(int xValue, int yValue) {
        this.xValue = xValue;
        this.yValue = yValue;
    }
    double distanceBetweenPoints(Point point)
    {
        int xDist = this.xValue - point.xValue;
        int yDist = this.yValue - point.yValue;
        int xSquare = xDist * xDist;
        int ySquare = yDist * yDist;
        double distance =  Math.sqrt(xSquare + ySquare);
        return distance;
    }
}
