package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класс ищем определённое число в массиве
 */
public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3,};
        int value = 5;
        int start = 0;
        int finish = input.length;
        int result = find.indexOf(input, value, start, finish);
        int expect = 0;
        System.out.println(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6Then0() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{5, 10, 3, 5, 5, 7};
        int start = 0;
        int finish = 5;
        int value = 6;
        int result = findLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 0;
        int finish = 4;
        int result = findLoop.indexOf(input, value, start, finish);
        int expect = 1;
        assertThat(result, is(expect));
    }
}