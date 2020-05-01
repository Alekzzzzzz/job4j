package ru.job4j.condition;

/**
 * Triangle
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * @since 16.07.2019
 */

public class Triangle {

    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap,Point bp,Point cp){
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полупериметра.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) /2;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return triangle false
     */
    public boolean exist(double a, double b, double c) {

           return a < b + c && b < a + c && c < a + b;
       }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - a) * (p - b) * (p - c)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        Point a = new Point(x1,y1,x2,y2);
        double dist = a.distance(a);
        Point b = new Point(x2,y2,x3,y3);
        double dist1 = b.distance(b);
        Point c = new Point(x1,y1,x3,y3);
        double dist2 = c.distance(c);
        double p = period(dist, dist1, dist2);
        if (this.exist(dist, dist1, dist2)) {
            // написать формулу для расчета площади треугольника.

            rsl = p *(p - dist) * (p - dist1) * (p - dist2);
           rsl = Math.sqrt(rsl);
        }
        return rsl;
    }
}