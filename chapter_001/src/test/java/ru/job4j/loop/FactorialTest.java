package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test факториал чисел
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * @version 02.08.2019
 */

public class FactorialTest {

    /**
     * Test факториал числа 5
     * {@value} ожидаемое число 120
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial calc = new Factorial();
        int result = calc.calc(5);
        assertThat(result,is(120));
    }

    /**
     * Test на число 0
     * {@value} ожидаемое число 1
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial calc =  new Factorial();
        int result = calc.calc(0);
        assertThat(result,is(1));
    }
}
