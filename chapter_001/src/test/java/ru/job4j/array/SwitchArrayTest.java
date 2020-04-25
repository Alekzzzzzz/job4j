package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тест класс для смены мест значений элементов
 */
public class SwitchArrayTest {

    @Test
    public void whenSwap1to2() {
        int[] input = {1, 3, 2, 4};
        int[] expect = {1, 2, 3, 4};
        int[] rsl = SwitchArray.swap(input, 1,2);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0tolength() {
        int[] input = {1, 3, 2, 4};
        int[] expect = {4, 3, 2, 1};
        int[] rsl = SwitchArray.swapBorder(input);
        assertThat(rsl, is(expect));
    }
}
