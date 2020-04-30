package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test

    public void whenZeroAndTenThenTen() {
        Point a = new Point(0,0,0,10);
        double result = a.distance(a);
        System.out.println(result);
        assertThat(result, is(10D));
    }
}
