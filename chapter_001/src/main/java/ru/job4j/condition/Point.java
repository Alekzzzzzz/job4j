package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x,y,x1,y1;

    public Point(int first, int second,int first1, int second1) {
        this.x = first;
        this.y = second;
        this.x1 = first1;
        this.y1 = second1;
    }

    public double distance(Point that) {
        double result = sqrt(pow(this.x - this.x1, 2) + pow(this.y - this.y1, 2));
        return result;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0,0,2);
        double dist = a.distance(a);
        System.out.println(dist);
    }
}