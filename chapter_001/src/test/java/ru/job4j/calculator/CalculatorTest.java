package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class CalculatorTest  {
    /**
     * Test add
     */

    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test subtract
     */

    @Test
    public void whenAddOneMinusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.subtract(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test div
     */

    @Test
    public void whenAddOneDivOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.div(4D, 2D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test multiple
     */

    @Test
    public void whenAddOneMultipleOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
