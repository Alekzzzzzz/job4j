package ru.job4j.condition;

public class Point {
    public double distance(int x1, int y1, int x2, int y2) {
        double a = Math.pow(x1 - x2, 2 );
        double b = Math.pow(y1 - y2, 2 );
        double first = Math.sqrt(a + b);
        return first;
    }
}