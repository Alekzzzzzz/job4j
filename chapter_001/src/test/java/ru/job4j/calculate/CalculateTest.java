package ru.job4j.calculate;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класс на проверку echo + name
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculateTest {

    @Test
    public void whenTakeNameThenThreeEchoPlusName() {
        String input = "Alexandr Gaponenko";
        String expect = "Echo, echo, echo : Alexandr Gaponenko";
        Calculate calc = new Calculate();
        String result = calc.echo(input);
        assertThat(result, is(expect));
        System.out.println(result);
    }

}