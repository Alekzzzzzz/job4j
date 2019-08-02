package ru.job4j.loop;
/**
 * Factorial
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * Программа факториал чисел
 */
public class Factorial {
    /**
     *
     * @param n вводимое число
     * @return факториал числа
     */
    public int calc(int n) {
        if (n == 0)n = 1;
        int result = 0;
        for (int i = 1;i <= n;i++){
            result = i * i;
        }
        return result;
    }
}