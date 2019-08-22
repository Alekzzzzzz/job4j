package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, };//количество элементов и их значение в массиве
        int value = 5;
       int result = find.indexOf(input, value);
       int expect = 0;
        System.out.println(result);
       assertThat(result, is(expect));
   }
    @Test
    public void whenArrayHas6Then0(){
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3, 5, 5, 7};
        int value = 6;
        int result = findLoop.indexOf(input,value);
        int expect = -1;
       assertThat(result, is(expect));
   }
}