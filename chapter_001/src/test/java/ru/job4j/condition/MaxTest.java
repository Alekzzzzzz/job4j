package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    /**
     * Тест метод для проверки большего значения
     */

    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        System.out.println(result);
        assertThat(result, is(2));
    }

    public void whenMax1To2Then3() {
        Max max = new Max();
        int result = max.max(1, 2,4);
        System.out.println(result);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To2Then4() {
        Max max = new Max();
        int result = max.max(1, 2,4,6);
        System.out.println(result);
        assertThat(result, is(6));
    }
}