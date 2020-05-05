package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test

    public void whenZeroAndTenThenTen() {
        Point a = new Point(0,0);
        Point b = new Point(0,10);
        double result = a.distance(b);
        System.out.println(result);
        assertThat(result, is(10D));
    }

    @Test
    public void whenZeroAndTenThenTen1(){
        Point a = new Point(0,0,0);
        Point b = new Point(0,0,10);
        double result = a.distance3d(b);
        System.out.println(result);
        assertThat(result, is(10D));
    }
}
